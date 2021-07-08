import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sun Jul 04 16:28:53 CST 2021
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
            if(comboBox1.getSelectedIndex()==0) {
                try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM administrator WHERE adminid=? AND password=HEX(AES_ENCRYPT(?,'1234567890abcdef'))")) {
                    ps.setInt(1, Integer.parseInt(username.getText().trim())); // 注意：索引从1开始
                    ps.setString(2, String.valueOf(password.getPassword()));
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            new AdminPanel();
                            this.dispose();
                        }
                        else{
                            new JOptionPane().showMessageDialog(null, "Username or Password is wrong!", "Login Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            if(comboBox1.getSelectedIndex()==1){
                try (PreparedStatement ps2 = conn.prepareStatement("SELECT * FROM company WHERE companyid=? AND password=HEX(AES_ENCRYPT(?,'1234567890abcdef'))")) {
                    ps2.setInt(1, Integer.parseInt(username.getText().trim()));
                    ps2.setString(2,String.valueOf(password.getPassword()));
                    try(ResultSet rs2 = ps2.executeQuery()){
                        if(rs2.next()){
                            new CompanyPanel(rs2.getInt(1));
                            this.dispose();
                        }
                        else{
                            new JOptionPane().showMessageDialog(null, "Username or Password is wrong!", "Login Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void initComponents() {
        this.setIconImage((new ImageIcon(getClass().getResource("/home2.png")).getImage()));
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        panel1 = new JPanel();
        label2 = new JLabel();
        username = new JTextField();
        panel2 = new JPanel();
        label3 = new JLabel();
        password = new JPasswordField();
        button1 = new JButton();
        panel3 = new JPanel();
        radioButton1 = new JRadioButton();

        //======== this ========
        setBackground(Color.white);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Management System");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), 0, 0));

        //---- label1 ----
        label1.setText("Welcome to Mangament System");
        NoScalingIcon icon = new NoScalingIcon(new ImageIcon(getClass().getResource("/home.png")));
        label1.setIcon(icon);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Sarasa UI SC", Font.PLAIN, 22));
        contentPane.add(label1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //======== panel3 ========
        {
            panel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Admin",
                    "Company"
            }));
            panel3.add(comboBox1, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- radioButton1 ----
            radioButton1.setText("Dark Mode");
            radioButton1.addItemListener(e -> {
                if (radioButton1.isSelected())
                {
                    FlatDarkLaf.setup();
                }
                if (!radioButton1.isSelected())
                {
                    FlatLightLaf.setup();
                }
            });
            panel3.add(radioButton1, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
        }
        contentPane.add(panel3, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- label2 ----
            label2.setText("       Userid: ");
            NoScalingIcon icon2 = new NoScalingIcon(new ImageIcon(getClass().getResource("/manager.png")));
            label2.setIcon(icon2);
            panel1.add(label2, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- username ----
            username.setColumns(10);
            panel1.add(username, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
        }
        contentPane.add(panel1, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- label3 ----
            label3.setText("  Password: ");
            NoScalingIcon icon3 = new NoScalingIcon(new ImageIcon(getClass().getResource("/key.png")));
            label3.setIcon(icon3);
            panel2.add(label3, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- password ----
            password.setColumns(10);
            panel2.add(password, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
        }
        contentPane.add(panel2, new GridConstraints(3, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        //---- button1 ----
        button1.setText("Login");
        NoScalingIcon icon4 = new NoScalingIcon(new ImageIcon(getClass().getResource("/next.png")));
        button1.setIcon(icon4);
        button1.addActionListener(e->button1ActionPerformed(e));
        contentPane.add(button1, new GridConstraints(4, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,400);
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JPanel panel1;
    private JLabel label2;
    private JTextField username;
    private JPanel panel2;
    private JLabel label3;
    private JPasswordField password;
    private JButton button1;
    private JPanel panel3;
    private JRadioButton radioButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}