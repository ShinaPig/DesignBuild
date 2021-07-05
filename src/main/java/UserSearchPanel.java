
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
 * Created by JFormDesigner on Mon Jul 05 21:54:51 CST 2021
 */


/**
 * @author ziyue ji
 */
public class UserSearchPanel extends JPanel {
    final private String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final private String JDBC_USER = "root";
    final private String JDBC_PASSWORD = "root";
    public UserSearchPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        textField1 = new JTextField();
        comboBox1 = new JComboBox<>();
        button1 = new JButton();

        //======== this ========
        setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        add(textField1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "userid",
            "username",
            "familyid"
        }));
        add(comboBox1, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button1 ----
        button1.setText("Search");
        button1.addActionListener(e -> button1ActionPerformed(e));
        add(button1, new GridConstraints(0, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    private void button1ActionPerformed(ActionEvent e) {
        String sql=null;
        if(comboBox1.getSelectedIndex()==0)sql="SELECT * FROM user WHERE userid=?";
        if(comboBox1.getSelectedIndex()==1)sql="SELECT * FROM user WHERE username=?";
        if(comboBox1.getSelectedIndex()==2)sql="SELECT * FROM user WHERE familyid=?";
        List<User> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, textField1.getText().trim()); // 注意：索引从1开始
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        User user=new User();
                        user.setUserid(rs.getInt(1));
                        user.setUsername(rs.getString(2));
                        user.setPassword(rs.getString(3));
                        user.setFamilyid(rs.getInt(4));
                        list.add(user);
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField textField1;
    private JComboBox<String> comboBox1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
