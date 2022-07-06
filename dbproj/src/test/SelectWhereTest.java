package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class SelectWhereTest {

	public static void main(String[] args) {
		
		// ����ڿ��� �˻��� �� ID�� �Է¹޴´�.
		// �Է¹��� �� ID�� ��ȸ�� ��� �̸�, �̸��� �� ����Ѵ�.
		Connection conn = OracleConnectionUtil.connect();
		if(conn != null) System.out.println("�����ͺ��̽� ���� �Ϸ�!");
		
		
		String sql = "SELECT NAME, EMAIL FROM TBL_CUSTOM WHERE CUSTOM_ID = ?";		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ID >> ");
		String id = sc.nextLine();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id); 
			rs = pstmt.executeQuery();
			
			// �߿� : where ���ǽ��� �÷��� �⺻Ű�̸� select��� 1�� �ְų� ����. -> if��
			if(rs.next()){
				System.out.println("ã�°� ID : " + id);
				System.out.println("���� ���� �� �̸� : " + rs.getNString("NAME"));
				System.out.println("���� ���� �� �̸��� : "+ rs.getNString("EMAIL"));
			}else {
				System.out.println("ã�� ��ID�� �����ϴ�.");
			}
		} catch (SQLException e) {
			System.out.println("SQL ��������Դϴ� : " + e.getMessage());
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		sc.close();
	}
		
		
	}

