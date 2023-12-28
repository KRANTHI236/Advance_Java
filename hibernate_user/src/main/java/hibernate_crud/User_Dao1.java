package hibernate_crud;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class User_Dao1 {
//	 int num=1;
//	String name="baby";
//	int age=18;
//	String job="php developer";
//	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int n = sc.nextInt();
		System.out.println("enter the name");
		String s = sc.next();
		System.out.println("enter the age");
		int n1 = sc.nextInt();
		System.out.println("enter the job");
		String str = sc.next();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		User_Dto d1 = em.find(User_Dto.class, n);

		d1.setAge(n1);
		d1.setJob(str);
		d1.setName(s);
		d1.setNum(n);
		et.begin();
		em.persist(d1);
		et.commit();

	}
}
