import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PreparedStmts {
    public static void main(String[] args) throws Exception {
        int sid = 03;
        String sname="deeps";
        int marks=95;
        String url= "jdbc:postgresql://localhost:5432/Spring";
        String uname="postgres";
        String pass="chandu";
        String sql="insert into student values(?,?,?)";
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,sid);
        ps.setString(2,sname);
        ps.setInt(3,marks);
        ps.execute();
        con.close();
        System.out.println("Connection closed");
    }
}
