package com.simplilearn.com;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/loginadmin")
public class adminlogin extends HttpServlet {

		private static final long serialVersionUID = 1L;

		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			//add top nav 
			request.getRequestDispatcher("index.jsp").include(request, response);
			
			// fetch data from form
			String username = request.getParameter("name");
			String password = request.getParameter("password");
			
			try {
				// 1. build hibernate session factory
				 SessionFactory factor= HibernateUtil.getSessionfactory();
				
				Session session = factor.openSession();
				int f=0;
				List<admin> obj = session.createQuery("from admin").list();
				for(admin i:obj) {
					String x=i.getName();
					String y=i.getPassword();
					if(x.equals(username)&&y.equals(password)) {
						//response.sendRedirect("bookflight.html");
						f=1;
					}
				}
				if(f==1) {
					session.close();
					HttpSession s=request.getSession();
				
					response.sendRedirect("DashBoard.html");
					
				}
				else {
					out.print("<h3> Login failed ! </h3>");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}