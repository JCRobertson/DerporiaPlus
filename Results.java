package jdressel;
// James Dressel and James Robertson
// Based on the Hello.java example
// Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;

// Import Java Libraries
import java.io.*;


public class Results extends HttpServlet
{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {

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
}
