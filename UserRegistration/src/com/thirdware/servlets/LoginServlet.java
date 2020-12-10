package com.thirdware.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import java.util.regex.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		String patternname = "^[A-Z]{1}[a-z]+([\s][A-Z]{1}[a-z]+)*$";
		String patternemail = "^[a-zA-Z0-9]+([.+_-]{1}[a-zA-Z0-9]{3,}){0,2}\\@[a-zA-z]+\\.[a-z]{2,}([.]{1}[a-z]{2,}){0,2}$";
		String patternpassword = "^(?=.+[0-9])(?=.+[a-z])(?=.+[A-Z]).{8,}";
		
		PrintWriter out =  res.getWriter();
		if(Pattern.matches(patternname, name) && Pattern.matches(patternemail, email) && Pattern.matches(patternpassword, password)) 
		{
			res.setContentType("text/html");
			out.println("<body style=\"background-color: #00a1ab ; color: FFFFFF\"> </body>");
			out.println("<h1 style=\"text-align:center; margin: 100px\">Registration Successful<h1>");
			}
		else {
			res.setContentType("text/html");
			out.println("<body style=\"background-color: #00a1ab ; color: FFFFFF\"> </body>");
			out.println("<h1 style=\"text-align:center; margin: 100px;\">Registration Unsuccessful<h1>");
		}
	}

}
