package mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("kranthi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Raja r1=new Raja();
		Rani r2=new Rani();
//		r1.setId(3);
//		r1.setName("pa1");
//		r1.setAge(28);
//	    r1.setR(r2);
//		r2.setId(3);
//		r2.setName("sri");
//		r2.setAge(26);
//		et.begin();
//		em.persist(r1);
//		em.persist(r2);
//		et.commit();
//		Query q=em.createQuery("select m from Raja m");
//		List<Raja>li=q.getResultList();
//		for(Raja r3 : li) {
//			System.out.println(r3.getId()+"\t"+r3.getName()+"\t"+r3.getAge()+"\t"+r3.getR().getName());
//		}
		
   }
}
