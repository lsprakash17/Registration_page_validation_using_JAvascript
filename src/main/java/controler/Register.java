package controler;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Userdao;
import dto.User;
@WebServlet("/register")
public class Register extends HttpServlet 
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String name=req.getParameter("fname");
String lname=req.getParameter("lname");
long mobile=Long.parseLong(req.getParameter("mobile"));
String email=req.getParameter("email");
String gender=req.getParameter("gender");
String pass=req.getParameter("pwd");
Date dob=Date.valueOf(req.getParameter("dob"));
Userdao dao=new Userdao();
User user=new User();
user.setName(name);
user.setLname(lname);
user.setDob(dob);
user.setMobile(mobile);
user.setPass(pass);
user.setGender(gender);
user.setEmail(email);
dao.Save(user);
resp.getWriter().print("<h1 style='color:green'>Account Created Success</h1><br><br>");
resp.getWriter().print("<h1 style='color:blue'>Your UserId is : "+user.getId()+" </h1>");
req.getRequestDispatcher("Registration.html").include(req, resp);
}
}
