package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertBuyTest {
// tbl_buy  테이블에 인서트하기
// sana97 회원이 GALAXYS22를 1개구매
// values(?,?,....) 동적 바인딩으로 sql을 먼저 컴파일하고 실행값은 실행전에 전달
	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		if(conn != null) System.out.println("데이터베이스 연결 완료!");
		
		
		String sql = "INSERT INTO tbl_buy(custom_id, PCODE, QUANTITY, BUYNO) " 
		+ " VALUES (?,?,?,tbl_buy_seq.nextval)";		
		
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			conn.setAutoCommit(false);//   autocommit 해제
			
			pstmt = conn.prepareStatement(sql);
			
			System.out.print("구매고객 ID >>>");
			pstmt.setNString(1, sc.nextLine());
			System.out.print("구매상품 코드 >>>");
			pstmt.setNString(2, sc.nextLine());
			System.out.print("구매 수량 >>>");
			pstmt.setInt(3, Integer.parseInt(sc.nextLine()));
			
			pstmt.execute();
			System.out.println("끝 ?");
//			conn.commit();   트랜잭션 커밋
		} catch(SQLException e) {
			System.out.println("SQL 실행오류 : " + e.getMessage());
				
				try {
					conn.rollback(); // 오류가있으면 트랜잭션 롤백
				} catch(SQLException e1) {}
				
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		sc.close();
	}

}