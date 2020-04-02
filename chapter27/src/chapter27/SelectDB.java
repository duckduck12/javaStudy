package chapter27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection DbCon = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("org.gjt.mm.mysql.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
		}

		try {

			DbCon = DriverManager.getConnection(url, "javauser", "1234");
			stmt = DbCon.createStatement();
			String sqlStr = "SELECT id,nm,handphone,gender FROM owner_info";
			rs = stmt.executeQuery(sqlStr);

			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String phone = rs.getString("handphone");
				String gender = rs.getString("gender");
				System.out.println(id+" "+name+" "+phone+" "+gender);
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.toString());
			
			
		} finally {
			try {

			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
