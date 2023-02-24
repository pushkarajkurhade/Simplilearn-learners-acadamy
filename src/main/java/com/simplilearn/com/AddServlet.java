package com.simplilearn.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		
	    String studentName=req.getParameter("studentName");
	    String stPhone=req.getParameter("stPhone");
	    String stAddress=req.getParameter("stAddress");
	    String courseName=req.getParameter("courseName");
        
	    Info info=new Info(studentName, stPhone,stAddress, courseName);
	    
	    SessionFactory ss= HibernateUtil.getSessionfactory();
		Session session= ss.openSession();
		
		Transaction tx=session.beginTransaction();
		 session.save(info);
		 
		 tx.commit();
		 out.print("Data Added Successfully");
		 session.close();  
			
		 resp.sendRedirect("DashBoard.html");
		}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	}


