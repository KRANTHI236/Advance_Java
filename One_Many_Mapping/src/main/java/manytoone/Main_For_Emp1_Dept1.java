package manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main_For_Emp1_Dept1 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Emp1 e1 = new Emp1();
		Dept1 d1 = new Dept1();
//		e1.setEno(3);
//		e1.setEname("praveen");
//		e1.setEsal(20000);
//		e1.setD(d1);
//		d1.setDno(30);
//		d1.setDname("manager");
//		d1.setLoc("chennai");
//		et.begin();
//		em.persist(d1);
//		em.persist(e1);
//		et.commit();
		Query q = em.createQuery("select m from Emp1 m");
		List<Emp1> li = q.getResultList();
		for (Emp1 e5 : li) {
			System.out.println(e5.getEno() + "\t" + e5.getEname() + "\t" + e5.getEsal() + "\t" + e5.getD().getDno()
					+ "\t" + e5.getD().getDname());

		}
	}
}