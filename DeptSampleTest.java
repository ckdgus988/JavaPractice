package methodDef;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptSampleTest {
	
	static final String driver = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String userid = "Lee2";
	static final String pwd = "java1234";
	static Scanner sc = new Scanner(System.in);	//고정
	
	
	Connection conn;		//DB 연결 
	PreparedStatement pstmt;	//sql문 호출 
	ResultSet rs;	//출력 executequery가 DB에 던진값의 리턴 
	
	
	public void ConnectionDriver() throws ClassNotFoundException, SQLException {
		Class.forName(driver); //class for 메소드를 호출해서 mysql에서 제공하는 diver클래스를 jvm method area에 연동시킵니다.
		//그러면 driverManger이용 가능.
		conn = DriverManager.getConnection(url,userid,pwd); //DriverManger객체가  getConnection메소드를 호출해서 mysql에 연결하기 위한 정보
		//들을 입력합니다. -> Connection객체 반 
		
				
		
	}
	
	private void select () throws SQLException, ClassNotFoundException {
		ConnectionDriver();
		String sql = "select*from dept";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery(); //조회프로그램 호출 preparedStatement 객체 executeQuer메소드는 결과값이 나오고 그결과값을 rs에 담는다  -> 
		System.out.println("=============================================");
		
		while (rs.next()) {
			int dno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			System.out.println(dno+"\t"+dname+"\t"+loc);
		}
		System.out.println("=================================");
	}
	
	private void delete() throws ClassNotFoundException, SQLException {
	ConnectionDriver();	
	
	System.out.println("삭제할 deptno를 입력해주세");
	int dno = sc.nextInt();
	
	String sql = "delete from dept where deptno = ?";
	pstmt = conn.prepareStatement(sql); //연결된상태(con)를 가지고 prepareStatement(query)메서드를 통해 DB에 쿼리문을 보낸다.
	pstmt.setInt(1, dno);
	pstmt.executeUpdate();
	System.out.println("데이터가 성공적으로 삭제 되었습니다.");
	select();
	
	}

	private void insert() throws ClassNotFoundException, SQLException {
		ConnectionDriver();
		
		System.out.println("추가할 dept를 입력해주세요 ");
		int dno = sc.nextInt();
		
		System.out.println("추가할 dname을 입력해주세요 ");
		String dname = sc.next();
		
		System.out.println("추가할 loc를 입력해주세요 ");
		String loc = sc.next();
		
		String sql = "insert into dept(depno, dname, loc)values(?,?,?)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,dno);
		pstmt.setString(2, dname);
		pstmt.setString(3,loc);
		
		pstmt.executeUpdate();
		System.out.println("데이터가 성공적으로 입력되었습니다.");
		select();
		
		
	}

	private void update() throws ClassNotFoundException, SQLException {
		ConnectionDriver();
		System.out.println("수정할 dno를 입력해주세요 ");
		int dno = sc.nextInt();
		
		System.out.println("수정할 dname을 입력해주세요.");
		String dname = sc.next();
		
		System.out.println("수정할 loc을 입력해주세요.");
		String loc = sc.next();
		
		String sql ="update dept set dname=?,loc=?  where deptno =?";
		
		pstmt.executeUpdate();
		System.out.println("데이터가 성공적으로 수정되었습니다.");
		select();
			
	}
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DeptSampleTest dst = new DeptSampleTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 목록의 숫자를 입력하세요. 1.insert 2. update 3. delete");
		System.out.println("이외의 숫자는 종료합니다.");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			dst.insert();
			break;
		
		case 2:
			dst.update();
			break;
			
		case 3:
			dst.delete();
			break;
		
		case 4:
			System.exit(0);
			break;
			
		}
		
		
		
	}

	

}
