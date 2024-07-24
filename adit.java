package xamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class adit {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Database credentials
		String url="jdbc:mysql://localhost:3306/form";
		String username="root";
		String password="";
		
		Connection con;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//Establish connection
		con=DriverManager.getConnection(url,username,password);
		System.out.println("Database Connected successfully");
		
		try {
			//create statement
			Statement statement=con.createStatement();
			
			//Write a query
			String query="SELECT*FROM nsti";
			//Execute the query
			
			ResultSet resultset=statement.executeQuery(query);
			
			while(resultset.next()) {
			 String name=resultset.getString("name");
				String city=resultset.getString("city");
				String trade=resultset.getString("trade");
				
				
				System.out.println("Name is :"+name);
				System.out.println("city is :"+city);
				System.out.println("trade is :"+trade);
			}
			}
			finally {
				if(con !=null) {
					try {
						con.close();
					}
					catch(SQLException e) {
				}
			
			
			
		}
	}
	}
}

