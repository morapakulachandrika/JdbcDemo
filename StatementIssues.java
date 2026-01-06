import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
public class StatementIssues {
    public static void main(String[] args) throws Exception {
        int sid = 02;
        String sname="ooha";
        int marks= 90;
        String url ="jdbc:postgresql://localhost:5432/Spring";
        String uname="postgres";
        String pass="chandu";
        String sql="insert into student values(" + sid +",'"+sname+"',"+marks+")";
        Connection con= DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection successful");
        Statement st= con.createStatement();
        st.executeUpdate(sql);
        con.close();
        System.out.println("Connection closed");
    }
}
