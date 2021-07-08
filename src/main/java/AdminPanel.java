import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sun Jul 04 12:42:29 CST 2021
 */



/**
 * @author ziyue ji
 */
public class AdminPanel extends JFrame {
    public String JDBC_URL = "jdbc:mysql://localhost:3306/designbuild";
    public String JDBC_USER = "root";
    public String JDBC_PASSWORD = "root";

    public AdminPanel() {
        initComponents();
    }

    private void initComponents() {
        this.setIconImage((new ImageIcon(getClass().getResource("/home2.png")).getImage()));
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel2 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel4 = new JPanel();
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

                //======== User Management ========
                panel4 = new UserManagementPanel();
                tabbedPane1.addTab("User Management", panel4);

                //======== FamilyManagementPanel(); ==========
                panel5 = new FamilyManagementPanel();
                tabbedPane1.addTab("Family Management", panel5);

                //======== DeviceManagementPanel ========
               panel6 = new DeviceManagementPanel();
               tabbedPane1.addTab("Device Management", panel6);

                //======== panel12 ========
                panel12 = new CategoryManagementPanel();
                tabbedPane1.addTab("Category Management", panel12);

                //======== panel15 ========
                panel15 = new DataManagementPanel();
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
    private JPanel panel4;
    private JPanel panel5;
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
