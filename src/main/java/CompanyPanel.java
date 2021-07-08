import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Jul 04 15:24:50 CST 2021
 */


/**
 * @author ziyue ji
 */
public class CompanyPanel extends JFrame {
    private int companyid=-1;
    public CompanyPanel(int companyid) {
        this.companyid=companyid;
        initComponents();
    }

    private void initComponents() {
        this.setIconImage((new ImageIcon(getClass().getResource("/home2.png")).getImage()));
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
                    panel6=new CDeviceManagementPanel(companyid);
                }
                tabbedPane1.addTab("Device Management", panel6);

                //======== panel12 ========
                {
                    panel12 = new CCategoryManagementPanel(companyid);
                }
                tabbedPane1.addTab("Category Management", panel12);

                //======== panel15 ========
                {
                    panel15 = new CDataManagementPanel(companyid);
                }
                tabbedPane1.addTab("Data Management", panel15);
            }
            panel2.add(tabbedPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel2, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
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
