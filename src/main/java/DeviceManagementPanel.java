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
/*
 * Created by JFormDesigner on Tue Jul 06 15:34:08 CST 2021
 */


/**
 * @author ziyue ji
 */
public class DeviceManagementPanel extends JPanel {
    final public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final public String JDBC_USER = "root";
    final public String JDBC_PASSWORD = "root";
    public DeviceManagementPanel() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel7 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        scrollPane1 = new JScrollPane();
        Usertable = new JTable();
        panel1 = new JPanel();
        this2 = new JPanel();
        searchtext = new JTextField();
        searchbox = new JComboBox<>();
        searchbutton = new JButton();
        panel2 = new JPanel();
        panel3 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel4 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        panel5 = new JPanel();
        label3 = new JLabel();
        textField3 = new JTextField();
        panel6 = new JPanel();
        label4 = new JLabel();
        textField4 = new JTextField();
        panel8 = new JPanel();
        label5 = new JLabel();
        textField5 = new JTextField();
        panel9 = new JPanel();
        label6 = new JLabel();
        textField6 = new JTextField();

        //======== this ========
        setLayout(new BorderLayout());

        //======== panel7 ========
        {
            panel7.setMinimumSize(new Dimension(197, 35));
            panel7.setPreferredSize(new Dimension(197, 40));
            panel7.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), 0, 0));

            //---- button2 ----
            button2.setText("Refresh");
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel7.add(button2, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button1 ----
            button1.setText("Add");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel7.add(button1, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button6 ----
            button6.setText("Update");
            button6.addActionListener(e -> button6ActionPerformed(e));
            panel7.add(button6, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button7 ----
            button7.setText("Delete");
            button7.addActionListener(e -> button7ActionPerformed(e));
            panel7.add(button7, new GridConstraints(0, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        add(panel7, BorderLayout.SOUTH);

        //======== scrollPane1 ========
        {
            String[] usercol = new String[] {
                    "deviceid", "devicename", "description", "categoryid","familyid","companyid",
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
                        textField1.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 0)));
                        textField2.setText((String) Usertable.getValueAt(selectedRow[selectedRow.length-1], 1));
                        textField3.setText((String) Usertable.getValueAt(selectedRow[selectedRow.length-1], 2));
                        textField4.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 3)));
                        textField5.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 4)));
                        textField6.setText(String.valueOf(Usertable.getValueAt(selectedRow[selectedRow.length-1], 5)));
                    }
                }
            });
            scrollPane1.setPreferredSize(new Dimension(453, 380));

            //---- Usertable ----
            scrollPane1.setViewportView(Usertable);
        }
        add(scrollPane1, BorderLayout.NORTH);

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());

            //======== this2 ========
            {
                this2.setPreferredSize(new Dimension(174, 40));
                this2.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));

                //---- searchtext ----
                searchtext.setColumns(8);
                this2.add(searchtext, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- searchbox ----
                searchbox.setModel(new DefaultComboBoxModel<>(new String[] {
                    "deviceid",
                    "devicename",
                    "categoryid",
                    "familyid",
                    "companyid"
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

            //======== panel2 ========
            {
                panel2.setPreferredSize(new Dimension(325, 90));
                panel2.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                //======== panel3 ========
                {
                    panel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label1 ----
                    label1.setText("deviceid:");
                    panel3.add(label1, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- textField1 ----
                    textField1.setColumns(8);
                    panel3.add(textField1, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel2.add(panel3, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //======== panel4 ========
                {
                    panel4.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label2 ----
                    label2.setText("devicename:");
                    panel4.add(label2, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- textField2 ----
                    textField2.setColumns(8);
                    panel4.add(textField2, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel2.add(panel4, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //======== panel5 ========
                {
                    panel5.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label3 ----
                    label3.setText("description:");
                    panel5.add(label3, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- textField3 ----
                    textField3.setColumns(8);
                    panel5.add(textField3, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel2.add(panel5, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //======== panel6 ========
                {
                    panel6.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label4 ----
                    label4.setText("categoryid:");
                    panel6.add(label4, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- textField4 ----
                    textField4.setColumns(8);
                    panel6.add(textField4, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel2.add(panel6, new GridConstraints(1, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //======== panel8 ========
                {
                    panel8.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label5 ----
                    label5.setText("familyid:");
                    panel8.add(label5, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- textField5 ----
                    textField5.setColumns(8);
                    panel8.add(textField5, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel2.add(panel8, new GridConstraints(2, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //======== panel9 ========
                {
                    panel9.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label6 ----
                    label6.setText("companyid");
                    panel9.add(label6, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- textField6 ----
                    textField6.setColumns(8);
                    panel9.add(textField6, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel2.add(panel9, new GridConstraints(2, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel2, BorderLayout.CENTER);
        }
        add(panel1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public Object[][] queryUserData(java.util.List<Device> list) {
//        java.util.List<User> list=this.queryAllUser();
        Object[][] data=new Object[list.size()][6];
        for(int i=0;i<list.size();i++){
            data[i][0] = list.get(i).getDeviceid();
            data[i][1] = list.get(i).getDevicename();
            data[i][2] = list.get(i).getDescription();
            data[i][3] = list.get(i).getCategoryid();
            data[i][4] = list.get(i).getFamilyid();
            data[i][5] = list.get(i).getCompanyid();
        }
        return data;
    }
    public java.util.List<Device> queryAllUser(){
        String sql="select * from device";
        java.util.List<Device> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Device device=new Device();
                        device.setDeviceid(rs.getInt(1));
                        device.setDevicename(rs.getString(2));
                        device.setDescription(rs.getString(3));
                        device.setCategoryid(rs.getInt(4));
                        device.setFamilyid(rs.getInt(5));
                        device.setCompanyid(rs.getInt(6));
                        list.add(device);
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
        if(searchbox.getSelectedIndex()==0)sql="SELECT * FROM device WHERE deviceid=?";
        if(searchbox.getSelectedIndex()==1)sql="SELECT * FROM device WHERE devicename=?";
        if(searchbox.getSelectedIndex()==2)sql="SELECT * FROM device WHERE categoryid=?";
        if(searchbox.getSelectedIndex()==3)sql="SELECT * FROM device WHERE familyid=?";
        if(searchbox.getSelectedIndex()==4)sql="SELECT * FROM device WHERE companyid=?";
        java.util.List<Device> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                if(searchbox.getSelectedIndex()==0)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==2)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==3)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==4)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==1)ps.setString(1, (searchtext.getText().trim())); // 注意：索引从1开始
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Device device=new Device();
                        device.setDeviceid(rs.getInt(1));
                        device.setDevicename(rs.getString(2));
                        device.setDescription(rs.getString(3));
                        device.setCategoryid(rs.getInt(4));
                        device.setFamilyid(rs.getInt(5));
                        device.setCompanyid(rs.getInt(6));
                        list.add(device);
                    }
                    String[] usercol = new String[] {
                            "deviceid","devicename","description","categoryid","familyid","companyid",
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
        sql="SELECT * FROM device";
        java.util.List<Device> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Device device=new Device();
                        device.setDeviceid(rs.getInt(1));
                        device.setDevicename(rs.getString(2));
                        device.setDescription(rs.getString(3));
                        device.setCategoryid(rs.getInt(4));
                        device.setFamilyid(rs.getInt(5));
                        device.setCompanyid(rs.getInt(6));
                        list.add(device);
                    }
                    String[] usercol = new String[] {
                            "deviceid","devicename","description","categoryid","familyid","companyid",
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
    private void button6ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to update the family information?", "Update",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "UPDATE device SET devicename=?,description=?,categoryid=?,familyid=?,companyid=? WHERE deviceid=?";
            //java.util.List<Family> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, textField2.getText());
                    ps.setString(2, textField3.getText());
                    ps.setInt(3, Integer.parseInt(textField4.getText().trim()));
                    ps.setInt(4, Integer.parseInt(textField5.getText().trim()));
                    ps.setInt(5, Integer.parseInt(textField6.getText().trim()));
                    ps.setInt(6, Integer.parseInt(textField1.getText().trim()));
                    if(textField2.getText().isEmpty()||textField4.getText().isEmpty()||textField5.getText().isEmpty()||textField6.getText().isEmpty())JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error!",JOptionPane.ERROR_MESSAGE);
                    else{int n = ps.executeUpdate();
                        if(n!=0)JOptionPane.showMessageDialog(null, "Update the device information successfully!");}
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null, "Some fields are wrong!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    private void button1ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to add the family?", "Add",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "INSERT INTO device (devicename,description,categoryid,familyid,companyid) VALUES (?,?,?,?,?)";
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, textField2.getText());
                    ps.setString(2, textField3.getText());
                    ps.setInt(3, Integer.parseInt(textField4.getText().trim()));
                    ps.setInt(4, Integer.parseInt(textField5.getText().trim()));
                    ps.setInt(5, Integer.parseInt(textField6.getText().trim()));
                    if(textField2.getText().isEmpty()||textField4.getText().isEmpty()||textField5.getText().isEmpty()||textField6.getText().isEmpty())JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error!",JOptionPane.ERROR_MESSAGE);
                    else{int n = ps.executeUpdate();
                        if(n!=0)JOptionPane.showMessageDialog(null, "Add the device information successfully!");}
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(null, "Some fields are wrong!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    private void button7ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to delete the device?", "Delete",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
//            List<User> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                sql = "DELETE data FROM data, device WHERE device.deviceid=? AND data.deviceid=device.deviceid";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, Integer.parseInt(textField1.getText().trim()));
                    ps.executeUpdate();
                } catch (SQLException throwables) {
//                    JOptionPane.showMessageDialog(null, "Familyid cannot be found!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
                sql = "DELETE device FROM device WHERE device.deviceid=?";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, Integer.parseInt(textField1.getText().trim()));
                    if(ps.executeUpdate()!=0)JOptionPane.showMessageDialog(null, "Delete the user information successfully!");
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
    private JButton button1;
    private JButton button6;
    private JButton button7;
    private JScrollPane scrollPane1;
    private JTable Usertable;
    private JPanel panel1;
    private JPanel this2;
    private JTextField searchtext;
    private JComboBox<String> searchbox;
    private JButton searchbutton;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel4;
    private JLabel label2;
    private JTextField textField2;
    private JPanel panel5;
    private JLabel label3;
    private JTextField textField3;
    private JPanel panel6;
    private JLabel label4;
    private JTextField textField4;
    private JPanel panel8;
    private JLabel label5;
    private JTextField textField5;
    private JPanel panel9;
    private JLabel label6;
    private JTextField textField6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
