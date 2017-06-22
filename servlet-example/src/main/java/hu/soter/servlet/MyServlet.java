package hu.soter.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String message = "Hello Soter!";
		
		ServletContext servletContext = getServletContext();
		String myEmail = servletContext.getInitParameter("myEmail");
		
		if (name != null) {
			message = "Hello " + name + "!";
		}
		
		resp.getWriter().append(message + "\n" + myEmail);
	}
}
