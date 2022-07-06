package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class SelectTest2 {  // SelectTest 클래스를 while로 변경해서 조회된 행들 모두 출력하기

	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt =null;
		// select 쿼리 결과를 참조
		ResultSet rs = null;
		
		String sql = "SELECT * FROM TBL_CUSTOM ORDER BY CUSTOM_ID";
		
		try {
			pstmt = conn.prepareStatement(sql);
			// select 쿼리 실행. 쿼리결과로 만들어지는 객체 잠조
			rs = pstmt.executeQuery();
			int i = 1;
			//rs 를 통해서 실행결과 확인해보기 rs.next() 조회된 결과를 행 순서대로 접근
			while(rs.next()) {
			System.out.println(String.format("\n조회된 결과 : %d번째 행", i++));
			System.out.println("현재 행의 고객 이름 : " + rs.getNString("NAME"));
			System.out.println("현재 행의 고객 이메일 : " + rs.getNString("EMAIL"));
			System.out.println("현재 행의 고객 나이 : " + rs.getInt("AGE"));
			System.out.println("현재 행의 고객 가입날짜 : " + rs.getDate("REG_DATE"));
			System.out.println("현재 행의 고객 가입날짜 : " + rs.getTimestamp("REG_DATE"));
			}   
			
		} catch (SQLException e) {
			System.out.println("SQL select 실행오류 : " + e.getMessage());
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
	}

}
