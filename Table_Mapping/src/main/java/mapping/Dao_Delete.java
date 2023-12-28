package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao_Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Dto_Person dt=em.find(Dto_Person.class, "kiran");
		Dto_Person_Wife dtw=em.find(Dto_Person_Wife.class, "leela");
		et.begin();
		em.remove(dt);
		em.remove(dtw);
		et.commit();
		
		
	}

}
