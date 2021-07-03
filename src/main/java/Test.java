import java.sql.*;

public class Test {
    public static void main(String[] args) {
        String JDBC_URL = "jdbc:mysql://localhost:3306/dreamhome";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "root";
        try(Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)){
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM branch")){
                    while (rs.next()){
                        String branchNo = rs.getString(1);
                        String street = rs.getString(2);
                        String city = rs.getString(3);
                        String postcode = rs.getString(4);
                        System.out.println(street);
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
