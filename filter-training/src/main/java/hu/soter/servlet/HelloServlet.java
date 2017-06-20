package hu.soter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		final String[] usernames = req.getParameterValues("username");
		
		if (isInInvalidState(usernames)) {
			HttpServletRequestWrapper requestWrapper = new HttpServletRequestWrapper(req);
			requestWrapper.setAttribute("errorMessage", "Invalid username state.");
			
			getServletContext().getRequestDispatcher("/error").forward(requestWrapper, resp);
			
			return;
		} 
		
		final String message = String.format("<h1>Hello %s!!!</h1>", usernames[0]);
		
		resp.getWriter().append(message);
	}

	private boolean isInInvalidState(String[] usernames) {
		return usernames == null || usernames.length <= 0 || usernames.length > 1;
	}

}
