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
			System.err.println("����̹��� ã�� ���߽��ϴ�. " + e.getMessage());
			
		}
		
		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			
			String sqlStr = "INSERT INTO owner_info(id,nm,handphone,gender) VALUES (?,?,?,?);";
			
			pstmt = con.prepareStatement(sqlStr);
			
			pstmt.setInt(1, 10);
			pstmt.setString(2, "ȫ�浿");
			pstmt.setString(3, "999-9999-9999");
			pstmt.setString(4, "��");
			
			pstmt.executeUpdate();
			
			System.out.println("���ڵ尡 �߰��Ǿ����ϴ�. ");
			
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
