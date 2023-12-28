package com.hibernate_vth_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/hibernate_vth_servlet")
public class Hibernate_Vth_Servlet extends jakarta.servlet.http.HttpServlet {

	protected void doPost(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {

		Dao.insert(request);
	Dto d=Fetch.fetchData(request);
	PrintWriter p=response.getWriter();
	p.println("welcome to website "+d.getName());
		System.out.println("hi");
	}

}
