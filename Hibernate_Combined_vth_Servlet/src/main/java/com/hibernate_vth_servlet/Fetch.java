package com.hibernate_vth_servlet;

import jakarta.servlet.http.HttpServletRequest;

public class Fetch {

	public static Dto fetchData(HttpServletRequest request) {
		// TODO Auto-generated method stub
		javax.persistence.EntityManagerFactory emf = javax.persistence.Persistence
				.createEntityManagerFactory("kranthi");
		javax.persistence.EntityManager em = emf.createEntityManager();
		javax.persistence.EntityTransaction et = em.getTransaction();
		int n=Integer.parseInt(request.getParameter("id"));
		Dto d1 =	em.find(Dto.class,n);
		
		
	
		return d1;
	}

}
