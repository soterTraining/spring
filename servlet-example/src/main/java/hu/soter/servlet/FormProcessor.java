package hu.soter.servlet;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FormProcessor
 */
public class FormProcessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		A form által küldött kulcs érték párokra ugyanúgy hivatkozunk, mintha url paraméterek értékeit szeretnénk visszakapni
		String username = request.getParameter("form-username");
		String password = request.getParameter("form-password");
		
		
//		A session egy olyan változó, amiben kulcs - érték párokat tárolhatunk, miután létrehoztunk egyet.
//		Ezek az eltárolt objektumok egyszen addig megmaradnak, ameddig
//		 * a böngészőt le nem kapcsoljuk
//		 * a szervert újra nem indítjuk
//		 * a session timeout értéke le nem telik - session.setMaxInactiveInterval(<seconds>)
//		 * a session-t eldobjuk - session.invalidate();
		HttpSession session = request.getSession(true);
		
//		Beállítjuk session-username kulcshoz a username stringünket. Késöbb ezt a session.getAttribute("session-username")
//		metódussal tudjuk majd elérni
		session.setAttribute("session-username", username);
		
		
		String fifth = password.substring(5, 6);
		
//		ha beállítjuk a válasz (response) objektum tartalmát text/html-re, akkor már használhatunk html tag-eket a válaszunkban (<h2>, <div>, stb...)
		response.setContentType("text/html");
		response.getWriter()
		.append("The data you provided was: [username: " 
		+ username + "], [password: " + password + "] " + fifth)
		.append("<br /><br /><a href=\"nextpage\">link</a>");
	}

}
