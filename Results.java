package jdressel;
// James Dressel and James Robertson
// Based on the Hello.java example
// Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;

// Import Java Libraries
import java.io.*;


public class Results extends HttpServlet {

private String claim;
private String assertions;
private int disagree = 0;
private int unsure = 0;
private int convinced = 0;

public void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
	claim = request.getParameter("claim").toString();
	assertions = request.getParameter("assertions").toString();



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
	claim = request.getParameter("claim").toString();
	assertions = request.getParameter("assertions").toString();

	res.setContentType ("text/html");
	PrintWriter out = res.getWriter ();

	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
	out.println("<meta charset=\"UTF-8\">");
	out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://mason.gmu.edu/~jrobertq/derporia/derporiaStyle.css\">");
	out.println("<title>" + claim + "</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>Derporia: the never-ending land of <del>baseless</del> claims</h1>");
	out.println("<hr>");
	out.println("<p>");
	out.println("The claim: ");
	out.println("<br>");
	out.println("<b><font color=\"#5F04B4\">"+ claim +"</font></b>");
	out.println("<br><br>");
	out.println("Evidence:");
	out.println("<br>");
	out.println("<b><font color=\"#5F04B4\">" + assertions + "</font></b>");
	out.println("</p>");
	out.println("<br>");
	out.println("<table class=\"center\" border=\"1\">");
	out.println("<tbody><tr>");
	out.println("<td>");
	out.println("<table width=\"100%\">");
	out.println("<tbody><tr>");
	out.println("<td align=\"left\">");
	out.println("<button type=\"button\" name=\"disagree\">Disagree</button> ");
	out.println("</td>");
	out.println("<td align=\"center\">");
	out.println("<button onclick=\"location.href='http://apps-swe432.vse.gmu.edu:8080/swe432/servlet/jdressel.Results?claim=" + claim + "&assertions="+ assertions +"&disagree="+disagree+"&unsure="+(unsure+1)+"&convinced="+convinced+"'\" type=\"button\" name=\"unsure\">Unsure</button>");
	out.println("</td>");
	out.println("<td align=\"right\">");
	out.println("<button type=\"button\" name=\"convinced\">Convinced</button> ");
	out.println("</td>");
	out.println("</tr>");
	out.println("</tbody></table>");
	out.println("</td>");
	out.println("</tr>");
	out.println("</tbody></table>");
	out.println("</body>");
	out.println("</html>");

        out.close ();
}
}
