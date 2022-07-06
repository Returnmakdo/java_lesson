package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class SelectWhereTest {

	public static void main(String[] args) {
		
		// 사용자에게 검색할 고객 ID를 입력받는다.
		// 입력받은 고객 ID로 조회된 결과 이름, 이메일 을 출력한다.
		Connection conn = OracleConnectionUtil.connect();
		if(conn != null) System.out.println("데이터베이스 연결 완료!");
		
		
		String sql = "SELECT NAME, EMAIL FROM TBL_CUSTOM WHERE CUSTOM_ID = ?";		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객 ID >> ");
		String id = sc.nextLine();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id); 
			rs = pstmt.executeQuery();
			
			// 중요 : where 조건식의 컬럼이 기본키이면 select결과 1개 있거나 없다. -> if문
			if(rs.next()){
				System.out.println("찾는고객 ID : " + id);
				System.out.println("현재 행의 고객 이름 : " + rs.getNString("NAME"));
				System.out.println("현재 행의 고객 이메일 : "+ rs.getNString("EMAIL"));
			}else {
				System.out.println("찾는 고객ID가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("SQL 실행오류입니다 : " + e.getMessage());
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		sc.close();
	}
		
		
	}

