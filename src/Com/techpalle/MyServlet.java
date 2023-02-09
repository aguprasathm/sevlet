package Com.techpalle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/My")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		
		pw.println("<h1>Application Form</h1>");
		
		pw.println("Name:<input type=\"text\" placeholder=\"Enter a name\" /> <br/><br/>");
		
		pw.println("Email:<input type=\"email\" placeholder=\"Enter a email\" /><br/><br/>");
		
		pw.println("Gender:<input type=\"radio\" id=\"rdmale\" name=\"gender\" />Male");
		
		pw.println("<input type=\"radio\" id=\"rdfemale\" name=\"gender\" />FeMale ");
	
		pw.println("<input type=\"radio\" id=\"rdfemale\" name=\"gender\" />Other <br/><br/>");
		
		pw.println("Course:<input type=\"Checkbox\"  />Java");
		
		pw.println("<input type=\"Checkbox\"  />Python"
		           +"<input type=\"Checkbox\"  />.net <br/><br/>");
		
		pw.println("<input type=\"Submit\" id=\"btnsubmit\" value=\"Submit\" /> <br/><br/>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		doGet(request, response);
	}

}
