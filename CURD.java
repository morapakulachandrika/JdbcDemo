import java.sql.*;

public class CURD {
    public static void main(String[] args) throws SQLException {
        String url= "jdbc:postgresql://localhost:5432/Spring";
        String uname = "postgres";
        String pass="chandu";
        //String sql="insert into student values(2,'ooha',96)";
        //String sql ="update student set marks=97 where sid = 2";
        String sql ="delete from student where sid = 2";
        //Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        Statement st=con.createStatement();
        boolean status = st.execute(sql);
        System.out.println("status "+status);
        con.close();
        System.out.println("connection closed");
    }
}
