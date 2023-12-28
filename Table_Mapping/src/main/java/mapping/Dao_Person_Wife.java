package mapping;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao_Person_Wife {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Dto_Person_Wife dw1 = new Dto_Person_Wife();
		Dto_Person dt = new Dto_Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		dw1.setW_name(name);
		System.out.println("enter the age");
		int age = sc.nextInt();
		dw1.setW_age(age);
		System.out.println("enter the dob");
		String dob = sc.next();
		dw1.setW_dob(dob);
		System.out.println("enter the aadhar");
		long aadhar = sc.nextLong();
		dw1.setW_aadhar(aadhar);
		System.out.println("enter the name1");
		String name1 = sc.next();
		dt.setName(name1);
		System.out.println("enter the age1");
		int age1 = sc.nextInt();
		dt.setAge(age1);
		System.out.println("enter the dob1");
		String dob1 = sc.next();
		dt.setDob(dob1);
		System.out.println("enter aadhar number1");
		long aadhar1 = sc.nextLong();
		dt.setAadhar(aadhar1);
		dw1.setDtp(dt);
		dt.setDpw(dw1);
		et.begin();
		em.persist(dt);
		em.persist(dw1);
		et.commit();

	}
}
