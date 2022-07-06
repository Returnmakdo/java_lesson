package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class DBConnectionTest {

	public static void main(String[] args) {
		// db연결 시도 -> 성공하면 Connection객체가 만들어진다.
		
		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);
		if(conn != null)
			System.out.println("데이터베이스 연결 성공!!");
		else
			System.out.println("데이터베이스 연결 실패!!");
		
		// connection 객체를 이용해서 sql을 실행할수있습니다. -> sql을 db로전송
		// PreparedStatement 객체는 sql을 컴파일해서 저장한다.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES ('sana97', '최사나', 'sana@naver.com', 26)"; // 주의 sql끝에 세미콜론제거
		
		// 동일한 custom_id 값으로 실행하면 ORA-00001: 무결성 제약조건(C##IDEV.SYS_C008411)에 위배됩니다
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();         // insert, update, delete SQL 실행한다.
			pstmt.close();           // 자원 사용 종료(해제)
			
		} catch (SQLException e) {
			System.out.println("SQL 실행오류입니다 : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn,pstmt);
		}
	}

}