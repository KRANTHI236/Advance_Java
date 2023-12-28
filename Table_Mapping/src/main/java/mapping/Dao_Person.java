package mapping;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Dao_Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Dto_Person dt = new Dto_Person();
		Dto_Person_Wife dw = new Dto_Person_Wife();
		System.out.println("enter the name");
		String name = sc.next();
		dt.setName(name);
		System.out.println("enter the age");
		int age = sc.nextInt();
		dt.setAge(age);
		System.out.println("enter the dob");
		String dob = sc.next();
		dt.setDob(dob);
		System.out.println("enter aadhar number");
		long aadhar = sc.nextLong();
		dt.setAadhar(aadhar);
		System.out.println("enter the name1");
		String name1 = sc.next();
		dw.setW_name(name1);
		System.out.println("enter the age1");
		int age1 = sc.nextInt();
		dw.setW_age(age1);
		System.out.println("enter the dob1");
		String dob1 = sc.next();
		dw.setW_dob(dob1);
		System.out.println("enter the aadhar1");
		long aadhar1 = sc.nextLong();
		dw.setW_aadhar(aadhar1);
		dt.setDpw(dw);
        dw.setDtp(dt);
		et.begin();
		em.persist(dt);
		em.persist(dw);
		et.commit();

	}

}
