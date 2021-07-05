import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Mon Jul 05 21:54:51 CST 2021
 */



/**
 * @author ziyue ji
 */
public class UserSearchPanel extends JPanel {
    public UserSearchPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        textField1 = new JTextField();
        comboBox1 = new JComboBox<>();
        button1 = new JButton();

        //======== this ========
        setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        add(textField1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "userid",
            "username",
            "familyid"
        }));
        add(comboBox1, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button1 ----
        button1.setText("Search");
        add(button1, new GridConstraints(0, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField textField1;
    private JComboBox<String> comboBox1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
