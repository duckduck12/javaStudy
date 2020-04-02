package chapter27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버를 찾지 못했습니다. ");
			System.out.println(e.getMessage());
			
		}
		
		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			
			String sqlStr = 
					"INSERT INTO owner_info (id,nm,handphone,gender) VALUES (3, '꿀꿀맨', '000-8888-3333', '여');";
			stmt = con.createStatement();
			stmt.executeUpdate(sqlStr);
			System.out.println("레코드가 추가되었습니다. ");
			
		}
		catch(SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		}
		finally {
			try {
				stmt.close();
				con.close();
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
