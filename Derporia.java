package jdressel;
// James Dressel and James Robertson
// Based on the Hello.java example
// Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;

// Import Java Libraries
import java.io.*;


public class Derporia extends HttpServlet
{

   public void doGet  (HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException
   {

        res.setContentType ("text/html");
        PrintWriter out = res.getWriter ();

        out.println ("<HTML>");
        out.println ("<HEAD>");
        out.println ("<TITLE>A simple servlet program</TITLE>");
        out.println ("</HEAD>");

        out.println ("<BODY>");
        out.println ("<CENTER>");

        out.println (" <B>Hello!</B><BR> <!--  English -->");
  

        out.println ("</CENTER>");
        out.println ("</BODY>");

        out.println ("</HTML>");

        out.close ();

    }
}
