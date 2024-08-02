import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.*;   
public class update extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  {  
res.setContentType("text/html"); 
PrintWriter pw=res.getWriter();
HttpSession session = req.getSession(); 

String uname= req.getParameter("uname");  
String email = req.getParameter("email"); 
String phoneno= req.getParameter("phno"); 
String pword = req.getParameter("pword");

         
          
          try
          {  
               Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/skill","root","icebear");
		     Statement st = con.createStatement();
               PreparedStatement ps=con.prepareStatement("update register set uname='"+uname+"',pword='"+pword+"',phoneno='"+phoneno+"' WHERE email='"+email+"'");  
  
               
               session.setAttribute("uname",uname);
               session.setAttribute("pword",pword);
               int i = ps.executeUpdate();  
               if(i>0)  
               pw.print("<script>alert('Updated Successfully!') ; location.replace('/Skilll/home');</script>");  
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
               pw.print(ex);
          }
          pw.close();  

}}  