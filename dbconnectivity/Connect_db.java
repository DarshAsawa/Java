import java.sql.*;
public class Connect_db {
public static void main(String args[]) {
	try {
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/darsh","root","123456");
		Statement stmnt= conn.createStatement();
		ResultSet myrs= stmnt.executeQuery("select * from student");
		while(myrs.next()) {
			System.out.println("Name:"+myrs.getString("Name")+"	Age : "+myrs.getInt("age"));
			
			
		}

	}
	catch(Exception exc) {
		exc.printStackTrace();
	}
}
}