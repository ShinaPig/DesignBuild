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
 * Created by JFormDesigner on Mon Jul 05 20:35:21 CST 2021
 */


/**
 * @author ziyue ji
 */
public class CategoryManagementPanel extends JPanel {
    final public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final public String JDBC_USER = "root";
    final public String JDBC_PASSWORD = "root";
    public CategoryManagementPanel() {
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
                    "categoryid", "famliyname",
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
                panel18.setMinimumSize(new Dimension(193, 30));
                panel18.setPreferredSize(new Dimension(332, 40));
                panel18.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //======== panel19 ========
                {
                    panel19.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label2 ----
                    label2.setText("categoryid:");
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
                    label3.setText("categoryname:");
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
                        "categoryid",
                        "categoryname",
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
    public Object[][] queryUserData(List<Category> list) {
//        java.util.List<User> list=this.queryAllUser();
        Object[][] data=new Object[list.size()][2];
        for(int i=0;i<list.size();i++){
            data[i][0]=list.get(i).getCategoryid();
            data[i][1]=list.get(i).getCategoryname();
        }
        return data;
    }
    public List<Category> queryAllUser(){
        String sql="select * from category";
        List<Category> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Category category=new Category();
                        category.setCategoryid(rs.getInt(1));
                        category.setCategoryname(rs.getString(2));
                        list.add(category);
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
        if(searchbox.getSelectedIndex()==0)sql="SELECT * FROM category WHERE categoryid=?";
        if(searchbox.getSelectedIndex()==1)sql="SELECT * FROM category WHERE categoryname=?";
        List<Category> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                if(searchbox.getSelectedIndex()==0)ps.setInt(1, Integer.valueOf(searchtext.getText().trim())); // 注意：索引从1开始
                if(searchbox.getSelectedIndex()==1)ps.setString(1, (searchtext.getText().trim())); // 注意：索引从1开始
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Category category=new Category();
                        category.setCategoryid(rs.getInt(1));
                        category.setCategoryname(rs.getString(2));
                        list.add(category);
                    }
                    String[] usercol = new String[] {
                            "categoryid","categoryname",
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
        sql="SELECT * FROM category";
        List<Category> list=new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Category category=new Category();
                        category.setCategoryid(rs.getInt(1));
                        category.setCategoryname(rs.getString(2));
                        list.add(category);
                    }
                    String[] usercol = new String[] {
                            "categoryid","categoryname",
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
        if(JOptionPane.showConfirmDialog(null, "Sure to update the category information?", "Update",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "UPDATE category SET categoryname=? WHERE categoryid=?";
            List<Category> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, textField3.getText());
                    ps.setInt(2, Integer.parseInt(textField2.getText().trim()));
                    if(textField3.getText().isEmpty())JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error!",JOptionPane.ERROR_MESSAGE);
                    else{int n = ps.executeUpdate();
                        if(n!=0)JOptionPane.showMessageDialog(null, "Update the category information successfully!");
                        if(n==0)JOptionPane.showMessageDialog(null, "Update wrong!", "Error!",JOptionPane.WARNING_MESSAGE);}
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    private void button1ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to add the category?", "Add",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
            sql = "INSERT INTO category (categoryname) VALUES (?)";
            List<Category> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                try (PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, textField3.getText());
                    //ps.setInt(4, Integer.parseInt(textField2.getText().trim()));
                    if(textField3.getText().isEmpty())JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error!",JOptionPane.ERROR_MESSAGE);
                    else{int n = ps.executeUpdate();
                        if(n!=0)JOptionPane.showMessageDialog(null, "Add the category information successfully!");
                        if(n==0)JOptionPane.showMessageDialog(null, "Add wrong!", "Error!",JOptionPane.WARNING_MESSAGE);}
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    private void button7ActionPerformed(ActionEvent e) {
        if(JOptionPane.showConfirmDialog(null, "Sure to delete the category?", "Delete",JOptionPane.YES_NO_OPTION)==0) //返回值为0或1
        {
            String sql = null;
//            List<User> list = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                sql = "DELETE data FROM data, device WHERE device.categoryid=? AND data.deviceid=device.deviceid";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, Integer.parseInt(textField2.getText().trim()));
                    ps.executeUpdate();
                } catch (SQLException throwables) {
//                    JOptionPane.showMessageDialog(null, "Categoryid cannot be found!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
                sql = "DELETE device FROM device WHERE device.categoryid=?";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, Integer.parseInt(textField2.getText().trim()));
                    ps.executeUpdate();
                } catch (SQLException throwables) {
//                    JOptionPane.showMessageDialog(null, "Categoryid cannot be found!", "Error!",JOptionPane.ERROR_MESSAGE);
                    throwables.printStackTrace();
                }
                sql = "DELETE category FROM category WHERE categoryid=?";
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, Integer.parseInt(textField2.getText().trim()));
                    int n= ps.executeUpdate();
                    if(n!=0)JOptionPane.showMessageDialog(null, "Delete the user information successfully!");
                    if(n==0)JOptionPane.showMessageDialog(null, "Delete wrong!", "Error!",JOptionPane.WARNING_MESSAGE);
                } catch (SQLException throwables) {
//                    JOptionPane.showMessageDialog(null, "Categoryid cannot be found!", "Error!",JOptionPane.ERROR_MESSAGE);
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
