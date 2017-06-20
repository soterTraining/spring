package hu.soter.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ErrorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final String errorMessage = (String) req.getAttribute("errorMessage");
		
		//final HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper(resp);
		
		//responseWrapper.sendError(400, "Parameter in invalid state: username");
		//responseWrapper.getWriter().append(errorMessage);
		resp.getWriter().append(String.format("<div class=\"error\">%s</div>", Objects.toString(errorMessage, "Unknown error happened.")));
	}
	
	

}
