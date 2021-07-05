import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserManagementPanel extends JPanel {
    final public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final public String JDBC_USER = "root";
    final public String JDBC_PASSWORD = "root";
    public JPanel panel7;
    public JButton button5;
    public JButton button14;
    public JButton button6;
    public JButton button7;
    public JScrollPane scrollPane1;
    public JTable Usertable;
    public JPanel panel18;
    public JPanel panel19;
    public JLabel label2;
    public JTextField textField2;
    public JPanel panel20;
    public JLabel label3;
    public JTextField textField3;
    public JPanel panel21;
    public JLabel label4;
    public JPasswordField textField4;
    public JPanel panel22;
    public JLabel label5;
    public JTextField textField5;

    public UserManagementPanel(){
        panel7 = new JPanel();
        button5 = new JButton();
        button14 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        scrollPane1 = new JScrollPane();
        Usertable = new JTable();
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
        //======== this ========
        {
            this.setLayout(new BorderLayout());

            //======== panel7 ========
            {
                panel7.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), 0, 0));

                //---- button5 ----
                button5.setText("Search");
                button5.addActionListener(e -> button5ActionPerformed(e));
                panel7.add(button5, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- button14 ----
                button14.setText("Reset Password");
                panel7.add(button14, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- button6 ----
                button6.setText("Add/Update");
                panel7.add(button6, new GridConstraints(0, 2, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- button7 ----
                button7.setText("Delete");
                panel7.add(button7, new GridConstraints(0, 3, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
            this.add(panel7, BorderLayout.SOUTH);

            //======== scrollPane1 ========
            {
                String[] usercol = new String[] {
                        "userid", "username", "password", "familyid",
                };
                DefaultTableModel tableModel=new DefaultTableModel(queryUserData(queryAllUser()),usercol);
                Usertable.setModel(tableModel);
                ListSelectionModel selectionModel = Usertable.getSelectionModel();
                selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                selectionModel.addListSelectionListener(new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        String selectedData = null;

                        int[] selectedRow = Usertable.getSelectedRows();
                        int[] selectedColumns = Usertable.getSelectedColumns();
                        textField2.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 0)));
                        textField3.setText((String) Usertable.getValueAt(selectedRow[selectedRow.length-1], 1));
                        textField4.setText((String) Usertable.getValueAt(selectedRow[selectedRow.length-1], 2));
                        textField5.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 3)));
                    }
                });
                scrollPane1.setViewportView(Usertable);
            }
            this.add(scrollPane1, BorderLayout.NORTH);

            //======== panel18 ========
            {
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
            this.add(panel18, BorderLayout.CENTER);
        }
    }
    public Object[][] queryUserData(java.util.List<User> list) {
//        java.util.List<User> list=this.queryAllUser();
        Object[][] data=new Object[list.size()][4];
        for(int i=0;i<list.size();i++){
            for(int j=1;j<=4;j++){
                data[i][0]=list.get(i).getUserid();
                data[i][1]=list.get(i).getUsername();
                data[i][2]=list.get(i).getPassword();
                data[i][3]=list.get(i).getFamilyid();
            }
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
    public void button5ActionPerformed(ActionEvent e) {
        this.add(new UserSearchPanel(), BorderLayout.CENTER);
    }
}