package mapping;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

//	public static void main(String[] args) {

//		Dao_Person_Wife dpw=new Dao_Person_Wife();
//		Dao_Person dp=new Dao_Person();

//		Dto_Person_Wife dtw=new Dto_Person_Wife();
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		Query q=em.createQuery("select m from Dto_Person m");
//		List<Dto_Person>li=q.getResultList();
//		for (Dto_Person dt1 : li) {
//		System.out.println(dt1.getName()+"\t"+dt1.getAge()+"\t"+dt1.getDob()+"\t"+dt1.getAadhar()+"\t"+dt1.getDpw().getW_name()+"\t"+dt1.getDpw().getW_age()+"\t"+dt1.getDpw().getW_dob()+"\t"+dt1.getDpw().getW_aadhar()+"\t"+dt1.getDpw());
//
//		et.begin();
//		
//		System.out.println("enter the aadhar");
//
//		Query q = em.createQuery("update  Dto_Person set aadhar=?1 where age=23");
//
//		long aadhar = sc.nextLong();
//
//		q.setParameter(1, aadhar);
//
//		dt.setAadhar(aadhar);
//
//		q.executeUpdate();
//		
//		et.commit();
//		

//	}
interface person1 {
	public abstract void update();

	public abstract void delete();

	public abstract void read();

}

class Task12 implements person {
	static Dto_Person dt = new Dto_Person();
	static Scanner sc = new Scanner(System.in);

	public void update() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		System.out.println("enter the aadhar");
		Query q = em.createQuery("update Dto_Person set aadhar=?1 where age=23");
		long aadhar = sc.nextLong();
		q.setParameter(1, aadhar);
		dt.setAadhar(aadhar);
		q.executeUpdate();
		et.commit();
	}

	public void delete() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Dto_Person dt=new Dto_Person();
		Dto_Person_Wife dtw=new Dto_Person_Wife();
		et.begin();
		System.out.println("enter the age ");
		//Query q = em.createQuery("delete from Dto_Person where age=?1");
		Query q=em.createQuery("delete from Dto_Person_Wife where w_age=?1");
		int age = sc.nextInt();
		q.setParameter(1, age);
		dt.setAge(age);
		q.executeUpdate();
		
		et.commit();

	}

	public void read() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query q = em.createQuery("select m from Dto_Person m");

		List<Dto_Person> li = q.getResultList();
		for (Dto_Person dt2 : li) {
			System.out.println(dt2.getName() + "\t" + dt2.getAge() + "\t" + dt2.getDob() + "\t" + dt2.getAadhar() + "\t"
					+ dt2.getDpw().getW_name() + "\t" + dt2.getDpw().getW_age());

		}

	}
}

public class Main_Dto_Dao {
	public static void main(String[] args) {
		Task12 t2 = new Task12();
		t2.update();
		t2.delete();
		t2.read();

	}
}
