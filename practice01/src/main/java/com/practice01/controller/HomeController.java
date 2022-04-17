package com.practice01.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import dao.PostDAO;
import utils.ScriptWriterUtil;
import vo.PostVO;
import vo.CommentVO;

@Controller
public class HomeController {
	

	
	@Autowired
	PostDAO post_dao;
		
	public void setPost_dao(PostDAO post_dao) {
		this.post_dao = post_dao;
	}
	
//	@RequestMapping("/")
//	public String main(Model model) {
//		
//		return "home";
//	}
	
	@RequestMapping("/")
	public ModelAndView listPost() {
		List<PostVO> list = post_dao.listPost();
		int totalPost = post_dao.totalPost();
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", list);
		mav.addObject("totalPost", totalPost);
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(value = "writeForm.do", method = RequestMethod.GET)
	public ModelAndView postWriteForm(PostVO vo) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("vo", vo);
		mav.setViewName("post/write");
		return mav;
	}
	@RequestMapping(value = "write.do", method = RequestMethod.POST)
	public void postWirte(PostVO vo, HttpServletResponse response) throws IOException{
		System.out.println("test: "+ vo.getWriter());
		int result = post_dao.insertPost(vo);
		
		if(result > 0) {
			ScriptWriterUtil.alertAndNext(response, "작성이 완료되었습니다", "/controller");
		}else {
			ScriptWriterUtil.alertAndBack(response, "작성이 실패했습니다");
		}
	}
	
	@RequestMapping(value = "lookUp.do", method = RequestMethod.GET)
	public ModelAndView LookupPost(int idx) {
		PostVO vo = post_dao.LookupPost(idx);
		List<CommentVO> list = post_dao.commentList(idx); 
		ModelAndView mav = new ModelAndView();
	
		mav.addObject("list", list);
		mav.addObject("vo", vo);
		mav.setViewName("post/Lookup");
		return mav;
	}
	
	@RequestMapping(value="updatForm.do", method = RequestMethod.GET)
	public ModelAndView updatePostForm(int idx) {
		ModelAndView mav = new ModelAndView();
		PostVO vo = post_dao.LookupPost(idx);
		
		mav.addObject("vo", vo);
		mav.setViewName("post/update");
		
		return mav;
	}
	
	@RequestMapping(value = "update.do", method = RequestMethod.POST)
	public void updatePost(PostVO vo, HttpServletResponse response) throws IOException {
		int result = post_dao.updatePost(vo);
		
		if(result > 0) {
			ScriptWriterUtil.alertAndNext(response, "수정이 완료되었습니다", "/controller/lookUp.do?idx="+vo.getIdx());
		}else {
			ScriptWriterUtil.alertAndBack(response, "수정에 실패했습니다");
		}
	}
	
	@RequestMapping(value = "delete.do",method = RequestMethod.GET)
	public void deletePost(int idx, HttpServletResponse response) throws IOException {	
		int result = post_dao.deletePost(idx);
		
		if(result > 0) {
			ScriptWriterUtil.alertAndNext(response, "삭제가 완료되었습니다", "/controller/");
		}else {
			ScriptWriterUtil.alertAndBack(response, "삭제를 실패했습니다");
		}
	
	}
	
	
	
	//comment
	@RequestMapping(value = "CommentAdd.do", method = RequestMethod.POST)
	public void insertCommnet(CommentVO vo,HttpServletResponse response) throws IOException {
		int result = post_dao.insertComment(vo);
		ModelAndView mav = new ModelAndView();
		
		if(result > 0) {
			ScriptWriterUtil.alertAndNext(response, "댓글 작성이 완료되었습니다", "/controller/lookUp.do?idx="+vo.getBidx());
		}else {
			ScriptWriterUtil.alertAndBack(response, "댓글 작성에 실패했습니다");
		}
	}
	
	@RequestMapping(value = "CommentDel.do", method = RequestMethod.GET)
	public void deleteComment(CommentVO vo, int idx, HttpServletResponse response) throws IOException {
		int result = post_dao.deleteComment(idx);
		
		if(result > 0) {
			ScriptWriterUtil.alertAndNext(response, "댓글을 삭제했습니다", "/controller/lookUp.do?idx="+vo.getIdx());
		}else {
			ScriptWriterUtil.alertAndBack(response, "댓글 삭제를 실패했습니다");
		}
	}
	
}
