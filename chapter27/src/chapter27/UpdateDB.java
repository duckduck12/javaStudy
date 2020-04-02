package chapter27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection DbCon = null;
		Statement stmt = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : "+e.getMessage());
		}
		
		try {
			DbCon = DriverManager.getConnection(url, "javauser", "1234");
			stmt = DbCon.createStatement();
			
			String sqlStr = "UPDATE owner_info SET handphone = 'XXX-XXXX-XXXX' WHERE id =2";
			
			stmt.executeUpdate(sqlStr);
			System.out.println("레코드가 수정되었습니다. ");
			
		}
		catch(SQLException e) {
			System.out.println("SQLException : "+e.getMessage());
		}
		finally {
			try {
				stmt.close();
				DbCon.close();
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
