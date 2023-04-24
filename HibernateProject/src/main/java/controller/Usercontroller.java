package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Userdao;
import model.User;

@WebServlet("/Usercontroller")
public class Usercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Usercontroller() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			User u = new User();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
//			System.out.println(u);
			new Userdao().InsertData(u);
			request.setAttribute("msg", "Data Registred");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("login")) {
			User u = new User();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			User d1 = new Userdao().userLogin(u);
			if(d1==null) {
				request.setAttribute("msg1", "Password Incorect");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("data", d1);
					request.getRequestDispatcher("home.jsp").forward(request, response);
			}
		}
	}
}