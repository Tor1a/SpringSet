package vo;

public class LecturerVO {
	private int idx;
	private String crName;
	private String major;
	private String field;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	@Override
	public String toString() {
		return "Lecturer_tbl [idx=" + idx + ", crName=" + crName + ", major=" + major + ", field=" + field + "]";
	}
	
	
}
