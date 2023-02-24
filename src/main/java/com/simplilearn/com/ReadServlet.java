package com.simplilearn.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.simplilearn.com.Info;

@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		org.hibernate.SessionFactory sf = HibernateUtil.getSessionfactory();
		Session session = sf.openSession();
		List<Info> infos = session.createQuery("from Info").list();
        out.print("<h1> Student Details :- </h1>");
		out.print("<style> table,td,th {" + "border:2px solid black;" + "padding: 10px; " + "}</style>");
		out.print("<table >");
		out.print("<tr>");
		out.print("<th> Student Id</th>");
		out.print("<th> Student Name</th>");
		out.print("<th> Student PhoneNumber</th>");
		out.print("<th> Student Address</th>");
		out.print("<th> CourseName</th>");
        out.print("</tr>");

		for (Info info : infos) {
			out.print("<tr>");
			out.print("<td>" + info.getID() + "</td>");
			out.print("<td>" + info.getStudentName() + "</td>");
			out.print("<td>" + info.getStPhone() + "</td>");
			out.print("<td>" + info.getStAddress() + "</td>");
			out.print("<td>" + info.getCourseName() + "</td>");
			
			out.print("</tr>");
		}

		out.println("</table>");
		out.println("</br></br>");
		out.println("<center><a href=\"Class.html\">Add details of Student</a></center><br>");
		out.println("<center><a href=\"DashBoard.html\">DashBoard</a><br><br></center>");
		out.println("</body> </html>");
		session.close();
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doGet(req, resp);
	}
    
	}

