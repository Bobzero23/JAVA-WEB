package com.bobzero;

import java.io.IOException;
import java.io.PrintWriter;

/*must imports*/
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("Hello Bobzero");
	}
}
