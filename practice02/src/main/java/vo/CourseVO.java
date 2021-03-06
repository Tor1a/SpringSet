package vo;

public class CourseVO {
	private String crId;
	private String crName;
	private int credit;
	private String lecturer;
	private int week;
	private String crWeek;
	private int start_hour;
	private int end_end;
	private String strId;
	private String lec_name;

	public String getCrId() {
		return crId;
	}
	public void setCrId(String crId) {
		this.crId = crId;
	}
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public String getCrWeek() {
		return crWeek;
	}
	public void setCrWeek(String crWeek) {
		this.crWeek = crWeek;
	}
	public int getStart_hour() {
		return start_hour;
	}
	public void setStart_hour(int start_hour) {
		this.start_hour = start_hour;
	}
	public int getEnd_end() {
		return end_end;
	}
	public void setEnd_end(int end_end) {
		this.end_end = end_end;
	}
	
	
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	
	public String getLec_name() {
		return lec_name;
	}
	public void setLec_name(String lec_name) {
		this.lec_name = lec_name;
	}
	@Override
	public String toString() {
		return "CourseVO [crId=" + crId + ", crName=" + crName + ", credit=" + credit + ", lecturer=" + lecturer
				+ ", week=" + week + ", crWeek=" + crWeek + ", start_hour=" + start_hour + ", end_end=" + end_end
				+ ", strId=" + strId + "]";
	}
	
	
	
	
}
