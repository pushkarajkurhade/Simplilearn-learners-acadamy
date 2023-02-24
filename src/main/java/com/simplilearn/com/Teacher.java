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


@WebServlet("/Teacher")
public class Teacher extends HttpServlet {
	
    	
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
				// TODO Auto-generated method stub
				PrintWriter out = resp.getWriter();
	    		resp.setContentType("text/html");
	    	    String teacherName=req.getParameter("teacherName");
	    	    String teacherPhone=req.getParameter("teacherPhone");
	    	    String teacherAddress=req.getParameter("teacherAddress");
	    	    String className=req.getParameter("className");
	    	    
	    	    
	    	    Info2 info=new Info2(teacherName,teacherPhone,teacherAddress, className);
	    	    
	    	    SessionFactory ff= HibernateUtil.getSessionfactory();
	    		Session session= ff.openSession();
	    		
	    		
	    		Transaction tx=session.beginTransaction();
	    		 session.save(info);
	    		 
	    		 tx.commit();
	    		 System.out.println("Data Added Successfully");
	    		 session.close();  
	    			
	    		 resp.sendRedirect("DashBoard.html");
	    		}
	    	
			
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
				// TODO Auto-generated method stub
				doGet(req, resp);
			}
    	

}
