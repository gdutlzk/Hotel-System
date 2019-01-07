package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	private static Connection conn;
	private static String URL = "jdbc:mysql://localhost:3306/Hotel?characterEncoding=utf8&useSSL=true" ;
	private static String Username = "root";
	private static String Password = "88888888";
 	//static Statement sql;
	//static ResultSet res;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//数据库驱动加载
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL,Username,Password);
			System.out.println("数据库连接成功");
			return conn;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}