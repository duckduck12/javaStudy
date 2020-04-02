package chapter27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPreDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
		}
		catch(ClassNotFoundException e) {
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		
		try {
			
			con = DriverManager.getConnection(url, "javauser", "1234");
			
			String sqlStr = "SELECT * FROM owner_info WHERE id = ?";
			
			pstmt = con.prepareStatement(sqlStr);
			
			pstmt.setInt(1, 1);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println("번호 : " + rs.getString("id") + " ");
				System.out.println("성명 : " + rs.getString("nm") + " ");
				System.out.println("핸드폰 번호 : " + rs.getString("handphone") + " ");
				System.out.println("성별 : " + rs.getString("gender") + " ");
				
			}
			
		}
		catch(SQLException e ) {
			System.out.println("SQLException : " +e.toString());
		}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		

	}

}
