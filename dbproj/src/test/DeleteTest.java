package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class DeleteTest {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM TBL_BUY WHERE CUSTOM_ID = ? ";
		
		System.out.println("ȸ�� ���ų��� ����----------------------------");
		try {
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			System.out.print("�� Id >>> ");
			pstmt.setNString(1, sc.nextLine());
//			pstmt.execute();
			int result = pstmt.executeUpdate();
			
			System.out.print("������ ������ �� ���� : " + result);
			
			System.out.print("��¥�� ���� �մϱ�? (y or n) >> ");
			if(sc.nextLine().equals("y")) {
				conn.commit();
				System.out.println("���ų��� ���� �Ϸ�!");
			}
			else {
				conn.rollback();
				System.out.println("���ų��� ���� ���!");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL ���� : " + e.getMessage());
		}
	}

}
