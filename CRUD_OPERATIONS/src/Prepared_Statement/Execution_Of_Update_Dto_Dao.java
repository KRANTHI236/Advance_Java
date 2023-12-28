package Prepared_Statement;

import java.util.Scanner;

public class Execution_Of_Update_Dto_Dao {
 
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id");
		int n=sc.nextInt();
		
		System.out.println("enter the name");
		String s=sc.next();
		
		Update_Person_Dto u1=new Update_Person_Dto();
		
		u1.setId(n);
		u1.setName(s);
		
		Update_Person_Dao.update(u1);
		
		
		
		
	}
	
}
