import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
 * Created by JFormDesigner on Tue Jul 06 22:46:51 CST 2021
 */


/**
 * @author ziyue ji
 */
public class DetailPanel extends JPanel {
    final public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final public String JDBC_USER = "root";
    final public String JDBC_PASSWORD = "root";
    public DetailPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        Usertable = new JTable();
        panel5 = new JPanel();
        panel10 = new JPanel();
        panel12 = new JPanel();
        label4 = new JLabel();
        spinner1 = new JSpinner();
        panel13 = new JPanel();
        label5 = new JLabel();
        spinner2 = new JSpinner();
        panel11 = new JPanel();
        searchtext = new JTextField();
        searchbox = new JComboBox<>();
        button1 = new JButton();

        //======== this ========
        setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {
            scrollPane1.setPreferredSize(new Dimension(453, 380));
            {
            String[] usercol = new String[] {
                    "dataid","dataname","value","time","deviceid",
            };
            DefaultTableModel tableModel=new DefaultTableModel(queryUserData(queryAllUser()),usercol){

                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                }
            };
            Usertable.setModel(tableModel);
        }
            scrollPane1.setViewportView(Usertable);
        }
        add(scrollPane1, BorderLayout.CENTER);

        //======== panel5 ========
        {
            panel5.setPreferredSize(new Dimension(20, 90));
            panel5.setLayout(new GridLayout(2, 1));

            //======== panel10 ========
            {
                panel10.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //======== panel12 ========
                {
                    panel12.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label4 ----
                    label4.setText("StartTime:");
                    panel12.add(label4, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- spinner1 ----
                    spinner1.setModel(new SpinnerDateModel(new java.util.Date((System.currentTimeMillis()/60000)*60000), null, null, java.util.Calendar.SECOND));
                    panel12.add(spinner1, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel10.add(panel12, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //======== panel13 ========
                {
                    panel13.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label5 ----
                    label5.setText("EndTime:");
                    panel13.add(label5, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- spinner2 ----
                    spinner2.setModel(new SpinnerDateModel(new java.util.Date((System.currentTimeMillis()/60000)*60000), null, null, java.util.Calendar.SECOND));
                    panel13.add(spinner2, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                panel10.add(panel13, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel5.add(panel10);

            //======== panel11 ========
            {
                panel11.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));

                //---- searchtext ----
                searchtext.setColumns(8);
                panel11.add(searchtext, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- searchbox ----
                searchbox.setModel(new DefaultComboBoxModel<>(new String[] {
                    "deviceid",
                    "categoryid",
                    "familyid"
                }));
                panel11.add(searchbox, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button1 ----
                button1.setText("Search");
                button1.addActionListener(e -> searchbuttonActionPerformed(e));
                panel11.add(button1, new GridConstraints(0, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel5.add(panel11);
        }
        add(panel5, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public Object[][] queryUserData(java.util.List<Data> list) {
//        java.util.List<User> list=this.queryAllUser();
        Object[][] data=new Object[list.size()][5];
        for(int i=0;i<list.size();i++){
            data[i][0]=list.get(i).getDataid();
            data[i][1]=list.get(i).getDataname();
            data[i][2]=list.get(i).getValue();
            data[i][3]=list.get(i).getTime();
            data[i][4]=list.get(i).getDeviceid();
        }
        return data;
    }
    public java.util.List<Data> queryAllUser(){
        String sql="select * from data";
        java.util.List<Data> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Data data = new Data();
                        data.setDataid(rs.getInt(1));
                        data.setDataname(rs.getString(2));
                        data.setValue(rs.getDouble(3));
                        data.setTime(rs.getDate(4));
                        data.setDeviceid(rs.getInt(5));
                        list.add(data);
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
        if(searchbox.getSelectedIndex()==0)sql="SELECT * FROM data WHERE deviceid=? AND time>=? AND time<=?";
        if(searchbox.getSelectedIndex()==1)sql="SELECT dataid,dataname,value,time,data.deviceid FROM data,category,device WHERE device.categoryid=category.categoryid AND data.deviceid=device.deviceid AND device.categoryid=? AND time>=? AND time<=?";
        if(searchbox.getSelectedIndex()==2)sql="SELECT dataid,dataname,value,time,data.deviceid FROM data,family,device WHERE device.familyid=family.familyid AND data.deviceid=device.deviceid AND device.familyid=? AND time>=? AND time<=?";
        List<Data> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                if(searchbox.getSelectedIndex()==0)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==1)ps.setString(1, (searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==2)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                ps.setTimestamp(2, new java.sql.Timestamp(((java.util.Date)spinner1.getValue()).getTime()));
                ps.setTimestamp(3, new java.sql.Timestamp(((java.util.Date)spinner2.getValue()).getTime()));
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Data data = new Data();
                        data.setDataid(rs.getInt(1));
                        data.setDataname(rs.getString(2));
                        data.setValue(rs.getDouble(3));
                        data.setTime(rs.getDate(4));
                        data.setDeviceid(rs.getInt(5));
                        list.add(data);
                    }
                    String[] usercol = new String[] {
                            "dataid","dataname","value","time","deviceid",
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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable Usertable;
    private JPanel panel5;
    private JPanel panel10;
    private JPanel panel12;
    private JLabel label4;
    private JSpinner spinner1;
    private JPanel panel13;
    private JLabel label5;
    private JSpinner spinner2;
    private JPanel panel11;
    private JTextField searchtext;
    private JComboBox<String> searchbox;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
