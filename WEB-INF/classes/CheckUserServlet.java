
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.*;
import java.io.PrintWriter;
import java.sql.ResultSet;


public class CheckUserServlet extends HttpServlet{
  int usersearch=0;
  //ArrayList<Pojo_user> list = new ArrayList<>();
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    HttpSession session = request.getSession(true);
    PrintWriter out = response.getWriter();
    String Uname="";
    String USERNAME=request.getParameter("username");
      String User=USERNAME.toLowerCase();
      
    
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/InfyMiles", "root", "root");
      String url = (String)session.getAttribute("url");
      String connuname = (String)session.getAttribute("connuname");
      String password = (String)session.getAttribute("password");



     //Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","Atos123");
      String sql = "SELECT lower(emailId) emailId FROM Register where lower(emailId)=?";
      PreparedStatement st = conn.prepareStatement(sql);
      st.setString(1,User);
      ResultSet rs = st.executeQuery();
      
      while(rs.next()){
        Uname=rs.getString("emailId");
      }
    }
    catch(Exception e){

    }
    if(User.equals(Uname)){     

      out.println("<font color=red>");
      out.print("User already exists");
      out.println("</font>");
    }
    else 
    {
      out.println("<font color=green>");
      out.print("Username Available");
      out.println("</font>");
    }
  }
}