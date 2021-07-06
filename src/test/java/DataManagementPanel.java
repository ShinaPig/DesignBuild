import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
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
        panel22 = new JPanel();
        panel23 = new JPanel();
        Distribution = new JPanel();
        Summary = new JPanel();

        //======== this ========
        setLayout(new BorderLayout());

        //======== tabbedPane1 ========
        {
            tabbedPane1.setTabPlacement(SwingConstants.BOTTOM);

            //======== panel22 ========
            {
                panel22.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
            }
            tabbedPane1.addTab("Detail", panel22);

            //======== panel23 ========
            {
                panel23.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
            }
            tabbedPane1.addTab("Compare", panel23);

            //======== Distribution ========
            {
                Distribution.setLayout(new BorderLayout());
            }
            tabbedPane1.addTab("Distribution", Distribution);

            //======== Summary ========
            {
                Summary.setLayout(new BorderLayout());
            }
            tabbedPane1.addTab("Summary", Summary);
        }
        add(tabbedPane1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTabbedPane tabbedPane1;
    private JPanel panel22;
    private JPanel panel23;
    private JPanel Distribution;
    private JPanel Summary;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
