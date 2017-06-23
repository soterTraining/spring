package hu.soter.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NextPage
 */
public class NextPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		itt kérjük el a session objektumunkat
		HttpSession session = request.getSession();
		
//		és kivesszük belőle a korábban beletett username stringünket. Ha nem tettünk volna ezzel a kulcsal
//		értéket a sessionba, akkor null értékkel tér vissza.
		String username = (String) session.getAttribute("session-username");

		response.getWriter().append(username);
	}

}
