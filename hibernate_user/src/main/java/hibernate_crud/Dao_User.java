package hibernate_crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao_User {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("kranthi");
	
	EntityManager et=emf.createEntityManager();
	
	
	User_Dto d1=et.find(User_Dto.class, 1);
	//User_Dto d2=et.find(User_Dto.class, 2);
	//User_Dto d3=et.find(User_Dto.class, 3);
	if(d1!=null) {
	
	System.out.println(d1.getNum());
	System.out.println(d1.getName());
	System.out.println(d1.getAge());
	System.out.println(d1.getJob());
	
	
	
	}
	
//	System.out.println(d2.getNum());
//	System.out.println(d2.getName());
//	System.out.println(d2.getAge());
//	System.out.println(d2.getJob());
//
//	System.out.println(d3.getNum());
//	System.out.println(d3.getName());
//	System.out.println(d3.getAge());
//	System.out.println(d3.getJob());
//	
	
	
	
}
}
