package day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass01 {
	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");

			// 2. 연결하기
			// jdbc:mysql:// 호스트 URL:포트/데이터베이스명
			String url = "jdbc:mysql://172.16.12.101:3306/hr";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			// 3. 쿼리 수행을 위한 Statement 객체 생성
			stmt = conn.createStatement();

			// 4. SQL 쿼리작성
			String sql = "SELECT * FROM emp";

			// 5. 쿼리 수행
			rs = stmt.executeQuery(sql);

			// 6. 실행결과 출력하기
			while (rs.next()) {
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);

				System.out.println(empno + " / " +ename+ " / " + job);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)	rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}
}
