package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllEmployees {
	public static void main(String [] args) throws ClassNotFoundException, SQLException {//by passing 
		String driver,url,user,password;
		driver ="com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb_12980";
		user = "root";
		password = "root";
		String sql = "select * from employee";
		
		//1. load the driver
		Class.forName(driver);
		
		//2.establish connection 
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.create statement method
		Statement st = con.createStatement();
		
		//4.execute select sql query 
		ResultSet rs = st.executeQuery(sql);//Acts as a cursor pointer 
		
		while(rs.next()) {
			System.out.println("id:"+ rs.getInt("id"));
			System.out.println("name:"+rs.getString("name"));
			System.out.println("email:" +rs.getString("email"));
			System.out.println("mobile:" + rs.getLong("mobile"));
			System.out.println("gneder:" + rs.getString("gneder"));
		}
			
		//if return true then it goes to next line if false then it terminates.
		
		//5.close resources
		rs.close();
		st.close();
		
		}
}

