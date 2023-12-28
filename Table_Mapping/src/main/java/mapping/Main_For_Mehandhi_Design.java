package mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main_For_Mehandhi_Design {

	 public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("kranthi");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 Mehandi m1=new Mehandi();
		 Design d1=new Design();
//		 m1.setNo(2);
//		 m1.setM_name("red");
//		 m1.setD(d1);
//		 
//		 d1.setD_no(2);
//		 d1.setD_name("indian");
//		 d1.setM1(m1);
//		 et.begin();
//		 em.persist(d1);
//		 em.persist(m1);
//		 et.commit();
		 Query q=em.createQuery("select m from Mehandi m");
		 List<Mehandi>m2=q.getResultList();
		 for (Mehandi m3 : m2) {
			System.out.println(m3.getNo()+"\t"+m3.getM_name()+"\t"+m3.getD().getD_name());
		}
	}
}
