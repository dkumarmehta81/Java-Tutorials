import java.sql.*;
import java.util.Properties;
public class JDBC_Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/turing";
			String username="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,username,pwd);
			//con.open();
			if(con.isClosed())
			System.out.println("connection is closed");
			else
			System.out.println("connection is open");
			//create a query
String query="create table Employee(eid int(20) primary key auto_increment,Ename varchar(20) not null,ECity varchar(200))";
			//create statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table Created");
			con.close();
			
			
		}catch(Exception ex) {

			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
