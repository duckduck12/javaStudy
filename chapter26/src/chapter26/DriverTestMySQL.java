package chapter26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTestMySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;

		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();

			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=euckr", "javauser", "1234");
			System.out.println("������ ���̽� ������ �����߽��ϴ�. ");
		} catch (SQLException ex) {
			System.out.println("SQLException : " + ex);
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		}

	}

}
