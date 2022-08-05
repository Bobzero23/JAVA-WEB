package anotation;

/*must import*/
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*see this is how we use anotation*/
@WebServlet("/anotation")
public class Demo extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException  {
	
		PrintWriter out = response.getWriter();
		out.println("If you see this, it means ANOTATIONS WORKS!!!");
		
	}
}
