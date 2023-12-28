package hibernate_crud;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class User_Input_For_Update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student s1 = new Student();
		et.begin();
		System.out.println("enter the name");
		Query q = em.createQuery("update Student set name=?1 where id=2");
		String s = sc.next();
		q.setParameter(1, s);
		s1.setName(s);
		q.executeUpdate();
		et.commit();

	}

}
