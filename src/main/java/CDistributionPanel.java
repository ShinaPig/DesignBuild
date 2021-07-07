import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.PieStyler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
/*
 * Created by JFormDesigner on Wed Jul 07 00:08:44 CST 2021
 */


/**
 * @author ziyue ji
 */
public class CDistributionPanel extends JPanel {
    private int companyid;
    final public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final public String JDBC_USER = "root";
    final public String JDBC_PASSWORD = "root";
    public CDistributionPanel(int companyid) {
        this.companyid=companyid;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel6 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        label1 = new JLabel();
        spinner1 = new JSpinner();
        panel4 = new JPanel();
        label2 = new JLabel();
        spinner2 = new JSpinner();
        panel7 = new JPanel();
        label4 = new JLabel();
        textField1 = new JTextField();
        panel8 = new JPanel();
        label5 = new JLabel();
        textField2 = new JTextField();
        panel5 = new JPanel();
        label3 = new JLabel();
        comboBox1 = new JComboBox<>();
        button1 = new JButton();

        //======== this ========
        setLayout(new BorderLayout());

        //======== panel6 ========
        {
            panel6.setLayout(new GridLayout(1, 1));
        }
        add(panel6, BorderLayout.CENTER);

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(40, 132));
            panel2.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

            //======== panel3 ========
            {
                panel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //---- label1 ----
                label1.setText("StartTime:");
                panel3.add(label1, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- spinner1 ----
                spinner1.setModel(new SpinnerDateModel(new java.util.Date((System.currentTimeMillis() / 60000) * 60000), null, null, java.util.Calendar.SECOND));
                panel3.add(spinner1, new GridConstraints(0, 1, 1, 1,
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
                label2.setText("EndTime:");
                panel4.add(label2, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- spinner2 ----
                spinner2.setModel(new SpinnerDateModel(new java.util.Date((System.currentTimeMillis() / 60000) * 60000), null, null, java.util.Calendar.SECOND));
                panel4.add(spinner2, new GridConstraints(0, 1, 1, 1,
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

            //======== panel7 ========
            {
                panel7.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //---- label4 ----
                label4.setText("BreakPoint1:");
                panel7.add(label4, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- textField1 ----
                textField1.setColumns(8);
                panel7.add(textField1, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
            panel2.add(panel7, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //======== panel8 ========
            {
                panel8.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //---- label5 ----
                label5.setText("BreakPoint2:");
                panel8.add(label5, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- textField2 ----
                textField2.setColumns(8);
                panel8.add(textField2, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
            panel2.add(panel8, new GridConstraints(1, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //======== panel5 ========
            {
                panel5.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //---- label3 ----
                label3.setText("Category:");
                panel5.add(label3, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[]{
                        "humidity",
                        "temperature",
                }));
                panel5.add(comboBox1, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
            }
            panel2.add(panel5, new GridConstraints(2, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

            //---- button1 ----
            button1.setText("Distribution");
            button1.addActionListener(e->searchbuttonActionPerformed(e));
            panel2.add(button1, new GridConstraints(2, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
        }
        add(panel2, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    private void searchbuttonActionPerformed(ActionEvent e) {
        int number1=0,number2=0,number3=0;
        String sql=null;
        sql="SELECT count(*) FROM data,device WHERE device.deviceid=data.deviceid and dataname=? AND time>=? AND time<=? AND value<=? and companyid="+companyid;
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, String.valueOf(comboBox1.getSelectedItem())); // 注意：索引从1开始
                ps.setDouble(4, Double.parseDouble(textField1.getText().trim())); // 注意：索引从1开始
                ps.setTimestamp(2, new Timestamp(((java.util.Date)spinner1.getValue()).getTime()));
                ps.setTimestamp(3, new Timestamp(((java.util.Date)spinner2.getValue()).getTime()));
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        number1=rs.getInt(1);
                    }
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        sql="SELECT count(*) FROM data,device WHERE device.deviceid=data.deviceid and dataname=? AND time>=? AND time<=? AND value>? AND value<=? and companyid="+companyid;
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, String.valueOf(comboBox1.getSelectedItem())); // 注意：索引从1开始
                ps.setDouble(4, Double.parseDouble(textField1.getText().trim())); // 注意：索引从1开始
                ps.setDouble(5, Double.parseDouble(textField2.getText().trim())); // 注意：索引从1开始
                ps.setTimestamp(2, new Timestamp(((java.util.Date)spinner1.getValue()).getTime()));
                ps.setTimestamp(3, new Timestamp(((java.util.Date)spinner2.getValue()).getTime()));
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        number2=rs.getInt(1);
                    }
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        sql="SELECT count(*) FROM data,device WHERE device.deviceid=data.deviceid and dataname=? AND time>=? AND time<=? AND value>? and companyid="+companyid;
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, String.valueOf(comboBox1.getSelectedItem())); // 注意：索引从1开始
                ps.setDouble(4, Double.parseDouble(textField2.getText().trim())); // 注意：索引从1开始
                ps.setTimestamp(2, new Timestamp(((java.util.Date)spinner1.getValue()).getTime()));
                ps.setTimestamp(3, new Timestamp(((java.util.Date)spinner2.getValue()).getTime()));
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        number3=rs.getInt(1);
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        PieChart chart = (new PieChartBuilder()).width(300).height(200).title(comboBox1.getSelectedItem() +" distribution").build();
        Color[] sliceColors = new Color[]{new Color(224, 68, 14), new Color(230, 105, 62), new Color(236, 143, 110)};
        chart.getStyler().setSeriesColors(sliceColors);
        chart.getStyler().setAnnotationType(PieStyler.AnnotationType.Value);
        chart.getStyler().setToolTipsEnabled(true);
        chart.addSeries("<="+textField1.getText().trim(), number1);
        chart.addSeries(textField1.getText().trim()+"< AND <="+textField2.getText().trim(), number2);
        chart.addSeries(">"+textField2.getText().trim(), number3);
        remove(panel6);
        panel6 = new XChartPanel(chart);
        add(panel6, BorderLayout.CENTER);
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel6;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label1;
    private JSpinner spinner1;
    private JPanel panel4;
    private JLabel label2;
    private JSpinner spinner2;
    private JPanel panel7;
    private JLabel label4;
    private JTextField textField1;
    private JPanel panel8;
    private JLabel label5;
    private JTextField textField2;
    private JPanel panel5;
    private JLabel label3;
    private JComboBox<String> comboBox1;
    private JButton button1;
    private PieChart chart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}