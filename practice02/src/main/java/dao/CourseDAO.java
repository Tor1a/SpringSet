package dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import vo.CourseVO;
import vo.LecturerVO;

public class CourseDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int total() {
		int total = sqlSession.selectOne("course.total");
		return total;
	}
	
	public int CourseAdd(CourseVO vo) {
		int result = sqlSession.insert("course.CourseAdd",vo);
		return result;
	}
	
	public int crIdCheck(String crId) {
		int crIdCheck = sqlSession.selectOne("course.crIdCheck", crId);
		return crIdCheck;
	}
	
	
	public List<CourseVO> courseList(){
		List<CourseVO> list = sqlSession.selectList("course.courseList");
		return list;
	}
	
	public CourseVO selectCrId(int crId) {
		CourseVO vo = sqlSession.selectOne("course.selectCrId",crId);
		return vo;
	}
	
	
	public int updateCourse(CourseVO vo) {
		int result = sqlSession.update("course.updateCourse", vo);
		return result;
	}
	
	public int deleteCourse(int crId) {
		int result = sqlSession.delete("course.deleteCourse",crId);
		return result;
	}
	
	
	
	
	//lecturer
	public List<LecturerVO> lecturerList(){
		List<LecturerVO> lcList = sqlSession.selectList("lecturer.lecturerList");
		return lcList;
	}
	
}
