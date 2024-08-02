import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.*;   
public class addcommand extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  {  
res.setContentType("text/html"); 
PrintWriter pw=res.getWriter();
HttpSession session = req.getSession();
String uname=(String) session.getAttribute("uname");
String cmd= req.getParameter("cmd");  


         
          
          try
          {  
               Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/skill","root","icebear");
		     Statement st = con.createStatement();
               PreparedStatement ps=con.prepareStatement("insert into message(uname,command) values(?,?)");  
  
               ps.setString(1,uname);  
               ps.setString(2,cmd);  
               
              
               int i = ps.executeUpdate();  
               if(i>0)  
               pw.print("<script>location.replace('/Skilll/home');</script>");  
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
               pw.print(ex);
          }
          pw.close();  

}}  