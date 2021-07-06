import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Jul 06 20:20:16 CST 2021
 */



/**
 * @author ziyue ji
 */
public class DataManagementPanel extends JPanel {
    public DataManagementPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();

        //======== this ========
        setLayout(new BorderLayout());

        //======== tabbedPane1 ========
        {
            tabbedPane1.setTabPlacement(SwingConstants.BOTTOM);

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());
            }
            tabbedPane1.addTab("text", panel1);
        }
        add(tabbedPane1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
