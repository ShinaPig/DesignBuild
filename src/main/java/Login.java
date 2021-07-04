import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
/*
 * Created by JFormDesigner on Sun Jul 04 12:10:18 CST 2021
 */


/**
 * @author ziyue ji
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }
    public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    public String JDBC_USER = "root";
    public String JDBC_PASSWORD = "root";
    private void button1ActionPerformed(ActionEvent e) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("OK");
            try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM administrator WHERE adminname=? AND password=?")) {
                ps.setString(1, username.getText().trim()); // 注意：索引从1开始
                ps.setString(2, String.valueOf(password.getPassword()));
                System.out.println(ps);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        new AdminPanel();
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        textField4 = new JLabel();
        username = new JTextField();
        panel3 = new JPanel();
        textField3 = new JLabel();
        password = new JPasswordField();
        panel4 = new JPanel();
        button1 = new JButton();

        //======== this ========
        setBackground(Color.white);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Management System");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 1));

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setLayout(new GridLayout(4, 1));

            //---- label1 ----
            label1.setText("Welcome to Mangament System");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Sarasa UI SC", Font.PLAIN, 22));
            panel1.add(label1);

            //======== panel2 ========
            {
                panel2.setBackground(Color.white);
                panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

                //---- textField4 ----
                textField4.setText("Username:");
                panel2.add(textField4);

                //---- username ----
                username.setColumns(20);
                panel2.add(username);
            }
            panel1.add(panel2);

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);
                panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

                //---- textField3 ----
                textField3.setText("Password:");
                panel3.add(textField3);

                //---- password ----
                password.setColumns(20);
                panel3.add(password);
            }
            panel1.add(panel3);

            //======== panel4 ========
            {
                panel4.setBackground(Color.white);
                panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

                //---- button1 ----
                button1.setText("Login");
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel4.add(button1);
            }
            panel1.add(panel4);
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        setSize(500,300);
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel2;
    private JLabel textField4;
    private JTextField username;
    private JPanel panel3;
    private JLabel textField3;
    private JPasswordField password;
    private JPanel panel4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
