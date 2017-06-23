package hu.soter.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// A http kéréseket feldolgozó servletünk szinte mindig a HttpServlet osztályból származik
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		A req.getParameter metódussal lekérhetjük az url paraméterként küldött változók értékét
//		ebben az esetben a http://localhost:8080/servlet-example/elsoservlet?name=soter url begépelésénél
//		a name változó a soter értéket fogja felvenni.
//		ha több változót szeretnénk küldeni, azokat & jellel elválasztva tehetjük meg
//		...elsoservlet?name=soter&age=33&nationality=hun
		String name = req.getParameter("name");
		String message = "Hello Soter!";
		
//		itt kérjük el a servlet kontextus objektumot. Ezen keresztül érjük el
//		a szerver servlet konténerét
		ServletContext servletContext = getServletContext();
//		a kontextuson keresztül férünk hozzá többek között a <context-param> elemben
//		definiált változóinkhoz. Itt kérjük le a myEmail néven deklarált paraméterünket
		String myEmail = servletContext.getInitParameter("myEmail");
		
//		megvizsgáljuk hogy kaptunk e name néven url paramétert.
		if (name != null) {
//			ha igen, akkor ennek fogunk köszönni.
			message = "Hello " + name + "!";
		}
		
//		kiírunk a böngészőnek küldött válaszba.
		resp.getWriter().append(message + "\n" + myEmail);
	}
}
