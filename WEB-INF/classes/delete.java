import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.*;   
public class delete extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  {  
res.setContentType("text/html"); 
PrintWriter pw=res.getWriter();

String id= req.getParameter("id");  


         
          
          try
          {  
               Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/skill","root","icebear");
		     Statement st = con.createStatement();
               PreparedStatement ps=con.prepareStatement("delete from message where id="+id+"");  
  
              
               
              
               int i = ps.executeUpdate();  
               if(i>0)  
               pw.print("<script>alert('Deleted Successfully'); location.replace('/Skilll/home');</script>");  
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
               pw.print(ex);
          }
          pw.close();  

}}  