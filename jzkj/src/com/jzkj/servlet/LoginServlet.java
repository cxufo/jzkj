package com.jzkj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jzkjdataservice.service.Login;

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// Cookie
		Cookie cookies[] = request.getCookies();
		System.out.println("cookies长度"+cookies.length);
		String username = null;
		String password = null;
		String role = null;
		String isSavePassword = null;

		if (cookies.length>0) {
			for (int i = 0; i < cookies.length; i++) {
				String name = cookies[i].getName();
				if (null != cookies[i].getValue()) {
					switch (name) {
					case "username":
						username = cookies[i].getValue();
						System.out.println(name+"="+username);
						break;
					case "password":
						password = cookies[i].getValue();
						System.out.println(name+"="+password);
						break;
					case "role":
						role = cookies[i].getValue();
						System.out.println(name+"="+role);
						break;
					case "isSavePassword":
						isSavePassword = cookies[i].getValue();
						System.out.println(name+"="+isSavePassword);
						break;
					}
				}
			}
		}
		if (username != null && isSavePassword.equals("yes")) {
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.setAttribute("role", role);
			request.setAttribute("isSavePassword", isSavePassword);
			System.out.println("doget 设置用户名密码");
		}
		request.getRequestDispatcher("client/login.jsp").forward(request,
				response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = null;
		String role = null;
		String isSavePassword = null;
		String password = null;
		String sucess = null;
		if (null != request.getParameter("loginName"))
			username = request.getParameter("loginName");
		if (null != request.getParameter("loginPsw"))
			password = request.getParameter("loginPsw");
		if (null != request.getParameter("usertype"))
			role = request.getParameter("usertype");
		if (null != request.getParameter("remberPassword"))
			isSavePassword = request.getParameter("remberPassword");
		if (username == null && password == null && role != null) {
			sucess = "failed";
			request.setAttribute("sucess", sucess);
		} else {
			if (role.equals("person")) {
				Login login = new Login();
				String level = login.personLogin(username, password);
				System.out.println("-----------" + level);
				if (level != null) {
					// 登录成功
					sucess = "sucess";
					request.setAttribute("sucess", sucess);
					// 设置用户信息----------------------------
					request.setAttribute("level", level);
					request.setAttribute("username", username);
					request.setAttribute("password", password);
					request.setAttribute("role", role);
					// 设置session--------------------------
					HttpSession session = request.getSession();
					session.setAttribute("userLevel", level);
					session.setAttribute("userRole", role);
					// --------------------------------------------------------
					if (isSavePassword != null)
						request.setAttribute("isSavePassword", isSavePassword);

					if (isSavePassword.equals("yes")) {
						Cookie userNameCookie = new Cookie("username", username);
						Cookie userPasswordCookie = new Cookie("password",
								password);
						Cookie roleCookie = new Cookie("role", role);
						Cookie isSavePasswordCookie = new Cookie(
								"isSavePassword", isSavePassword);
						userNameCookie.setMaxAge(2592000); // 设置过期之前的最长时间
						userPasswordCookie.setMaxAge(2592000);
						roleCookie.setMaxAge(2592000); // 设置过期之前的最长时间
						isSavePasswordCookie.setMaxAge(2592000);
						response.addCookie(userNameCookie);
						response.addCookie(userPasswordCookie);
						response.addCookie(roleCookie);
						response.addCookie(isSavePasswordCookie);
					}
				} else {
					//登陆失败
					sucess = "failed";
					request.setAttribute("sucess", sucess);
				}
				request.getRequestDispatcher("client/login.jsp").forward(
						request, response);
			} else if (role.equals("company")) {
				Login login = new Login();
				String level = login.companyLogin(username, password);
				if (level != null) {
					//登陆成功
					sucess = "sucess";
					request.setAttribute("sucess", sucess);
					// 设置用户信息----------------------------
					request.setAttribute("level", level);
					request.setAttribute("username", username);
					request.setAttribute("password", password);
					request.setAttribute("role", role);

					HttpSession session = request.getSession();
					session.setAttribute("userLevel", level);
					session.setAttribute("userRole", role);

					if (isSavePassword != null)
						request.setAttribute("isSavePassword", isSavePassword);
					if (isSavePassword.equals("yes")) {
						Cookie userNameCookie = new Cookie("username", username);
						Cookie userPasswordCookie = new Cookie("password",
								password);
						Cookie roleCookie = new Cookie("role", role);
						Cookie isSavePasswordCookie = new Cookie(
								"isSavePassword", isSavePassword);
						userNameCookie.setMaxAge(2592000); // 设置过期之前的最长时间
						userPasswordCookie.setMaxAge(2592000);
						roleCookie.setMaxAge(2592000); // 设置过期之前的最长时间
						isSavePasswordCookie.setMaxAge(2592000);
						response.addCookie(userNameCookie);
						response.addCookie(userPasswordCookie);
						response.addCookie(roleCookie);
						response.addCookie(isSavePasswordCookie);
					}
				}else{
					//登陆失败
					sucess = "failed";
					request.setAttribute("sucess", sucess);
				}
				request.getRequestDispatcher("client/login.jsp").forward(
						request, response);
			}
		}

	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
