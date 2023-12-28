package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main_For_Product_Customer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		Products p1 = new Products();
//		p1.setPid(1);
//		p1.setPname("mac");
//		p1.setPrice(1000000);
//
//		Products p2 = new Products();
//
//		p2.setPid(2);
//		p2.setPname("apple");
//		p2.setPrice(2000);
//
//		Products p3 = new Products();
//
//		p3.setPid(3);
//		p3.setPname("moto");
//		p3.setPrice(30000);
//
//		Customers c1 = new Customers();
//
//		c1.setCid(1);
//		c1.setCname("kiran");
//		c1.setCno(929393292l);
//
//		Customers c2 = new Customers();
//		c2.setCid(2);
//		c2.setCname("kirru");
//		c2.setCno(8482819392l);
//
//		Customers c3 = new Customers();
//		c3.setCid(3);
//		c3.setCname("jai");
//		c3.setCno(83828183819l);
//
//		List<Products> li = new ArrayList<Products>();
//		li.add(p1);
//		li.add(p2);
//
//		List<Customers> li2 = new ArrayList<Customers>();
//		li2.add(c1);
//		li2.add(c2);
//
//		c1.setLi(li);
//		p1.setLi1(li2);
//
//		et.begin();
//		em.persist(c1);
//		em.persist(c2);
//		em.persist(c3);
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		et.commit();
		
		Products p1=new Products();

		Query q = em.createQuery("select e from Products e");
		List<Products>pr1=q.getResultList();
		for (Products p11 : pr1) {
			System.out.println(p11.getPid()+"\t"+p11.getPname()+"\t"+p11.getPrice());
			
		}
		

	}

}
