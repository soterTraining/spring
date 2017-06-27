package hu.soter.servlet_homework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import hu.soter.servlet_homework.HtmlContentBuilder;
import hu.soter.servlet_homework.exception.InvalidUsernameException;
import hu.soter.servlet_homework.model.Pizza;

/**
 * This servlet is responsible for user name check
 * In case of invalid user name (empty) it throws an InvalidUserNameException which will be handled by the server. It will redirect to the username-error.html page
 * In case of valid user name it will be persisted to the session.
 */
public class UserNameProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<Pizza> PIZZAS;
	
	static {
		PIZZAS = new ArrayList<>();
		
		PIZZAS.add(new Pizza(1l, "Cheese Pizza", 1000));
		PIZZAS.add(new Pizza(2l, "Ham Pizza", 1500));
		PIZZAS.add(new Pizza(3l, "Mushroom Pizza", 800));
	}
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getParameter("username");
		if (username == null || username.isEmpty()) {
			throw new InvalidUsernameException();
		}
		
		request.getSession().setAttribute("loggedInUser", username);
		
		response.setContentType("text/html");
		response.getWriter().println(HtmlContentBuilder.getPizzaListHtml(username, PIZZAS));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final HttpSession session = req.getSession(false);
		final Long pizzaId = Long.valueOf(req.getParameter("id"));
		if (session == null) {
			throw new IllegalStateException();
		}
		
		
		List<Pizza> pizzaList = (List<Pizza>) session.getAttribute("pizzaList");
		if (pizzaList == null) {
			pizzaList = new ArrayList<>();
		}
		
		String username = (String) session.getAttribute("loggedInUser");
		
		pizzaList.add(findPizzaById(pizzaId));
		
		session.setAttribute("pizzaList", pizzaList);
		
		resp.setContentType("text/html");
		resp.getWriter().println(HtmlContentBuilder.getPizzaListHtml(username, PIZZAS));
	}

	private Pizza findPizzaById(Long pizzaId) {
		Pizza p = null;
		
		for (Pizza pizza : PIZZAS) {
			if (pizzaId.equals(pizza.getId())) {
				p = pizza;
			}
		}
		
		if (p == null) {
			throw new IllegalStateException();
		}
		
		return p;
	}
	
}