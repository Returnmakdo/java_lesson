package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertTest {

	public static void main(String[] args) {
		// db연결 시도 -> 성공하면 Connection객체가 만들어진다.
		
		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);
		
		// connection 객체를 이용해서 sql을 실행할수있습니다. -> sql을 db로전송
		// PreparedStatement 객체는 sql을 컴파일해서 저장한다.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES (?,?,?,?)"; // ?는 실행전에 전달될 값.
		
		PreparedStatement pstmt = null;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("고객 ID (unique한 값) >>> ");
		String id = sc.nextLine();
		
		System.out.print("고객 성명 >>> ");
		String name = sc.nextLine();
		
		System.out.print("이메일 >>> ");
		String email = sc.nextLine();
		
		System.out.print("나이 >>> ");
		int age= Integer.parseInt(sc.nextLine());
		
		try {
			pstmt = conn.prepareStatement(sql);  // 1)
			
			// 2) sql에 바인딩 될 값 설정 : 데이터 타입에 따라서 setXXXXX() 메소드 선택.
			pstmt.setNString(1, id);
			pstmt.setNString(2, name);
			pstmt.setNString(3, email);
			pstmt.setInt(4, age);
			
			// 3)
			pstmt.execute();         // insert, update, delete SQL 실행한다.
			
			System.out.println("고객이 등록되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL 실행오류입니다 : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		sc.close();
	}

}