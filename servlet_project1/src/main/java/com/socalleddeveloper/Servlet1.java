package com.socalleddeveloper;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/servlet1")
public class Servlet1 extends jakarta.servlet.http.HttpServlet {

	protected void doPost(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {

		Dao.developer(request);
		System.out.println("hai");
	}

}
