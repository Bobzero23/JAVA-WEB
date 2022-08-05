package com.addition;

import java.io.IOException;

import java.io.PrintWriter;

/*must imports*/
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*main class*/
@SuppressWarnings("serial")
public class Addition extends HttpServlet {

	/* this is the only method with class HttpServlet for now*/
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		/*fetching the values from html file*/
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		/*calculation*/
		int k = j + i;

		/*displaying results*/
		PrintWriter out = res.getWriter();
		out.println("The result of addition is : " + k);

	}

}
