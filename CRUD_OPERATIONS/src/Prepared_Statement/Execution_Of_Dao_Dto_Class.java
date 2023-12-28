package Prepared_Statement;

import java.util.Scanner;

public class Execution_Of_Dao_Dto_Class {
 
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id");
		int n=sc.nextInt();
		
		System.out.println("enter the name");
		String s1=sc.next();
		
		System.out.println("enter the age");
		int n1=sc.nextInt();
		
		System.out.println("insert completed");
		
		Person_Dto p1=new Person_Dto();
		
		p1.setId(n);
		p1.setName(s1);
		p1.setAge(n1);
		
		Person_Dao.insert(p1);
		
		
		
		
		
		
		
		
	}
}
