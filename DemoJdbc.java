import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws SQLException {
        String url= "jdbc:postgresql://localhost:5432/Spring";
        String uname = "postgres";
        String pass="chandu";
        String sql="select * from student";

        //Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()) {
            System.out.print(rs.getInt(1) + "-");
            System.out.print(rs.getString(2) + "-");
            System.out.println(rs.getInt(3));
        }

        con.close();
        System.out.println("connection closed");
    }
}
