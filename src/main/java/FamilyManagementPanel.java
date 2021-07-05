import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;

public class FamilyManagementPanel extends JPanel {
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
    public FamilyManagementPanel(){
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
        {
            this.setLayout(new BorderLayout());

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
            this.add(panel8, BorderLayout.SOUTH);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(table2);
            }
            this.add(scrollPane2, BorderLayout.NORTH);

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
            this.add(panel23, BorderLayout.CENTER);
        }
    }
}
