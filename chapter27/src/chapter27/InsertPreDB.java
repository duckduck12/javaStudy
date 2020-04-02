package chapter27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
		}
		catch(ClassNotFoundException e) {
			System.err.println("드라이버를 찾지 못했습니다. " + e.getMessage());
			
		}
		
		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			
			String sqlStr = "INSERT INTO owner_info(id,nm,handphone,gender) VALUES (?,?,?,?);";
			
			pstmt = con.prepareStatement(sqlStr);
			
			pstmt.setInt(1, 10);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "999-9999-9999");
			pstmt.setString(4, "남");
			
			pstmt.executeUpdate();
			
			System.out.println("레코드가 추가되었습니다. ");
			
		}
		catch(SQLException e) {
			System.out.println("SQLException : " +e.getMessage());
		}
		finally {
			
			try {
				pstmt.close();
				con.close();
				
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
