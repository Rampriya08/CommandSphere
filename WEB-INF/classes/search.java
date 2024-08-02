import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.*;   
public class search extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  {  
res.setContentType("text/html"); 

PrintWriter pw=res.getWriter();

String search=req.getParameter("search");

 


         pw.print("<!DOCTYPE html><html lang='en'><head><meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'><title>Home Page</title><link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'><link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css' /><script src='https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js'></script><script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script><link rel = 'stylesheet' href = 'https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'></head><body> <br><br> <br><br><div class='row mb-5'><form action='Skilll/search'><div class='col-lg-8 mx-auto'><div class='form-floating input-group mb-4'><input type='search' placeholder='Search here...' id='floatingInput' class='form-control' name='search'><label for='floatingInput'>Search Here.......</label><div class='input-group-append'><button id='button-addon5' type='submit' class='btn btn-primary' style='padding: 15px 20px; margin-left: 10px;'><i class='fa fa-search'></i></button></div> </form>  <form action='profile' method='POST'> <div class='input-group-append'><button  id='button-addon5' class='btn btn-secondary' style='padding: 15px 20px; margin-left: 20px; border:2px solid white;'> <i class='fa fa-user'></i></button> </div></form></div></div></div><div class='container mb-5' style='height: 400px; overflow:auto;border: 2px solid black;box-shadow: 10px 10px 10px rgb(226, 226, 226);' id='main'>");
          
          try
          {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/skill","root","icebear");
            Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from message where command like '"+search+"%'");  
              
              while(rs.next()) {
             
                pw.print("<br><div class='d-flex flex-column'><div class='card w-75 mb-3 p-2'><div class='card-body d-flex justify-content-between align-items-center'><div><h5 class='card-title'>"+rs.getString("uname")+"</h5><p class='card-text'>"+rs.getString("command")+"</p></div><form method='POST' action='/Skilll/delete?id="+rs.getString("id")+"' class='p-2'><button class='btn btn-danger rounded-circle border border-dark'><i class='fa fa-close'></i></button></form></div></div></div>");

              }
            
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
               pw.print(ex);
          }
          pw.print("</div><div class='row mb-5'><form action='/Skilll/addcommand' method='POST'><div class='col-lg-8 mx-auto'><div class='form-floating input-group  mb-4'><input type='text' class='form-control' id='floatingInput' placeholder='Command' name='cmd' ><label for='floatingInput'>Enter Command</label><div class='input-group-append'><button id='button-addon5' type='submit' class='btn btn-primary' style='padding: 15px 20px; margin-left: 10px;'><i class='fa fa-send'></i> </button></div></div></div></form></div></body></html>");
          pw.close();  

}}  