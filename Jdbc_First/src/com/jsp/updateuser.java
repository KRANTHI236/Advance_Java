package com.jsp;
    
    import java.util.Scanner;
	import java.sql.*;
	public class updateuser {
	public static void main(String[] args) {
		try	 {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/aadhar";
			String user="root";
			String pwd="root";
			Connection con=DriverManager.getConnection(dburl, user, pwd);
			Statement s=con.createStatement();
			Scanner sc=new Scanner(System.in);
			String condition="";
			String colunmname;
			boolean b=false;
			do {
				System.out.println("enter column name id | name | age");
				colunmname=sc.next();
				if(colunmname.equals("id"))
				{
				System.out.println("enter id value");
				int id=sc.nextInt();
				condition =condition+colunmname+"="+id;
				}
				else if(colunmname.equals("name"))
				{
					System.out.println("enter name");
					String name=sc.next();
					condition =condition+colunmname+"="+"'"+name+"'";
				}
				else if(colunmname.equals("age"))
				{
					System.out.println("enter age");
					int age=sc.nextInt();
					condition =condition+colunmname+"="+age;
				}
				    System.out.println("do you want to update w.r.to more colunms yes or no");
					String input=sc.next();
					if(input.equals("yes"))
					{
						System.out.println("choose operator:1 or 2");
						System.out.println("enter operator");
						String operator=sc.next();
						condition=condition+" "+operator+" ";
						b=false;
				}
				else
				{
					b=true;
				}
				
			}
			while(!b);
			s.execute("UPDATE kranthi SET name=name , age=age  WHERE id=id ");
			con.close();
		}
			
			catch(ClassNotFoundException | SQLException e)
			{
			e.printStackTrace();
			}
	}
	}



