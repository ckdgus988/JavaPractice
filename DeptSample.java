package methodDef;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptSample {


      //final : 변수의 데이터를 수정할 수 없도록 지정.
      static final String driver = "oracle.jdbc.OracleDriver";
      static final String url = "jdbc:oracle:thin:@localhost:1521:xe"; //정품일결우 xe대신 orcl
      static final String userid = "Lee2";
      static final String pwd = "java1234";
      static Scanner sc = new Scanner(System.in);
         
      Connection conn;
      PreparedStatement pstmt;
      ResultSet rs;
      
   
      
      public void ConnectionDriver() throws ClassNotFoundException, SQLException {       //클래스이자 클래스 변수이므로 새로운 메소드 만들어줌.
         
      Class.forName(driver);   
      conn = DriverManager.getConnection(url,userid, pwd);
      }
            
      
      private void select() throws ClassNotFoundException, SQLException {
         ConnectionDriver();
      //String sql = "select * from departments where department_id = ?"; //조건부로 보는것   
      String sql = "select * from dept";   //다 보는것
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();   //조회문 실행   pstmt 를 통해서 prepareState먼트를 실행해서 rs변수에 저장   
      System.out.println("------------------------------------");
      
      while(rs.next()) {         //rs.next와 while문 쓰는이유??! 반복문에 rs에 저장된 다음 "( )" 의 값을 불러온다. 
         int dno = rs.getInt("deptno"); //id호출   did에 저장하는데 rs에 저장된 int 데이터를 저장한다. 
         String dname = rs.getString("dname"); //department데이터 베이스 안에있는 name 호출 
         String loc = rs.getString("loc");
         
         System.out.println(dno+"\t"+dname+"\t"+loc);   //데이터값 반복출력
         }
      System.out.println("------------------------------------");
      }
      
      private void delete() throws SQLException, ClassNotFoundException {
         ConnectionDriver();       //실행문
      
         System.out.println("삭제할 deptno 입력해주세요.");
         int dno = sc.nextInt();
         
         String sql = "delete from dept where deptno = ?";      //조건절 department id로 호      //primary키는 반드시 달라야 한다.
         pstmt = conn.prepareStatement(sql);   //conn참조변수가 prepraseStatement의 인스턴스를 참조한다.
         pstmt.setInt(1, dno);    //이거 왜하는지=?270번지 아이디를 삭제해준다는 뜻? =>ㅇㅇ      did로 입력값을 주어 입력받는 번호를 삭제
         pstmt.executeUpdate();    //insert에서는 rs인데 여기서는 pstmt인 이유와 update로 수정되는 이유 알기.
         System.out.println("데이터가 성공적으로 삭제되었습니다.");
         select(); //메소드 호출 
         
      }
      
      private void insert() throws ClassNotFoundException, SQLException {         //연습.
         ConnectionDriver();
         
         System.out.println("추가할 deptno 를 입력해주세요 ");
         int dno = sc.nextInt(); //department_id
         
         System.out.println("추가할 dname 를 입력해주세요 ");
         String dname = sc.next();   //department_name
         
         System.out.println("추가할 loc을 입력해주세요 ");
         String loc = sc.next();      //location_id
         
         String sql = "insert into dept(deptno, dname, loc) values(?,?,?)";   // **values(?,?,?)가 이 안에 데이터 값을 넣어준다는 뜻.
         
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, dno);            
         pstmt.setString(2, dname); 
         pstmt.setString(3, loc); 
         
         pstmt.executeUpdate();   
         System.out.println("데이터가 성공적으로 입력되었습니다.");
         
         select(); //메소드 호출 
         }
         
      
      private void update() throws SQLException, ClassNotFoundException {      //insert와 매우 닮은꼴
         ConnectionDriver();
         
         System.out.println("수정 할 deptno 를 입력해주세요 ");   
         int dno = sc.nextInt(); //department_id
         
         System.out.println("수정 할 dname 를 입력해주세요 ");
         String dname = sc.next();   //department_name
         
         System.out.println("수정 할 loc을 입력해주세요 ");
         String loc = sc.next();      //manager_id
         
         
         String sql = "update dept set dname=?,loc=? where deptno = ?";   // =? 수정할대상 / where ~~=?는 기준   
         
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, dname);            
         pstmt.setString(2, loc); 
         pstmt.setInt(3, dno);          //순서 조심***공부해보기 
         
         pstmt.executeUpdate();   
         System.out.println("데이터가 성공적으로 수정되었습니다.");
         select(); //메소드 호출 
         }
      
      
      
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
         DeptSample dm = new DeptSample();
         
         
         
          Scanner sc = new Scanner(System.in);
          System.out.println("1.insert, 2.update, 3. delete 원하는 목록을선택하세요.");
          System.out.println("이외의 숫자는 프로그램을 종료합니다.");
          int num = sc.nextInt();
          
          switch(num) {
          case 1 :
             dm.insert();
             break;
          case 2 :
             dm.update();
             break;
          case 3 : 
             dm.delete();
             break;
          case 4 :
             System.out.println("프로그램을 종료합니다.");
             System.exit(0);
          }
      }

}