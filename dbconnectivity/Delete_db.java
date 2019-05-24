
import java.sql.*;
import java.util.Scanner;

public class Delete_db {
public static void main(String args[]) {
	Scanner scn=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/darsh";
	String username="root";
	String password="123456";
	String Name1;
	int Age1;
	try {
		Connection myConn=DriverManager.getConnection(url,username,password);
		Statement stmnt=myConn.createStatement();
		System.out.println("On what basis you wanna delete record? (1: Name or 2.Age)");
		int ch;
		ch=scn.nextInt();
		
		switch(ch) {
		case 1: 
			System.out.println("Enter the Name:");
			Name1=scn.next();
			String sql="delete from student where Name= ?";
			PreparedStatement preparedStmt = myConn.prepareStatement(sql);
		      preparedStmt.setString (1, Name1);
		  
			preparedStmt.execute();
			
			break;
		case 2: 
			System.out.println("Enter the age: ");
			Age1=scn.nextInt();
			String sql1="delete from student where age= ?";
			PreparedStatement preparedStmt1 = myConn.prepareStatement(sql1);
		      preparedStmt1.setInt(1, Age1);
		  
			preparedStmt1.execute();
			break;
		};
	
		String sql2="Select * from student";
		ResultSet rs=stmnt.executeQuery(sql2);
		while(rs.next()) {
			System.out.println("\nName :"+rs.getString("Name")+"	Age: "+rs.getInt("age"));
		}
	}catch(Exception exc) {
		exc.printStackTrace();
	}
}
}
