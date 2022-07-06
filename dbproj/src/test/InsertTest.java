package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertTest {

	public static void main(String[] args) {
		// db���� �õ� -> �����ϸ� Connection��ü�� ���������.
		
		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);
		
		// connection ��ü�� �̿��ؼ� sql�� �����Ҽ��ֽ��ϴ�. -> sql�� db������
		// PreparedStatement ��ü�� sql�� �������ؼ� �����Ѵ�.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES (?,?,?,?)"; // ?�� �������� ���޵� ��.
		
		PreparedStatement pstmt = null;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�� ID (unique�� ��) >>> ");
		String id = sc.nextLine();
		
		System.out.print("�� ���� >>> ");
		String name = sc.nextLine();
		
		System.out.print("�̸��� >>> ");
		String email = sc.nextLine();
		
		System.out.print("���� >>> ");
		int age= Integer.parseInt(sc.nextLine());
		
		try {
			pstmt = conn.prepareStatement(sql);  // 1)
			
			// 2) sql�� ���ε� �� �� ���� : ������ Ÿ�Կ� ���� setXXXXX() �޼ҵ� ����.
			pstmt.setNString(1, id);
			pstmt.setNString(2, name);
			pstmt.setNString(3, email);
			pstmt.setInt(4, age);
			
			// 3)
			pstmt.execute();         // insert, update, delete SQL �����Ѵ�.
			
			System.out.println("���� ��ϵǾ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("SQL ��������Դϴ� : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		sc.close();
	}

}