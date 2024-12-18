package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddEmployee {

	public static void main(String [] args) throws ClassNotFoundException, SQLException {//by passing 
		String driver,url,user,password;
		driver ="com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb_12980";
		user = "root";
		password = "root";
		String sql = "insert into employee values(?,?,?,?,?)";
		
		//1. load the driver
		Class.forName(driver);
		
		//2.establish connection 
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.create prepare statement method
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 105);
		ps.setString(2, "kirsh");
		ps.setString(3, "krish@gmail.com");
		ps.setLong(4, 9988776655L);
		ps.setString(5, "m");
		
		//4. execute insert sql query
		int status = ps.executeUpdate();
		if(status >= 1) {
			System.out.println("new employee is added");
		}else {
			System.out.println("failed");
		}
		ps.close();
		con.close();
		
	}
}