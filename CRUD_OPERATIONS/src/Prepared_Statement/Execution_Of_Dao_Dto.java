package Prepared_Statement;

import java.util.Scanner;

public class Execution_Of_Dao_Dto {

	 public static void main(String[] args) {
		
		 
		 Scanner sc= new Scanner( System.in);
		 
		 System.out.println("enter the age");
		 int n=sc.nextInt();
		 
		 Delete_Dto d1=new Delete_Dto();
		 
		 d1.setAge(n);
		 
		 Delete_Dao.delete(d1);
		 
	}
}
