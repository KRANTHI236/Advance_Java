package hibernate_crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Dao5_User {

	 public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("kranthi");
		 
		 EntityManager em=emf.createEntityManager();
		 
		 EntityTransaction et=em.getTransaction();
		 
		 Student d1=new Student();
		 
		 d1.setId(3);
		 d1.setName("hima bindu");
		 d1.setAge(21);
		 d1.setAddress("kmm");
		 Query q=em.createQuery("select s from Student s");
		 
		 List<Student> s1=q.getResultList();
		 
		 for(Student stu:s1) {
			 System.out.println(stu.getId());
			 System.out.println(stu.getName());
			 System.out.println(stu.getAge()+"\t"+stu.getAddress());
		 }
		
//		 et.begin();
//		 em.persist(d1);
//		 et.commit();
//		 
	}
}
