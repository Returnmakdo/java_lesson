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
		
		System.out.println("회원 구매내역 삭제----------------------------");
		try {
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			System.out.print("고객 Id >>> ");
			pstmt.setNString(1, sc.nextLine());
//			pstmt.execute();
			int result = pstmt.executeUpdate();
			
			System.out.print("삭제된 데이터 행 갯수 : " + result);
			
			System.out.print("진짜로 삭제 합니까? (y or n) >> ");
			if(sc.nextLine().equals("y")) {
				conn.commit();
				System.out.println("구매내역 삭제 완료!");
			}
			else {
				conn.rollback();
				System.out.println("구매내역 삭제 취소!");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}
	}

}
