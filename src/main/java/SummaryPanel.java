import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * Created by JFormDesigner on Tue Jul 06 23:43:41 CST 2021
 */


/**
 * @author ziyue ji
 */
public class SummaryPanel extends JPanel {
    final public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    final public String JDBC_USER = "root";
    final public String JDBC_PASSWORD = "root";
    public SummaryPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel2 = new JPanel();
        panel3 = new JPanel();
        label1 = new JLabel();
        spinner1 = new JSpinner();
        panel4 = new JPanel();
        label2 = new JLabel();
        spinner2 = new JSpinner();
        panel5 = new JPanel();
        label3 = new JLabel();
        comboBox1 = new JComboBox<>();
        button1 = new JButton();
        panel6 = new JPanel();

        //======== this ========
        setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(406, 80));
            panel2.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

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
                spinner1.setModel(new SpinnerDateModel(new java.util.Date((System.currentTimeMillis()/60000)*60000), null, null, java.util.Calendar.SECOND));
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
                spinner2.setModel(new SpinnerDateModel(new java.util.Date((System.currentTimeMillis()/60000)*60000), null, null, java.util.Calendar.SECOND));
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
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "humidity",
                    "temperature",
                }));
                panel5.add(comboBox1, new GridConstraints(0, 1, 1, 1,
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

            //---- button1 ----
            button1.setText("Statistics");
            button1.addActionListener(e->searchbuttonActionPerformed(e));
            panel2.add(button1, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        add(panel2, BorderLayout.SOUTH);

        //======== panel6 ========
        {
            panel6.setLayout(new GridLayout(1, 1));
        }
        add(panel6, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    private void searchbuttonActionPerformed(ActionEvent e) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        String sql=null;
        sql="SELECT AVG(value),family.familyid FROM data,family,device WHERE dataname=? AND time>=? AND time<=? AND data.deviceid=device.deviceid AND device.familyid = family.familyid GROUP BY family.familyid";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, String.valueOf(comboBox1.getSelectedItem())); // 注意：索引从1开始
                ps.setTimestamp(2, new java.sql.Timestamp(((java.util.Date)spinner1.getValue()).getTime()));
                ps.setTimestamp(3, new java.sql.Timestamp(((java.util.Date)spinner2.getValue()).getTime()));
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        list1.add(rs.getInt(1));
                        list2.add(rs.getInt(2));
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        for (Integer s : list1) {
            System.out.println(s);
        }
        CategoryChart chart = ((((new CategoryChartBuilder()).width(300)).height(200)).title(comboBox1.getSelectedItem() +" summary")).xAxisTitle("familyid").yAxisTitle("Number").build();
        Color[] sliceColors = new Color[]{new Color(224, 68, 14), new Color(230, 105, 62), new Color(236, 143, 110)};
        chart.getStyler().setLegendPosition(Styler.LegendPosition.OutsideE);
        chart.getStyler().setSeriesColors(sliceColors);
        chart.getStyler().setHasAnnotations(false);
        chart.getStyler().setToolTipsEnabled(true);
        chart.getStyler().setPlotGridLinesVisible(false);
        chart.addSeries((String) comboBox1.getSelectedItem(), list2, list1);
        remove(panel6);
        panel6 = new XChartPanel(chart);
        add(panel6, BorderLayout.CENTER);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label1;
    private JSpinner spinner1;
    private JPanel panel4;
    private JLabel label2;
    private JSpinner spinner2;
    private JPanel panel5;
    private JLabel label3;
    private JComboBox<String> comboBox1;
    private JButton button1;
    private JPanel panel6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
