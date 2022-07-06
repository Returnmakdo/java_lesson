package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class DBConnectionTest {

	public static void main(String[] args) {
		// db���� �õ� -> �����ϸ� Connection��ü�� ���������.
		
		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);
		if(conn != null)
			System.out.println("�����ͺ��̽� ���� ����!!");
		else
			System.out.println("�����ͺ��̽� ���� ����!!");
		
		// connection ��ü�� �̿��ؼ� sql�� �����Ҽ��ֽ��ϴ�. -> sql�� db������
		// PreparedStatement ��ü�� sql�� �������ؼ� �����Ѵ�.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES ('sana97', '�ֻ糪', 'sana@naver.com', 26)"; // ���� sql���� �����ݷ�����
		
		// ������ custom_id ������ �����ϸ� ORA-00001: ���Ἲ ��������(C##IDEV.SYS_C008411)�� ����˴ϴ�
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();         // insert, update, delete SQL �����Ѵ�.
			pstmt.close();           // �ڿ� ��� ����(����)
			
		} catch (SQLException e) {
			System.out.println("SQL ��������Դϴ� : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn,pstmt);
		}
	}

}