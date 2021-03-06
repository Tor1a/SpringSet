package com.practice.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.MemberDAO;
import utils.ScriptWriterUtil;
import vo.MemberVO;

@Controller
public class HomeController {
	
	
	
	@Autowired
	MemberDAO member_dao;
		
	public void setMember_dao(MemberDAO member_dao) {
		this.member_dao = member_dao;
	}
	
	@RequestMapping("/")
	public String main(Model model) {
		
		return "home";
	}
	
	
	@RequestMapping(value ="joinForm.do", method = RequestMethod.GET)
	public ModelAndView memberJoinForm(MemberVO vo) {
		ModelAndView mav = new ModelAndView();
		int count_custno = member_dao.count_custno();
				
		mav.addObject("custno", count_custno+1);
		mav.addObject("vo", vo);
		mav.setViewName("member/join");
		return mav;
	}
	
	@RequestMapping(value ="join.do", method = RequestMethod.POST)
	public void memberJoin(MemberVO vo, HttpServletResponse response) throws IOException {
		System.out.println(vo);
		int result = member_dao.insertMember(vo);
		
		if(result > 0) {
			  ScriptWriterUtil.alertAndNext(response, "회원가입이 완료되었습니다.", "list.do");
		  } else {
			  ScriptWriterUtil.alertAndBack(response, "회원가입에 실패했습니다.");
		  }
		
	}
	
	@RequestMapping(value ="list.do", method = RequestMethod.GET)
	public ModelAndView memberList() {
		List<MemberVO> memberList = member_dao.selectList();
		int total = member_dao.total();
		ModelAndView mav = new ModelAndView();
		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).getGrade().equals("A")) {
				memberList.get(i).setGrade("VIP");
			}else if(memberList.get(i).getGrade().equals("B")) {
				memberList.get(i).setGrade("일반");
			}else {
				memberList.get(i).setGrade("직원");
			}
		}
		mav.addObject("memberList", memberList);
		mav.addObject("total", total);
		mav.setViewName("member/list");
		return mav;
	}
	
	@RequestMapping(value ="updateForm.do", method = RequestMethod.GET)
	public ModelAndView memberUpdateForm(int custno) {
		MemberVO vo = member_dao.SelectCustno(custno);
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("vo", vo);
		mav.setViewName("member/update");
		System.out.println(custno);
		return mav;
	}
	@RequestMapping(value="update.do", method = RequestMethod.POST)
	public void memberupdate(MemberVO vo, HttpServletResponse response ) throws IOException {
		System.out.println(vo);
		int result = member_dao.memberUpdate(vo);
		List<MemberVO> memberList = member_dao.selectList();
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("memberList", memberList);
		
		if(result > 0) {
			  ScriptWriterUtil.alertAndNext(response, "수정이 완료되었습니다.", "list.do");
		  } else {
			  ScriptWriterUtil.alertAndBack(response, "수정에 실패했습니다.");
		  }	
	}
	@RequestMapping(value="money.do", method = RequestMethod.GET)
	public ModelAndView comparisonMoney() {
		List<MemberVO> memberList = member_dao.comparisonMoney();
		ModelAndView mav = new ModelAndView();
		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).getGrade().equals("A")) {
				memberList.get(i).setGrade("VIP");
			}else if(memberList.get(i).getGrade().equals("B")) {
				memberList.get(i).setGrade("일반");
			}else {
				memberList.get(i).setGrade("직원");
			}
		}
		mav.addObject("memberList", memberList);
		mav.setViewName("member/money");
		return mav;
	}
	
}
