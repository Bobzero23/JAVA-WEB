package com.servlet_config_servlet_context;

/*must import*/
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet_config_context extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		out.print("hello ");

		ServletConfig ctx = getServletConfig();
		/*this wiill give you the value of the attribute you specify*/
		String str = ctx.getInitParameter("name");

		/*displaying results*/
		out.println(str);

	}

}
