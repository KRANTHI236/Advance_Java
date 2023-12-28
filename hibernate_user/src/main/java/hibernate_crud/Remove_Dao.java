package hibernate_crud;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove_Dao {
 
	 public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("kranthi");
		 
		 EntityManager e=emf.createEntityManager();
		 
		 EntityTransaction et=e.getTransaction();
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter the id");
		 
		 int n=sc.nextInt();
		 
		 
		 User_Dto d1=e.find(User_Dto.class, n );
		 
		 
		 et.begin();
		 e.remove(d1);
		 et.commit();
		 
		 
	}
}
