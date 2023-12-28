package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Raja r1 = new Raja();
		Rani r2 = new Rani();
//		et.begin();
//		Query q = em.createQuery("delete from Raja where name='bindu'");
//
//		Query q=em.createQuery("update Rani set name='kiran'where id=1");
//		q.executeUpdate();
//		et.commit();
		et.begin();

		Raja r3 = em.find(Raja.class, 1);
		r3.getR().setName("sindhu");
		//System.out.println(r3.getR().getName());
		em.merge(r3);
		et.commit();
		System.out.println(r3.getR().getName());
	}
}
