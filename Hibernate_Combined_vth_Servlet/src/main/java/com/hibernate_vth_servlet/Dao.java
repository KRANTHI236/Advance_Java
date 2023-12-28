package com.hibernate_vth_servlet;

import jakarta.servlet.http.HttpServletRequest;

public class Dao {

	public static void insert(HttpServletRequest rq) {
		javax.persistence.EntityManagerFactory emf = javax.persistence.Persistence
				.createEntityManagerFactory("kranthi");
		javax.persistence.EntityManager em = emf.createEntityManager();
		javax.persistence.EntityTransaction et = em.getTransaction();
		Dto d1=new Dto();

		d1.setId(Integer.parseInt(rq.getParameter("id")));
		d1.setName(rq.getParameter("name1"));
		d1.setAge(Integer.parseInt(rq.getParameter("age")));
//		d1.getId();
//		d1.getName();
//		d1.getAge();
		et.begin();
		em.persist(d1);
		et.commit();

	}

}
