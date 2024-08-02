import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.*;   
public class profile extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  {  
res.setContentType("text/html"); 
HttpSession session = req.getSession(); // request is HttpServletRequest object

PrintWriter pw=res.getWriter();

String uname=(String) session.getAttribute("uname");
 
String pword=(String) session.getAttribute("pword");

         
          
          try
          {  
               Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/skill","root","icebear");
		     Statement st = con.createStatement();
  
               ResultSet rs = st.executeQuery("select * from register where uname='"+uname+"' and pword='"+pword+"'"); 
              
              if (rs.next()) {

               pw.print("<!DOCTYPE html><html lang='en'><head><meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'><title>ProfileS Page</title><link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'><link rel = 'stylesheet' href = 'https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'><link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css'><style>body {color: black;}#login {text-align: margin-top: 150px;center;justify-content: center;align-items: center;border: 2px solid rgb(233, 163, 192);border-radius: 10px;box-shadow: 10px 10px 10px rgb(233, 163, 192);}</style><script> function clickedk(){location.replace('/Skilll/home');}</script></head><body>");               
               pw.print("        <button type='submit' onclick='clickedk()' nama='home' id='button-addon5' class='btn btn-info' style='padding: 15px 20px; margin-left: 20px; border:2px solid black;'><i class='fa fa-arrow-left'></i></button>");
               pw.print("<div class='container-fluid' id='login' style='width:40%;'><form action='/Skilll/update' method='POST' ><br><div class='form-floating'><input type='text' class='form-control' placeholder='username' name='uname' id='floatingInputGroup1' value='"+rs.getString("uname")+"'><label for=\"floatingInputGroup1\">Username</label></div><br><br><div class='form-floating'><input type='email' class='form-control' id='floatingInputGroup2' placeholder='name@gmail.com' name='email' value='"+rs.getString("email")+"' readonly>  <label for=\"floatingInputGroup2\">Email Address</label></div><br><br><div class='form-floating'><input type='text' class='form-control' id='floatingInputGroup3' placeholder='phone number' name='phno' value='"+rs.getString("phoneno")+"'> <label for=\"floatingInputGroup3\">Phone Number</label></div><br><br><div class='form-floating'><input type='text' class='form-control' id='floatingPassword' placeholder='Password' name='pword' value='"+rs.getString("pword")+"'><label for=\"floatingPassword\">Password</label></div><br><input type='submit' value='Update' class='btn btn-warning' style='border: 2px solid black;'> </form></<br><br></div>");
              }
              else{
               pw.print("<script>alert('Unexpected Error!'); location.replace('Skilll/home');</script>");  

              }
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
               pw.print(ex);
          }
          pw.close();  

}}  