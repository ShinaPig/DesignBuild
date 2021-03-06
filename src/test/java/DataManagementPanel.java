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
        Detail = new JPanel();
        Compare = new JPanel();
        Distribution = new JPanel();
        Summary = new JPanel();

        //======== this ========
        setLayout(new BorderLayout());

        //======== tabbedPane1 ========
        {
            tabbedPane1.setTabPlacement(SwingConstants.BOTTOM);

            //======== Detail ========
            {
                Detail.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
            }
            tabbedPane1.addTab("Detail", Detail);

            //======== Compare ========
            {
                Compare.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
            }
            tabbedPane1.addTab("Compare", Compare);

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
    private JPanel Detail;
    private JPanel Compare;
    private JPanel Distribution;
    private JPanel Summary;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
