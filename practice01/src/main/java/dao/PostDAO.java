package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import vo.PostVO;
import vo.CommentVO;


public class PostDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insertPost(PostVO vo) {
		int result = sqlSession.insert("post.insertPost", vo);
		return result;
	}
	
	public PostVO selectIdx(int idx) {
		PostVO vo = sqlSession.selectOne("post.selectIdx", idx);
		return vo;
	}
	
	public PostVO LookupPost(int idx){
		PostVO vo = sqlSession.selectOne("post.LookupPost",idx);
		return vo;
	}
	
	public List<PostVO> listPost(){
		List<PostVO> list = sqlSession.selectList("post.listPost");
		return list;
	}
	
	public int updatePost(PostVO vo) {
		int result = sqlSession.update("post.updatePost", vo);
		return result;
	}
	
	public int deletePost(int idx) {
		int result = sqlSession.delete("post.deletePost", idx);
		int result1 = sqlSession.delete("post.deleteAllCmt",idx);
		
		
		return result + result1;
		
	}
	public int totalPost() {
		int totalPost = sqlSession.selectOne("post.totalPost");
		return totalPost;
	}
	
	
	
	
	//comment
	public int insertComment(CommentVO vo) {
		int result = sqlSession.insert("post.insertComment",vo);
		return result;
	}
	
	public List<CommentVO> commentList(int bidx){
		List<CommentVO> list = sqlSession.selectList("post.commentList",bidx);
		return list;
	}
	
	public int deleteComment(int idx) {
		int result = sqlSession.delete("post.deleteComment",idx);
		return result;
	}
	
}
