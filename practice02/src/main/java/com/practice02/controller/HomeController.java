package com.practice02.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import dao.CourseDAO;
import utils.ScriptWriterUtil;
import vo.CourseVO;
import vo.LecturerVO;


@Controller
public class HomeController {
	

	
	@Autowired
	CourseDAO course_dao;
		
	
	public void setCourse_dao(CourseDAO course_dao) {
		this.course_dao = course_dao;
	}

//	@RequestMapping("/")
//	public String main(Model model) {
//		
//		return "home";
//	}
	
	@RequestMapping("/")
	public ModelAndView courseList() {
		int total = course_dao.total();
		ModelAndView mav = new ModelAndView();
		List<CourseVO> list = course_dao.courseList();
		
		for(int i=0; i<list.size(); i++) {
			switch(list.get(i).getWeek()) {
				case 1: list.get(i).setCrWeek("월"); break;
				case 2: list.get(i).setCrWeek("화"); break;
				case 3: list.get(i).setCrWeek("수"); break;
				case 4: list.get(i).setCrWeek("목"); break;
				case 5: list.get(i).setCrWeek("금"); break;
				case 6: list.get(i).setCrWeek("토");
			}
		}
		
		mav.addObject("total", total);
		mav.addObject("list", list);
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(value = "courseAddForm.do", method = RequestMethod.GET)
	public ModelAndView courseAddForm(CourseVO vo, String crId) {
		ModelAndView mav = new ModelAndView();
		List<LecturerVO> lcList = course_dao.lecturerList();
		int crIdCheck = course_dao.crIdCheck(vo.getCrId());
		
		mav.addObject("crId", crIdCheck);
		mav.addObject("lcList", lcList);
		mav.setViewName("course/add");
		return mav;
		
	}
	@RequestMapping(value = "courseAdd.do", method = RequestMethod.POST)
	public void courseAdd(CourseVO vo, HttpServletResponse response) throws IOException{
		int result = course_dao.CourseAdd(vo);
		
		
		if(result > 0) {
			ScriptWriterUtil.alertAndNext(response, "작성이 완료되었습니다", "/controller");
		}else {
			ScriptWriterUtil.alertAndBack(response, "작성이 실패했습니다");
		}
	}
	
	@RequestMapping(value = "deleteCourse.do", method = RequestMethod.GET)
	public void deleteCourse(int crId, HttpServletResponse response) throws IOException {
		int result = course_dao.deleteCourse(crId);
		
		
		if(result > 0) {
			ScriptWriterUtil.alertAndNext(response, "삭제 완료되었습니다", "/controller");
		}else {
			ScriptWriterUtil.alertAndBack(response, "삭제 실패했습니다");
		}
	}
	
	// 리스트에서 수정 클릭시 옵니다..
	@RequestMapping(value = "updateCourseForm.do", method = RequestMethod.GET)
	public ModelAndView updateCourseForm(int crId) {
		CourseVO vo = course_dao.selectCrId(crId);
		List<LecturerVO> lcList = course_dao.lecturerList();
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("vo", vo);
		mav.addObject("lcList", lcList);
		mav.setViewName("course/update");
		return mav;
	}
	
	@RequestMapping(value = "updateCourse.do" , method = RequestMethod.POST)
	public void updateCourse(CourseVO vo,HttpServletResponse response) throws IOException{
		int result = course_dao.updateCourse(vo);	
		 
		
		
		if(result > 0) {
			  ScriptWriterUtil.alertAndNext(response, "수정이 완료되었습니다.", "/controller");
		  } else {
			  ScriptWriterUtil.alertAndBack(response, "수정에 실패했습니다.");
		  }	
	}
	
	
}
