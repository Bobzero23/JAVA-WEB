package com.bobzero;

/*must imports*/
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*main class*/
public class Addition extends HttpServlet {

	/* this is the only method with class HttpServlet for now*/
	public void service(HttpServletRequest req, HttpServletResponse res) {

		/*fetching the values from html file*/
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		/*calculation*/
		int k = (j + i);
	}

}
