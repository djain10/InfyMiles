
import java.util.HashMap;
import java.util.Map;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

import javax.servlet.RequestDispatcher;

import java.io.FileNotFoundException;

public class HomeServlet extends HttpServlet {

	
    protected void processReq(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
		
		String log = null;
	HttpSession session = request.getSession();
		if (request.getParameter("log")!=null){
		session.invalidate();
		
		 FileWriter fw = new FileWriter("C:/apache-tomcat-7.0.34/webapps/csj/data/cart.txt");
		BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
		pw.println("smartwatch,0");
        pw.close();
		log = "out";
		}
		if (log==null){
		if (session.getAttribute("username")!=null)
		showPage(response, "Welcome   ", (String) session.getAttribute("username"));
	else 
		showPage(response, "Welcome  to Smart Portables", null); 
		}else 
		showPage(response, "Welcome  to Smart Portables", null);
    } 
	
    
	
    protected void showPage(HttpServletResponse response,String message, String userid)
    throws ServletException, java.io.IOException {
		
	
		
       response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();
		Utilities utility = new Utilities();
		String header = utility.printHtml("C:/apache-tomcat-7.0.34/webapps/csj/Header.html");
		String footer = utility.printHtml("C:/apache-tomcat-7.0.34/webapps/csj/Footer.html");
		String LeftNav = utility.printHtml("C:/apache-tomcat-7.0.34/webapps/csj/LeftNav.html");		
        out.println("<html>");
out.println("<head>");
out.println("<meta http-equiv=\'Content-Type\' content=\'text/html; charset=utf-8\' />");
out.println("<title></title>");
out.println("<meta name=\'keywords\' content=\'\' />");
out.println("<meta name=\'description\' content=\'\' />");
out.println("<link href=\'http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900\' rel=\'stylesheet\' />");
out.println("<link href=\'template/default.css\' rel=\'stylesheet\' type=\'text/css\' media=\'all\' />");
out.println("<link href=\'template/fonts.css\' rel=\'stylesheet\' type=\'text/css\' media=\'all\' />");
out.println(" <link rel=\'stylesheet\' href=\'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\' integrity=\'sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\' crossorigin=\'anonymous\'>");
out.println("<meta http-equiv=\'Content-Type\' content=\'text/html; charset=utf-8\' />");
out.println("	<meta charset=\'utf-8\'>");
out.println("	<meta http-equiv=\'X-UA-Compatible\' content=\'IE=edge\'>");
out.println("	<meta name=\'viewport\' content=\'width=device-width, initial-scale=1\'>");
out.println("	<meta name=\'keywords\' content=\'footer, address, phone, icons\' />");
out.println("	<link rel=\'stylesheet\' href=\'template/demo.css\'>");
out.println("	<link rel=\'stylesheet\' href=\'template/footer.css\'>");
out.println("	<link rel=\'stylesheet\' href=\'http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\'>");
out.println("	  <meta name=\'viewport\' content=\'width=device-width, initial-scale=1\'>");
out.println("  <link rel=\'stylesheet\' href=\'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\'>");
out.println("  <script src=\'https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\'></script>");
out.println("  <script src=\'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\'></script>");
out.println("	<link href=\'http://fonts.googleapis.com/css?family=Cookie\' rel=\'stylesheet\' type=\'text/css\'>");
out.println("	<meta name=\'keywords\' content=\'\' />");
out.println("<meta name=\'description\' content=\'\' />");
out.println("<link href=\'http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900\' rel=\'stylesheet\' />");
out.println("<link href=\'template/default.css\' rel=\'stylesheet\' type=\'text/css\' media=\'all\' />");
out.println("<link href=\'template/fonts.css\' rel=\'stylesheet\' type=\'text/css\' media=\'all\' />");
out.println(" <link rel=\'stylesheet\' href=\'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\' integrity=\'sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\' crossorigin=\'anonymous\'>");
out.println(" </head>");
out.println("<body>");
out.println("<div id=\"page\" class=\"container\">");
out.println("<div id=\"logo\">");
out.println("		<a href=#>	<img src=\"template/images/logo.jpg\" align = \"left\" width=\"300\" height = \"250\" style=\"margin-left:30px;margin-top:30px\" /></a>");
if (userid==null)
out.println("<h3 align=\"center\">" + message + "</h3>");
else 
out.println("<h3 align=\"center\">" + message + userid + "</h3>");
out.println("		<a href=\"addCart\">	<img src=\"template/images/cart.jpg\" align = \"right\" width=\"100\" height = \"100\" style=\"margin-right:30px;margin-top:150px\" /></a>");
out.println("		</div>");
out.println("			<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>");
out.println("			<nav class=\"navbar navbar-inverse\">");
out.println("  <div class=\"container-fluid\">");
out.println("    <div class=\"navbar-header\">");
out.println("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">");
out.println("        <span class=\"sr-only\">Toggle navigation</span>");
out.println("        <span class=\"icon-bar\"></span>");
out.println("        <span class=\"icon-bar\"></span>");
out.println("        <span class=\"icon-bar\"></span>");
out.println("      </button>");
out.println("      <a class=\"navbar-brand\" href=\"#\">Smart Portables &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a>");
out.println("    </div>");
out.println("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">");
out.println("      <ul class=\"nav navbar-nav\">");
out.println("        <li ><a href=\"HomeServlet\"> Home &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class=\"sr-only\">(current) </span></a></li>");
out.println("        <li><a href=\"ProductServlet\"> Products &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a></li>");
out.println("		<li><a href=\"#\"> About us &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a></li>" +
		"<li><a href=\"#\"> F.A.Qs &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a></li>");
out.println("       </ul>");
out.println("       <ul class=\"nav navbar-nav navbar-right\">");
if (userid!=null){
	out.println("<li><a href=\"OrderViewServlet\">View Orders</a></li>");
out.println("        <li><a href=\"home.html\">Logout</a></li>");
}else {
out.println("<li><a href=\"login.html\">Login</a></li>");
out.println("<li><a href=\"RegisterServlet\">Register</a></li>");
}
out.println("      </ul>");
out.println("    </div>");
out.println("  </div>");
out.println(" </nav>");

out.println("<div class=\"container\"> ");
out.println("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">");
out.println("    <ol class=\"carousel-indicators\">");
out.println("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>");
out.println("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>");
out.println("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>");
out.println("    </ol>");
out.println(" <div class=\"carousel-inner\">");
out.println("      <div class=\"item active\"><a href=\"ProductServlet\">");
out.println("        <img src=\"template/images/macpro.jpg\" alt=\"macpro\" style=\"width:100%;height:400;\"></a>");
out.println("		 <div class=\"carousel-caption\">");
out.println("         <a href=\"ProductServlet\"><h3>MacBook Pro</h3></a>");
out.println("        </div>");
out.println("      </div>");
out.println("      <div class=\"item\"><a href=\"ProductServlet\">");
out.println("        <img src=\"template/images/skull.jpg\" alt=\"skull\" style=\"width:100%;height:400;\"></a>");
out.println("		<div class=\"carousel-caption\">");
out.println("         <a href=\"ProductServlet\"> <h3>Skull Candy</h3></a>");
out.println("		</div>");
out.println("      </div>");
out.println("      <div class=\"item\"><a href=\"ProductServlet\">");
out.println("        <img src=\"template/images/wd.jpg\" alt=\"wd\" style=\"width:100%;height:400;\"></a>");
out.println("		<div class=\"carousel-caption\">");
out.println("         <a href=\"ProductServlet\"> <h3>WD-My Passport </h3></a>");
out.println("		</div>");
out.println("      </div>");
out.println("    </div>");
out.println("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">");
out.println("      <span class=\"glyphicon glyphicon-chevron-left\"></span>");
out.println("      <span class=\"sr-only\">Previous</span>");
out.println("    </a>");
out.println("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">");
out.println("      <span class=\"glyphicon glyphicon-chevron-right\"></span>");
out.println("      <span class=\"sr-only\">Next</span>");
out.println("    </a>");
out.println("  </div>");
out.println("</div> ");
 out.println("<a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">");
 out.println("     <span class=\"glyphicon glyphicon-chevron-left\"></span>");
      out.println("<span class=\"sr-only\">Previous</span>");
    out.println("</a>");
    out.println("<a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">");
      out.println("<span class=\"glyphicon glyphicon-chevron-right\"></span>");
      out.println("<span class=\"sr-only\">Next</span>");
    out.println("</a>");
  out.println("</div>");
out.println("</div>");
out.println(footer);
out.close();
    }
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        processReq(request, response);
		  
    } 
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
         processReq(request, response);
    }
}
