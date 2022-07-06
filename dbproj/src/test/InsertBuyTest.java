package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertBuyTest {
// tbl_buy  ���̺� �μ�Ʈ�ϱ�
// sana97 ȸ���� GALAXYS22�� 1������
// values(?,?,....) ���� ���ε����� sql�� ���� �������ϰ� ���ప�� �������� ����
	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		if(conn != null) System.out.println("�����ͺ��̽� ���� �Ϸ�!");
		
		
		String sql = "INSERT INTO tbl_buy(custom_id, PCODE, QUANTITY, BUYNO) " 
		+ " VALUES (?,?,?,tbl_buy_seq.nextval)";		
		
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			conn.setAutoCommit(false);//   autocommit ����
			
			pstmt = conn.prepareStatement(sql);
			
			System.out.print("���Ű� ID >>>");
			pstmt.setNString(1, sc.nextLine());
			System.out.print("���Ż�ǰ �ڵ� >>>");
			pstmt.setNString(2, sc.nextLine());
			System.out.print("���� ���� >>>");
			pstmt.setInt(3, Integer.parseInt(sc.nextLine()));
			
			pstmt.execute();
			System.out.println("�� ?");
//			conn.commit();   Ʈ����� Ŀ��
		} catch(SQLException e) {
			System.out.println("SQL ������� : " + e.getMessage());
				
				try {
					conn.rollback(); // ������������ Ʈ����� �ѹ�
				} catch(SQLException e1) {}
				
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		sc.close();
	}

}