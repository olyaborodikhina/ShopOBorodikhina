package UI;

import javax.swing.*;
import java.awt.event.*;

public class Dialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JSpinner spinner1;
    private JComboBox comboBox1;
    private JTextField surnameTextField;
    private JTextField numberTelephoneTextField;
    private JTextField nameTextField;
    private JButton Order;
    private JLabel Name;
    private JTable Orders;


    public Dialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });


        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        Orders.addComponentListener(new ComponentAdapter() {
        });
        Order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOrders();
            }
        });
        nameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              //  onName();
            }
        });
    }

//    private void onName(){
//        String name = "";
//        JOptionPane.showMessageDialog(name,
//                nameTextField.getText());
//    }

    private void onOrders(){
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

//    private void Orders() {
//        String[] columnNames = {
//                "Name",
//                "Last modified",
//                "Type",
//                "Size"
//        };
//
//        String[][] data = {
//                {"addins", "02.11.2006 19:15", "Folder", ""},
//                {"AppPatch", "03.10.2006 14:10", "Folder", ""},
//                {"assembly", "02.11.2006 14:20", "Folder", ""},
//                {"Boot", "13.10.2007 10:46", "Folder", ""},
//                {"Branding", "13.10.2007 12:10", "Folder", ""},
//                {"Cursors", "23.09.2006 16:34", "Folder", ""},
//                {"Debug", "07.12.2006 17:45", "Folder", ""},
//                {"Fonts", "03.10.2006 14:08", "Folder", ""},
//                {"Help", "08.11.2006 18:23", "Folder", ""},
//                {"explorer.exe", "18.10.2006 14:13", "File", "2,93MB"},
//                {"helppane.exe", "22.08.2006 11:39", "File", "4,58MB"},
//                {"twunk.exe", "19.08.2007 10:37", "File", "1,08MB"},
//                {"nsreg.exe", "07.08.2007 11:14", "File", "2,10MB"},
//                {"avisp.exe", "17.12.2007 16:58", "File", "12,67MB"},
//        };
//
//        Orders = new JTable(data, columnNames);
//       // dispose();
//    }


    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
