import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jul 04 16:28:53 CST 2021
 */



/**
 * @author ziyue ji
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label3 = new JLabel();
        username = new JTextField();
        panel3 = new JPanel();
        label2 = new JLabel();
        password = new JPasswordField();
        panel4 = new JPanel();
        button1 = new JButton();

        //======== this ========
        setBackground(Color.white);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Management System");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 1));

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setLayout(new GridLayout(4, 1));

            //---- label1 ----
            label1.setText("Welcome to Mangament System");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Sarasa UI SC", Font.PLAIN, 22));
            panel1.add(label1);

            //======== panel2 ========
            {
                panel2.setBackground(Color.white);
                panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

                //---- label3 ----
                label3.setText("Username:");
                panel2.add(label3);

                //---- username ----
                username.setColumns(20);
                panel2.add(username);
            }
            panel1.add(panel2);

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);
                panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

                //---- label2 ----
                label2.setText("Password:");
                panel3.add(label2);

                //---- password ----
                password.setColumns(20);
                password.setFont(new Font("Sarasa UI SC", Font.PLAIN, 14));
                panel3.add(password);
            }
            panel1.add(panel3);

            //======== panel4 ========
            {
                panel4.setBackground(Color.white);
                panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

                //---- button1 ----
                button1.setText("Login");
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel4.add(button1);
            }
            panel1.add(panel4);
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel2;
    private JLabel label3;
    private JTextField username;
    private JPanel panel3;
    private JLabel label2;
    private JPasswordField password;
    private JPanel panel4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
