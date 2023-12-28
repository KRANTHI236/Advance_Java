package Loginpage;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Dao {
//
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadhar?user=root&&password=root");
//			//PreparedStatement ps=c.prepareStatement("");
//			Statement s=c.createStatement();
//			ResultSet rs=s.executeQuery("select * from kranthi where id=204 ");
//			while(rs.next()) {
////				System.out.println("id "+rs.getInt(1));
//      			System.out.println("name "+rs.getString(2));
////				System.out.println("age "+rs.getInt(3));
////				
//				
//			}
//			c.close();
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
//}
import java.util.Scanner;

public class Dao {
	public static void mobilenumber()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Mobile Number: ");
		    long mob_no = sc.nextLong();
		    boolean b = false;
		    do {
		      long a = mob_no;
		      int count = 0;
		      while (a!=0) {
		        count++;
		        a/=10;
		      }
		      if (count==10) 
		      {
		        String st = mob_no + "";
		        char ch = st.charAt(0);
		        int  i = Integer.parseInt(ch + "");
		        if (i==6 || i==7 || i==8 || i==9) {
		          System.out.println("Mobile Number entered successfully");
		          break;
		        }
		        else {
		          System.out.println("Invalid Mobile Number.");
		          System.out.println("The number should starts with either 6,7,8 or 9");
		          mob_no = sc.nextLong();
		          b = true;
		        }
		      }
		      else {
		        System.out.println("The mobile number. should consists of 10 digits");
		        System.out.println("Re-Enter the Mobile Number.");
		        mob_no = sc.nextLong();
		        b = true;
		      }
		    } while (b);
		    System.out.println(mob_no);

	}

}
