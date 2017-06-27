package hu.soter.servlet_homework;

import java.util.List;

import hu.soter.servlet_homework.model.Pizza;

public class HtmlContentBuilder {

	public static String getPizzaListHtml(final String username, final List<Pizza> pizzas) {
		final StringBuilder sb = new StringBuilder();
		
		sb.append("<html><head><title>Get your order together</title><link href=\"resources/style.css\" type=\"text/css\" rel=\"stylesheet\"/></head><body>")
		.append("<div class=\"pane\">")
		.append("<h2>Hello " + username + "! Eat pizza 'cause it's healthy!</h2>")
		.append("<div class=\"pane inner\">");
		
		for (Pizza p : pizzas) {
			sb.append("<div class=\"row\"><div class=\"pizzaname\">" + p.getName() + "</div>")
			.append("<div class=\"pizzaprice currency\">" + p.getPrice() + "</div>")
			.append("<div class=\"buy\"><a href=\"processrequest?id=" + p.getId() + "\">Purchase</a></div></div>");
		}
		
		sb.append("<a class=\"button paybutton\" href=\"processpay\">Pay</a>")
		.append("</div>")
		.append("</div></body><script type=\"text/javascript\" src=\"resources/currency-formatter.js\"></script></html>");
		
		return sb.toString();
	}

	public static String getSummary(String username, List<Pizza> pizzas, int sumValue) {
		final StringBuilder sb = new StringBuilder();
		
		sb.append("<html><head><title>Thanks</title><link href=\"resources/style.css\" type=\"text/css\" rel=\"stylesheet\"/></head><body>")
		.append("<div class=\"pane\">")
		.append("<h2>Dear " + username + "! You bought the following pizzas:</h2>");
		if (pizzas == null || pizzas.size() == 0) {
			sb.append("<div class=\"warn\">Seems you didn't bought anything... thats sad :(</div>");
		} else {
			for (Pizza p : pizzas) {
				sb.append("<div class=\"row\"><div class=\"pizzaname\">" + p.getName() + "</div>")
				.append("<div class=\"pizzaprice currency\">" + p.getPrice() + "</div></div>");
			}
			
			sb.append("<div class=\"sum\"><div class=\"pizzaname\">Sum</div><div class=\"pizzaprice currency\">" + sumValue + "</div></div>")
			.append("<div class=\"goodbye\">Thanks, goodbye</div></body><script type=\"text/javascript\" src=\"resources/currency-formatter.js\"></script></html>");
		}
		return sb.toString();
	}

}
