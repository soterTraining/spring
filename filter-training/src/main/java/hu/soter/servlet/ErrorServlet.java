package hu.soter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ErrorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final String errorMessage = (String) req.getAttribute("errorMessage");
		final HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper(resp);
		
		//responseWrapper.sendError(400, "Parameter in invalid state: username");
		responseWrapper.getWriter().append(errorMessage);
	}
	
	

}
