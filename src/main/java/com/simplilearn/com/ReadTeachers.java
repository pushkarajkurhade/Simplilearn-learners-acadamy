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

@WebServlet("/ReadTeachers")
public class ReadTeachers extends HttpServlet {

	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		org.hibernate.SessionFactory sf = HibernateUtil.getSessionfactory();
		Session session = sf.openSession();
		List<Info2> infoss = session.createQuery("from Info2").list();
        out.print("<h1> Teacher Details :- </h1>");
		out.print("<style> table,td,th {" + "border:2px solid black;" + "padding: 10px; " + "}</style>");
		out.print("<table >");
		out.print("<tr>");
		out.print("<th> Teacher Id</th>");
		out.print("<th> Teacher Name</th>");
		out.print("<th> Teacher PhoneNumber</th>");
		out.print("<th> Teacher Address</th>");
		out.print("<th> Assigned Class</th>");
		out.print("</tr>");

		for (Info2 info : infoss) {
			out.print("<tr>");
			out.print("<td>" + info.getID() + "</td>");
			out.print("<td>" + info.getTeacherName() + "</td>");
			out.print("<td>" + info.getTeacherPhone() + "</td>");
			out.print("<td>" + info.getTeacherAddress() + "</td>");
			out.print("<td>" + info.getClassName() + "</td>");
			out.print("</tr>");
		}

		out.println("</table>");
		out.println("</br></br>");
		out.println("<center><a href=\"Teacher.html\">Add Details of Teacher</a></center><br>");
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
