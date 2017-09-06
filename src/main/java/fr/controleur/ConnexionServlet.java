package fr.controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.sendRedirect(request.getContextPath() + "/views/connexion.html");
		// Actual logic goes here.
		// PrintWriter out = response.getWriter();
		// out.println("<h1>Bonjour</h1>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		//response.sendRedirect(request.getContextPath());
		 //PrintWriter out = response.getWriter();
		System.out.println("Coucou "+ request.getParameter("identifiant"));
		System.out.println("Coucou "+ request.getParameter("mot_de_passe"));
		response.sendRedirect(request.getContextPath() + "/views/connecte.html");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
