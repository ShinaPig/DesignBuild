import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Mon Jul 05 20:35:21 CST 2021
 */



/**
 * @author ziyue ji
 */
public class UserManagementPanel extends JPanel {
    final public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final public String JDBC_USER = "root";
    final public String JDBC_PASSWORD = "root";
    public UserManagementPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel7 = new JPanel();
        button2 = new JButton();
        button14 = new JButton();
        button1 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        scrollPane1 = new JScrollPane();
        Usertable = new JTable();
        panel1 = new JPanel();
        panel18 = new JPanel();
        panel19 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        panel20 = new JPanel();
        label3 = new JLabel();
        textField3 = new JTextField();
        panel21 = new JPanel();
        label4 = new JLabel();
        textField4 = new JPasswordField();
        panel22 = new JPanel();
        label5 = new JLabel();
        textField5 = new JTextField();
        this2 = new JPanel();
        searchtext = new JTextField();
        searchbox = new JComboBox<>();
        searchbutton = new JButton();

        //======== this ========
        setLayout(new BorderLayout());

        //======== panel7 ========
        {
            panel7.setMinimumSize(new Dimension(197, 35));
            panel7.setPreferredSize(new Dimension(197, 40));
            panel7.setLayout(new GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), 0, 0));

            //---- button2 ----
            button2.setText("Refresh");
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel7.add(button2, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- button14 ----
            button14.setText("Reset");
            button14.addActionListener(e -> button14ActionPerformed(e));
            panel7.add(button14, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- button1 ----
            button1.setText("Add");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel7.add(button1, new GridConstraints(0, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- button6 ----
            button6.setText("Update");
            button6.addActionListener(e -> button6ActionPerformed(e));
            panel7.add(button6, new GridConstraints(0, 3, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- button7 ----
            button7.setText("Delete");
            button7.addActionListener(e -> button7ActionPerformed(e));
            panel7.add(button7, new GridConstraints(0, 4, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
        }
        add(panel7, BorderLayout.SOUTH);

        //======== scrollPane1 ========
        {
            String[] usercol = new String[] {
                    "userid", "username", "password", "familyid",
            };
            DefaultTableModel tableModel=new DefaultTableModel(queryUserData(queryAllUser()),usercol){

                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                }
            };
            Usertable.setModel(tableModel);
            ListSelectionModel selectionModel = Usertable.getSelectionModel();
            selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            selectionModel.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    int[] selectedRow = Usertable.getSelectedRows();
                    if(selectedRow.length!=0){
                        textField2.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 0)));
                        textField3.setText((String) Usertable.getValueAt(selectedRow[selectedRow.length-1], 1));
                        textField4.setText((String) Usertable.getValueAt(selectedRow[selectedRow.length-1], 2));
                        textField5.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 3)));
                    }
                }
            });
            scrollPane1.setPreferredSize(new Dimension(453, 400));
            scrollPane1.setViewportView(Usertable);
        }
        add(scrollPane1, BorderLayout.NORTH);

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());

            //======== panel18 ========
            {
                panel18.setMinimumSize(new Dimension(193, 50));
                panel18.setPreferredSize(new Dimension(332, 50));
                panel18.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                //======== panel19 ========
                {
                    panel19.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label2 ----
                    label2.setText("userid:");
                    panel19.add(label2, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                    //---- textField2 ----
                    textField2.setColumns(8);
                    textField2.setEditable(false);
                    panel19.add(textField2, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                }
                panel18.add(panel19, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //======== panel20 ========
                {
                    panel20.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label3 ----
                    label3.setText("username:");
                    panel20.add(label3, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                    //---- textField3 ----
                    textField3.setColumns(8);
                    panel20.add(textField3, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                }
                panel18.add(panel20, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //======== panel21 ========
                {
                    panel21.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label4 ----
                    label4.setText("password:");
                    panel21.add(label4, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                    //---- textField4 ----
                    textField4.setColumns(8);
                    panel21.add(textField4, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                }
                panel18.add(panel21, new GridConstraints(1, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //======== panel22 ========
                {
                    panel22.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label5 ----
                    label5.setText("familyid:");
                    panel22.add(label5, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                    //---- textField5 ----
                    textField5.setColumns(8);
                    panel22.add(textField5, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                }
                panel18.add(panel22, new GridConstraints(1, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
            panel1.add(panel18, BorderLayout.CENTER);

            //======== this2 ========
            {
                this2.setPreferredSize(new Dimension(174, 40));
                this2.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
                searchtext.setColumns(8);
                this2.add(searchtext, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- searchbox ----
                searchbox.setModel(new DefaultComboBoxModel<>(new String[] {
                        "userid",
                        "username",
                        "familyid"
                }));
                this2.add(searchbox, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- searchbutton ----
                searchbutton.setText("Search");
                searchbutton.addActionListener(e->searchbuttonActionPerformed(e));
                this2.add(searchbutton, new GridConstraints(0, 2, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
            panel1.add(this2, BorderLayout.NORTH);
        }
        add(panel1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public Object[][] queryUserData(java.util.List<User> list) {
//        java.util.List<User> list=this.queryAllUser();
        Object[][] data=new Object[list.size()][4];
        for(int i=0;i<list.size();i++){
            data[i][0]=list.get(i).getUserid();
            data[i][1]=list.get(i).getUsername();
            data[i][2]=list.get(i).getPassword();
            data[i][3]=list.get(i).getFamilyid();
        }
        return data;
    }
    public java.util.List<User> queryAllUser(){
        String sql="select * from user";
        List<User> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
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
        return list;
    }
    private void searchbuttonActionPerformed(ActionEvent e) {
        String sql=null;
        if(searchbox.getSelectedIndex()==0)sql="SELECT * FROM user WHERE userid=?";
        if(searchbox.getSelectedIndex()==1)sql="SELECT * FROM user WHERE username=?";
        if(searchbox.getSelectedIndex()==2)sql="SELECT * FROM user WHERE familyid=?";
        List<User> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                if(searchbox.getSelectedIndex()==0)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==1)ps.setString(1, (searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==2)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        User user=new User();
                        user.setUserid(rs.getInt(1));
                        user.setUsername(rs.getString(2));
                        user.setPassword(rs.getString(3));
                        user.setFamilyid(rs.getInt(4));
                        list.add(user);
                    }
                    String[] usercol = new String[] {
                            "userid", "username", "password", "familyid",
                    };
                    DefaultTableModel tableModel=new DefaultTableModel(queryUserData(list),usercol){

                        @Override
                        public boolean isCellEditable(int row, int column) {
                            //all cells false
                            return false;
                        }
                    };
                    Usertable.setModel(tableModel);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void button2ActionPerformed(ActionEvent e) {
        String sql=null;
        sql="SELECT * FROM user";
        List<User> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        User user=new User();
                        user.setUserid(rs.getInt(1));
                        user.setUsername(rs.getString(2));
                        user.setPassword(rs.getString(3));
                        user.setFamilyid(rs.getInt(4));
                        list.add(user);
                    }
                    String[] usercol = new String[] {
                            "userid", "username", "password", "familyid",
                    };
                    DefaultTableModel tableModel=new DefaultTableModel(queryUserData(list),usercol){

                        @Override
                        public boolean isCellEditable(int row, int column) {
                            //all cells false
                            return false;
                        }
                    };
                    Usertable.setModel(tableModel);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void button14ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to reset the password?", "Reset Password",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "UPDATE user SET password = '123456789' WHERE userid=?";
            List<User> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, Integer.valueOf(textField2.getText().trim()));
                    int n = ps.executeUpdate();
                    if(n!=0)JOptionPane.showMessageDialog(null, "Reset password successfully!");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    private void button6ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to update the user information?", "Update",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "UPDATE user SET username=? , password = ? , familyid = ? WHERE userid=?";
            List<User> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, textField3.getText());
                    ps.setString(2, String.valueOf(textField4.getPassword()));
                    ps.setInt(3, Integer.parseInt(textField5.getText().trim()));
                    ps.setInt(4, Integer.parseInt(textField2.getText().trim()));
                    if(textField3.getText().isEmpty()||String.valueOf(textField4.getPassword()).isEmpty())JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error!",JOptionPane.ERROR_MESSAGE);
                    else{int n = ps.executeUpdate();
                    if(n!=0)JOptionPane.showMessageDialog(null, "Update the user information successfully!");}
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null, "Familyid cannot be found!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    private void button1ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to add the user?", "Add",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "INSERT INTO user (username, password, familyid) VALUES (?,?,?)";
            List<User> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, textField3.getText());
                    ps.setString(2, String.valueOf(textField4.getPassword()));
                    ps.setInt(3, Integer.parseInt(textField5.getText().trim()));
                    //ps.setInt(4, Integer.parseInt(textField2.getText().trim()));
                    if(textField3.getText().isEmpty()||String.valueOf(textField4.getPassword()).isEmpty())JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error!",JOptionPane.ERROR_MESSAGE);
                    else{int n = ps.executeUpdate();
                        if(n!=0)JOptionPane.showMessageDialog(null, "Add the user information successfully!");}
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null, "Familyid cannot be found!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    private void button7ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to delete the user?", "Delete",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "DELETE FROM user WHERE userid=?";
            List<User> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
//                    ps.setString(1, textField3.getText());
//                    ps.setString(2, String.valueOf(textField4.getPassword()));
//                    ps.setInt(3, Integer.parseInt(textField5.getText().trim()));
                    ps.setInt(1, Integer.parseInt(textField2.getText().trim()));
//                    if(textField3.getText().isEmpty()||String.valueOf(textField4.getPassword()).isEmpty())JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error!",JOptionPane.ERROR_MESSAGE);
                    int n = ps.executeUpdate();
                    if(n!=0)JOptionPane.showMessageDialog(null, "Delete the user information successfully!");
                } catch (SQLException throwables) {
//                    JOptionPane.showMessageDialog(null, "Familyid cannot be found!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel7;
    private JButton button2;
    private JButton button14;
    private JButton button1;
    private JButton button6;
    private JButton button7;
    private JScrollPane scrollPane1;
    private JTable Usertable;
    private JPanel panel1;
    private JPanel panel18;
    private JPanel panel19;
    private JLabel label2;
    private JTextField textField2;
    private JPanel panel20;
    private JLabel label3;
    private JTextField textField3;
    private JPanel panel21;
    private JLabel label4;
    private JPasswordField textField4;
    private JPanel panel22;
    private JLabel label5;
    private JTextField textField5;
    private JPanel this2;
    private JTextField searchtext;
    private JComboBox<String> searchbox;
    private JButton searchbutton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
