package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import vo.MemberVO;


public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
//	public List<String> memberList(){
//		List<String> list = sqlSession.selectList("member.selectMember");
//		return list;
//	}
	
	public int insertMember(MemberVO vo){
		int result = sqlSession.insert("member.insertMember", vo);
		return result;
	}
	
	public int count_custno() {
		int count_custno = sqlSession.selectOne("member.selectOne");
		return count_custno;
	}
	public List<MemberVO> selectList(){
		List<MemberVO> memberList = sqlSession.selectList("member.memberList");
		return memberList;
	}
	
	public MemberVO SelectCustno(int custno) {
		MemberVO vo  = sqlSession.selectOne("SelectCustno", custno);
		return vo;
	}
	
	public int memberUpdate(MemberVO vo) {
		int result = sqlSession.update("member.memberUpdate", vo);
		return result;
	}
	public List<MemberVO> comparisonMoney() {
		List<MemberVO> list = sqlSession.selectList("comparisonMoney");
		return list;
	}
	public int total() {
		int total = sqlSession.selectOne("member.total");
		return total;
	}
	
}
