import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sun Jul 04 12:42:29 CST 2021
 */



/**
 * @author ziyue ji
 */
public class AdminPanel extends JFrame {
    public AdminPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel2 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel4 = new JPanel();
        panel7 = new JPanel();
        button5 = new JButton();
        button14 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
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
        panel5 = new JPanel();
        panel8 = new JPanel();
        button8 = new JButton();
        button21 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        panel23 = new JPanel();
        panel24 = new JPanel();
        label6 = new JLabel();
        textField6 = new JTextField();
        panel25 = new JPanel();
        label7 = new JLabel();
        textField7 = new JTextField();
        panel26 = new JPanel();
        label8 = new JLabel();
        textField8 = new JPasswordField();
        panel27 = new JPanel();
        label9 = new JLabel();
        textField9 = new JTextField();
        panel6 = new JPanel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        panel12 = new JPanel();
        panel13 = new JPanel();
        panel14 = new JPanel();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        panel15 = new JPanel();
        panel16 = new JPanel();
        panel17 = new JPanel();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();

        //======== this ========
        setTitle("Admin System");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setLayout(new BorderLayout());

            //======== tabbedPane1 ========
            {

                //======== panel4 ========
                {
                    panel4.setLayout(new BorderLayout());

                    //======== panel7 ========
                    {
                        panel7.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), 0, 0));

                        //---- button5 ----
                        button5.setText("Search");
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
                        button6.setText("Add");
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
                    panel4.add(panel7, BorderLayout.SOUTH);

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(table1);
                    }
                    panel4.add(scrollPane1, BorderLayout.NORTH);

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
                    panel4.add(panel18, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("User Management", panel4);

                //======== panel5 ========
                {
                    panel5.setLayout(new BorderLayout());

                    //======== panel8 ========
                    {
                        panel8.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), 0, 0));

                        //---- button8 ----
                        button8.setText("Search");
                        panel8.add(button8, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button21 ----
                        button21.setText("Reset Password");
                        panel8.add(button21, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button9 ----
                        button9.setText("Add");
                        panel8.add(button9, new GridConstraints(0, 2, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button10 ----
                        button10.setText("Delete");
                        panel8.add(button10, new GridConstraints(0, 3, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel5.add(panel8, BorderLayout.SOUTH);

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(table2);
                    }
                    panel5.add(scrollPane2, BorderLayout.NORTH);

                    //======== panel23 ========
                    {
                        panel23.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //======== panel24 ========
                        {
                            panel24.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                            //---- label6 ----
                            label6.setText("userid:");
                            panel24.add(label6, new GridConstraints(0, 0, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- textField6 ----
                            textField6.setColumns(8);
                            panel24.add(textField6, new GridConstraints(0, 1, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
                        }
                        panel23.add(panel24, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //======== panel25 ========
                        {
                            panel25.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                            //---- label7 ----
                            label7.setText("username:");
                            panel25.add(label7, new GridConstraints(0, 0, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- textField7 ----
                            textField7.setColumns(8);
                            panel25.add(textField7, new GridConstraints(0, 1, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
                        }
                        panel23.add(panel25, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //======== panel26 ========
                        {
                            panel26.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                            //---- label8 ----
                            label8.setText("password:");
                            panel26.add(label8, new GridConstraints(0, 0, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- textField8 ----
                            textField8.setColumns(8);
                            panel26.add(textField8, new GridConstraints(0, 1, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
                        }
                        panel23.add(panel26, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //======== panel27 ========
                        {
                            panel27.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                            //---- label9 ----
                            label9.setText("familyid:");
                            panel27.add(label9, new GridConstraints(0, 0, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- textField9 ----
                            textField9.setColumns(8);
                            panel27.add(textField9, new GridConstraints(0, 1, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
                        }
                        panel23.add(panel27, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel5.add(panel23, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("Family Management", panel5);

                //======== panel6 ========
                {
                    panel6.setLayout(new BorderLayout());

                    //======== panel10 ========
                    {
                        panel10.setLayout(new BorderLayout());

                        //======== panel11 ========
                        {
                            panel11.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));

                            //---- button11 ----
                            button11.setText("Acquire");
                            panel11.add(button11, new GridConstraints(0, 0, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- button12 ----
                            button12.setText("Add");
                            panel11.add(button12, new GridConstraints(0, 1, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- button13 ----
                            button13.setText("Delete");
                            panel11.add(button13, new GridConstraints(0, 2, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
                        }
                        panel10.add(panel11, BorderLayout.SOUTH);
                    }
                    panel6.add(panel10, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("Device Management", panel6);

                //======== panel12 ========
                {
                    panel12.setLayout(new BorderLayout());

                    //======== panel13 ========
                    {
                        panel13.setLayout(new BorderLayout());

                        //======== panel14 ========
                        {
                            panel14.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));

                            //---- button15 ----
                            button15.setText("Acquire");
                            panel14.add(button15, new GridConstraints(0, 0, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- button16 ----
                            button16.setText("Add");
                            panel14.add(button16, new GridConstraints(0, 1, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- button17 ----
                            button17.setText("Delete");
                            panel14.add(button17, new GridConstraints(0, 2, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
                        }
                        panel13.add(panel14, BorderLayout.SOUTH);
                    }
                    panel12.add(panel13, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("Category Management", panel12);

                //======== panel15 ========
                {
                    panel15.setLayout(new BorderLayout());

                    //======== panel16 ========
                    {
                        panel16.setLayout(new BorderLayout());

                        //======== panel17 ========
                        {
                            panel17.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));

                            //---- button18 ----
                            button18.setText("Acquire");
                            panel17.add(button18, new GridConstraints(0, 0, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- button19 ----
                            button19.setText("Add");
                            panel17.add(button19, new GridConstraints(0, 1, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));

                            //---- button20 ----
                            button20.setText("Delete");
                            panel17.add(button20, new GridConstraints(0, 2, 1, 1,
                                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                null, null, null));
                        }
                        panel16.add(panel17, BorderLayout.SOUTH);
                    }
                    panel15.add(panel16, BorderLayout.CENTER);
                }
                tabbedPane1.addTab("Data Management", panel15);
            }
            panel2.add(tabbedPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel2, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel2;
    private JTabbedPane tabbedPane1;
    private JPanel panel4;
    private JPanel panel7;
    private JButton button5;
    private JButton button14;
    private JButton button6;
    private JButton button7;
    private JScrollPane scrollPane1;
    private JTable table1;
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
    private JPanel panel5;
    private JPanel panel8;
    private JButton button8;
    private JButton button21;
    private JButton button9;
    private JButton button10;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JPanel panel23;
    private JPanel panel24;
    private JLabel label6;
    private JTextField textField6;
    private JPanel panel25;
    private JLabel label7;
    private JTextField textField7;
    private JPanel panel26;
    private JLabel label8;
    private JPasswordField textField8;
    private JPanel panel27;
    private JLabel label9;
    private JTextField textField9;
    private JPanel panel6;
    private JPanel panel10;
    private JPanel panel11;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JPanel panel12;
    private JPanel panel13;
    private JPanel panel14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JPanel panel15;
    private JPanel panel16;
    private JPanel panel17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
