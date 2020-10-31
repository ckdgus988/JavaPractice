package methodDef;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * 입력/조회
 * 수정/조회
 * 삭젝/조회
 * 
 */
public class Department {
   //final : 변수의 데이터를 수정할 수 없도록 지정.
   static final String driver = "oracle.jdbc.OracleDriver";
   static final String url = "jdbc:oracle:thin:@localhost:1521:xe"; //정품일결우 xe대신 orcl
   static final String userid = "hr";
   static final String pwd = "hr";
   
   
  
   Connection conn;
   PreparedStatement pstmt;		//sql구문을 실행하는 역
   ResultSet rs;	//결과 값을 rs에 담는다.
   
   static Scanner sc = new Scanner(System.in);
   
   private void select() throws ClassNotFoundException, SQLException {
   Class.forName(driver);   //class가 참조하는 froname 메소드를 호출할건데인자값으로 driver을 넣는다.
   conn = DriverManager.getConnection(url,userid, pwd);
   //String sql = "select * from departments where department_id = ?"; //조건부로 보는것   
   String sql = "select * from departments";   //다 보는것
   pstmt = conn.prepareStatement(sql);
   rs = pstmt.executeQuery();   //조회문 실행   pstmt 를 통해서 prepareState먼트를 실행해서 rs변수에 저장   
   System.out.println("------------------------------------");
   
   while(rs.next()) {         //rs.next와 while문 쓰는이유??! 반복문에 rs에 저장된 다음 "( )" 의 값을 불러온다. 
      int did = rs.getInt("department_id"); //id호출   did에 저장하는데 rs에 저장된 int 데이터를 저장한다. 
      String dname = rs.getString("department_name"); //department데이터 베이스 안에있는 name 호출 
      int mid = rs.getInt("manager_id"); // 이거 왜 하는지 모르겠음                         *
      int lid = rs.getInt("location_id");
      
      System.out.println(did+"\t"+dname+"\t"+mid+"\t"+lid);   //데이터값 반복출력
      }
   System.out.println("------------------------------------");
   }
   
   private void delete() throws SQLException, ClassNotFoundException {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, userid, pwd);       //실행문
   
      System.out.println("삭제할 데이터의 아이디를 입력해주세요.");
      int did = sc.nextInt();
      
      String sql = "delete from departments where department_id = ?";      //조건절 department id로 호
      pstmt = conn.prepareStatement(sql);   //conn참조변수가 prepraseStatement의 인스턴스를 참조한다.
      pstmt.setInt(1, did);    //이거 왜하는지=?270번지 아이디를 삭제해준다는 뜻? =>ㅇㅇ      did로 입력값을 주어 입력받는 번호를 삭제
      pstmt.executeUpdate();    //insert에서는 rs인데 여기서는 pstmt인 이유와 update로 수정되는 이유 알기.
      System.out.println("데이터가 성공적으로 삭제되었습니다.");
      select(); //메소드 호출 
      
   }
   
   private void insert() throws ClassNotFoundException, SQLException {         //연습.
      Class.forName(driver);   
      conn = DriverManager.getConnection(url,userid, pwd);
      System.out.println("추가할 department id 를 입력해주세요 ");
      int did = sc.nextInt(); //department_id
      
      System.out.println("추가할 department name 를 입력해주세요 ");
      String dname = sc.next();   //department_name
      
      System.out.println("추가할 manager id 를 입력해주세요 ");
      int mid = sc.nextInt();      //manager_id
      
      System.out.println("추가할 location id 를 입력해주세요 ");
      int lid = sc.nextInt();      //location_id
      
      String sql = "insert into departments values(?,?,?,?)";   // **values(?,?,?,?)가 이 안에 데이터 값을 넣어준다는 뜻.
      
      pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, did);            
      pstmt.setString(2, dname); 
      pstmt.setInt(3, mid); 
      pstmt.setInt(4, lid); 
      
      pstmt.executeUpdate();   
      System.out.println("데이터가 성공적으로 입력되었습니다.");
      
      select(); //메소드 호출 
      }
      
   
   private void update() throws SQLException, ClassNotFoundException {      //insert와 매우 닮은꼴
      Class.forName(driver);   
      conn = DriverManager.getConnection(url,userid, pwd);
      
      
      System.out.println("수정 할 department id 를 입력해주세요 ");   
      int did = sc.nextInt(); //department_id
      
      System.out.println("수정 할 department name 를 입력해주세요 ");
      String dname = sc.next();   //department_name
      
      System.out.println("수정 할 manager id 를 입력해주세요 ");
      int mid = sc.nextInt();      //manager_id
      
      
      
      String sql = "update departments set department_name=?,manager_id=?, where department_id=? ";   // =? 수정할대상 / where ~~=?는 기준   
      
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, dname);            
      pstmt.setInt(2, mid); 
      pstmt.setInt(3, did); 
      
      pstmt.executeUpdate();   
      System.out.println("데이터가 성공적으로 수정되었습니다.");
      select(); //메소드 호출 
      }
   
   
   
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Department dm = new Department();
      
      dm.insert();
      dm.update();
      dm.delete();
   }


}