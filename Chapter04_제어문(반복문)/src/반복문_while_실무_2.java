import java.io.*;
import java.sql.*;
import java.util.Properties;
public class 반복문_while_실무_2 {
	
	public static void main(String[] args) throws Exception {
		
		Properties prop = 
				new Properties();
		FileInputStream fis =
				new FileInputStream("c:\\javaDev\\db.properties");
		prop.load(fis);
//		System.out.println("url : " + prop.getProperty("url"));
//		System.out.println("user : " + prop.getProperty("user"));
//		System.out.println("pwd : " + prop.getProperty("pwd"));
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn =
				DriverManager.getConnection(
						prop.getProperty("url"),
						prop.getProperty("user"),
						prop.getProperty("pwd")
				);
		
		String sql = "SELECT name, type, time "
				+ "FROM food";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1) + " "
					+ rs.getString(2) + " "
					+ rs.getString(3));
		}
	}
}
