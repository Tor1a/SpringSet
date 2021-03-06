package utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ScriptWriterUtil {
	
	public static void init(HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
	}
	public static void confirm(HttpServletResponse response, String confirmMessage) throws IOException {
		init(response);
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("confirm('"+confirmMessage+"');");
		out.println("</script>");
		out.flush();
	}
	public static void alertAndBack(HttpServletResponse response, String alertMessage) throws IOException {
		init(response);
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('"+alertMessage+"');");
		out.println("history.back();");
		out.println("</script>");
		out.flush();
	}
	
	public static void alertAndNext(HttpServletResponse response, String alertMessage,String next) throws IOException {
		init(response);
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('"+alertMessage+"');");
		out.println("location.href='"+next+"'");
		out.println("</script>");
		out.flush();
	}
}