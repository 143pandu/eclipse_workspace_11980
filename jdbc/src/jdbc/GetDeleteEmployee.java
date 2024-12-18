package jdbc;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DeleteEmployee {

		public static void main(String [] args) throws ClassNotFoundException, SQLException {//by passing 
			String driver,url,user,password;
			driver ="com.mysql.cj.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/edb_12980";
			user = "root";
			password = "root";
			String sql = "delete from employee where id =?";
			
			//1. load the driver
			Class.forName(driver);
			
			//2.establish connection 
			Connection con = DriverManager.getConnection(url,user,password);
			
			//3.create prepare statement method
			PreparedStatement ps = con.prepareStatement(sql);
			//ps.setString(1, "Willson");
			//ps.setString(2, "willson@gmail.com");
			ps.setInt(1, 101);//(1,101);
			
			//4. execute insert sql query
			int status = ps.executeUpdate();// DML operation
			if(status >= 1) {
				System.out.println("Sucess");
			}else {
				System.out.println("failed");
			}
			ps.close();
			con.close();
			
		}
	}

