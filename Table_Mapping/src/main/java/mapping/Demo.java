package mapping;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

interface person {
	public abstract void update();

	public abstract void delete();

	public abstract void read();

}

class Task1 implements person {
	public void update() {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Dto_Person dt = new Dto_Person();
		System.out.println("enter the aadhar");
		Query q = em.createQuery("update Dto_Person set aadhar=?1 where age=21");
		long aadhar = sc.nextLong();
		q.setParameter(1, aadhar);
		dt.setAadhar(aadhar);
		q.executeUpdate();
		et.commit();
	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Dto_Person dt = new Dto_Person();

		Dto_Person_Wife dp = new Dto_Person_Wife();
		et.begin();

		System.out.println("enter the age");

//		Query q = em.createQuery("delete from Dto_Person where name=?1 and age=?2");

		Query q = em.createQuery("delete from Dto_Person_Wife where  w_age=?1");

//		String name = sc.next();
		int age = sc.nextInt();

//		q.setParameter(1, name);

		q.setParameter(2, age);

//		dt.setAge(age);
//		dt.setName(name);

//		dp.setW_name(name);
		dp.setW_age(age);

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

public class Demo {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		t1.update();
		t1.delete();
		t1.read();

	}
}
