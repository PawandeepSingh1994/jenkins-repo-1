
package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.bean.todo;


public class TodoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		todo nt = new todo();
		nt.setName("PAWAN");
		nt.setPriority(1);
		mapper.writeValue(res.getOutputStream(), nt);
		
		
	}
	
}
