import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.*;   
public class register extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  {  
res.setContentType("text/html"); 
PrintWriter pw=res.getWriter();

String uname= req.getParameter("uname");  
String email = req.getParameter("email"); 
String phoneno= req.getParameter("phno"); 
String pword = req.getParameter("pword");

         
          
          try
          {  
               Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/skill","root","icebear");
		     Statement st = con.createStatement();
               PreparedStatement ps=con.prepareStatement("insert into register(uname,email,phoneno,pword) values(?,?,?,?)");  
  
               ps.setString(1,uname);  
               ps.setString(2,email);  
               ps.setString(3,phoneno);
               ps.setString(4,pword);  
              
               int i = ps.executeUpdate();  
               if(i>0)  
               pw.print("<script>alert('Registered Successfully! Please Login to Continue') ; location.replace('index.jsp');</script>");  
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
               pw.print(ex);
          }
          pw.close();  

}}  