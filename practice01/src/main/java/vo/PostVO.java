package vo;

import java.sql.Date;

public class PostVO {
	private int idx;
	private String writer;
	private String subject;
	private String content;
	private Date date;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "PostVO [idx=" + idx + ", writer=" + writer + ", subject=" + subject + ", content=" + content + ", date="
				+ date + "]";
	}
	
	
	
}
