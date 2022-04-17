package vo;

import java.sql.Date;

public class CommentVO {
	private int idx;
	private int bidx;
	private String writer;
	private String content;
	private Date date;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBidx() {
		return bidx;
	}
	public void setBidx(int bidx) {
		this.bidx = bidx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
		return "CommnetVO [idx=" + idx + ", bidx=" + bidx + ", writer=" + writer + ", content=" + content + ", date="
				+ date + "]";
	}
	
	
}
