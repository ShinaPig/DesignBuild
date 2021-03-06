import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sun Jul 04 15:24:50 CST 2021
 */



/**
 * @author ziyue ji
 */
public class CompanyPanel extends JFrame {
    public CompanyPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel2 = new JPanel();
        tabbedPane1 = new JTabbedPane();
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
        setTitle("Company System");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setLayout(new BorderLayout());

            //======== tabbedPane1 ========
            {

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
