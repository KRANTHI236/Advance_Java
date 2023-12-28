package mapping_tables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main2 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		EMP e1 = new EMP();
		e1.setEid(1);
		e1.setEname("scott");
		e1.setEjob("manager");
		e1.setEsal(100000);

		EMP e2 = new EMP();
		e2.setEid(2);
		e2.setEname("mark");
		e2.setEjob("sales");
		e2.setEsal(90000);

		EMP e3 = new EMP();
		e3.setEid(3);
		e3.setEname("king");
		e3.setEjob("president");
		e3.setEsal(100000);

		EMP e4 = new EMP();
		e4.setEid(4);
		e4.setEname("blake");
		e4.setEjob("clerk");
		e4.setEsal(3000);

		DEPT d1 = new DEPT();
		d1.setDeptno(1);
		d1.setLoc("new york");
		d1.setDname("account");

		DEPT d2 = new DEPT();
		d2.setDeptno(2);
		d2.setLoc("mumbai");
		d2.setDname("salesss");
		
		List<EMP> li = new ArrayList<EMP>();
		li.add(e1);
		li.add(e4);
		
		List<EMP> li1 = new ArrayList<EMP>();
		li1.add(e2);
		li1.add(e3);
		
		d1.setLi(li);
		d2.setLi(li1);
//		d2.setLi(li);
//    	d2.setLi(li1);

		et.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.persist(d1);
		em.persist(d2);
		et.commit();

	}
}
