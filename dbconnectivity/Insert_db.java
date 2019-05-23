
import java.sql.*;
import java.util.Scanner;
public class Insert_db {
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
		Name1=scn.next();
		Age1=scn.nextInt();
		String sql="insert into student values(?,?)";
		PreparedStatement preparedStmt = myConn.prepareStatement(sql);
	      preparedStmt.setString (1, Name1);
	      preparedStmt.setInt (2, Age1);
		preparedStmt.execute();
		System.out.print("Insert complete.");
		String sql1="Select * from student";
		ResultSet rt=stmnt.executeQuery(sql1);
		while(rt.next()) {
			System.out.println("\nName :"+rt.getString("Name")+"	Age:"+rt.getString("age"));
		}
	
	}
	catch(Exception exc) {
		exc.printStackTrace();
	}
}
}
