import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Tue Jul 06 14:05:23 CST 2021
 */



/**
 * @author ziyue ji
 */
public class FamilyManagementPanel extends JPanel {
    public FamilyManagementPanel() {
        initComponents();
    }

    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel7 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
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

        //======== this ========
        setLayout(new BorderLayout());

        //======== panel7 ========
        {
            panel7.setMinimumSize(new Dimension(197, 35));
            panel7.setPreferredSize(new Dimension(197, 40));
            panel7.setLayout(new GridLayoutManager(1, 6, new Insets(0, 0, 0, 0), 0, 0));

            //---- button2 ----
            button2.setText("Refresh");
            panel7.add(button2, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button1 ----
            button1.setText("Add");
            panel7.add(button1, new GridConstraints(0, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button6 ----
            button6.setText("Update");
            button6.addActionListener(e -> button6ActionPerformed(e));
            panel7.add(button6, new GridConstraints(0, 4, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button7 ----
            button7.setText("Delete");
            panel7.add(button7, new GridConstraints(0, 5, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        add(panel7, BorderLayout.SOUTH);

        //======== scrollPane1 ========
        {
            scrollPane1.setPreferredSize(new Dimension(453, 500));

            //---- table1 ----
            table1.setPreferredScrollableViewportSize(new Dimension(450, 450));
            scrollPane1.setViewportView(table1);
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
                    "familyid\t",
                    "familyname"
                }));
                this2.add(searchbox, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- searchbutton ----
                searchbutton.setText("Search");
                this2.add(searchbutton, new GridConstraints(0, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(this2, BorderLayout.NORTH);

            //======== panel2 ========
            {
                panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //======== panel3 ========
                {
                    panel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label1 ----
                    label1.setText("familyid:");
                    panel3.add(label1, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //---- textField1 ----
                    textField1.setColumns(8);
                    textField1.setEditable(false);
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
                    label2.setText("familyname:");
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
            }
            panel1.add(panel2, BorderLayout.CENTER);
        }
        add(panel1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel7;
    private JButton button2;
    private JButton button1;
    private JButton button6;
    private JButton button7;
    private JScrollPane scrollPane1;
    private JTable table1;
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
