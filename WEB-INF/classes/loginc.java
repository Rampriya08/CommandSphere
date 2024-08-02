import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.*;   
public class loginc extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  {  
res.setContentType("text/html"); 
HttpSession session = req.getSession(); // request is HttpServletRequest object

PrintWriter pw=res.getWriter();

String uname= req.getParameter("uname");  
 
String pword = req.getParameter("pword");

         
          
          try
          {  
               Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/skill","root","icebear");
		     Statement st = con.createStatement();
  
               ResultSet rs = st.executeQuery("select * from register where uname='"+uname+"' and pword='"+pword+"'"); 
              
              if (rs.next()) {
               session.setAttribute("uname",uname);
               session.setAttribute("pword",pword);
                pw.print("<script>alert('Login Successfully!'); location.replace('/Skilll/home');</script>");  

              }
              else{
               pw.print("<script>alert('Login Failed!'); location.replace('index.jsp');</script>");  

              }
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
               pw.print(ex);
          }
          pw.close();  

}}  