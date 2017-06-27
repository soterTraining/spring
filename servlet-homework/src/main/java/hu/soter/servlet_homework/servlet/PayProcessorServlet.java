package hu.soter.servlet_homework.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hu.soter.servlet_homework.HtmlContentBuilder;
import hu.soter.servlet_homework.model.Pizza;

/**
 * Servlet implementation class PayProcessorServlet
 */
public class PayProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		final HttpSession session = request.getSession(false);
		if (session == null) {
			throw new IllegalStateException();
		}
		
		final String username = (String) session.getAttribute("loggedInUser");
		List<Pizza> pizzas = (List<Pizza>) session.getAttribute("pizzaList");
		if (username == null) {
			throw new IllegalStateException();
		}
		if (pizzas == null) {
			pizzas = new ArrayList<>();
		}
		
		session.invalidate();
		response.getWriter().println(HtmlContentBuilder.getSummary(username, pizzas, calculateSum(pizzas)));
	}

	private int calculateSum(List<Pizza> pizzas) {
		int sum = 0;
		
		for (Pizza p : pizzas) {
			sum += p.getPrice();
		}
		
		return sum;
	}
}
