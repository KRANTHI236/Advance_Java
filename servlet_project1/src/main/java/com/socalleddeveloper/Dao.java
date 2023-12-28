package com.socalleddeveloper;


import jakarta.servlet.http.HttpServletRequest;

public class Dao {

	public static void developer(HttpServletRequest rq) {

		javax.persistence.EntityManagerFactory emf = javax.persistence.Persistence
				.createEntityManagerFactory("kranthi");
		javax.persistence.EntityManager em = emf.createEntityManager();
		javax.persistence.EntityTransaction et = em.getTransaction();

		Dto d1 = new Dto();
		d1.setId(Integer.parseInt(rq.getParameter("id")));
		d1.setFname(rq.getParameter("fname"));
		d1.setLname(rq.getParameter("lname"));
		d1.setAge(Integer.parseInt(rq.getParameter("age")));

		et.begin();
		em.persist(d1);
		et.commit();

	}

}
