package jdressel;
// James Dressel and James Robertson
// Based on the Hello.java example
// Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;

// Import Java Libraries
import java.io.*;


public class Results extends HttpServlet {

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	res.setContentType ("text/html");
	PrintWriter out = res.getWriter ();

	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
	out.println("<meta charset=\"UTF-8\">");
	out.println("<title>Derporia: the never-ending land of claims</title>");
	out.println("</body>");
	out.println("</html>");

        out.close ();

    }

public void doPost(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
	//If this was a production system the input should be carefully checked. 
	String claim = request.getParameter("claim").toString();
	String assertions = request.getParameter("assertions").toString();
	res.setContentType ("text/html");
	PrintWriter out = res.getWriter ();

	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
	out.println("<meta charset=\"UTF-8\">");
	out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://mason.gmu.edu/~jrobertq/derporia/derporiaStyle.css\">");
	out.println("<title>Derporia: the never-ending land of claims</title>");
	out.println(claim);
	out.println(assertions);
	out.println("</body>");
	out.println("</html>");

        out.close ();
}
}
