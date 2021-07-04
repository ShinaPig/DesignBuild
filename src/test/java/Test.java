import com.formdev.flatlaf.*;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Test {
    public static void main(String[] args) {
        FlatIntelliJLaf.setup();
//        JFrame jFrame = new JFrame();
//        jFrame.setLayout(new GridLayout(3,1));
//        jFrame.getContentPane().add(new JButton("Test"));
//        jFrame.getContentPane().add(new JButton("Test"));
//        jFrame.getContentPane().add(new JButton("Test"));
//        jFrame.setSize(500,500);
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "root";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("OK");
            try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM administrator WHERE adminname=? AND password=?")) {
                ps.setString(1,"admin"); // 注意：索引从1开始
//                System.out.println(username.getText());
//                System.out.println(password.getPassword());
                ps.setObject(2, "admin");
                System.out.println(ps);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(1);
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
