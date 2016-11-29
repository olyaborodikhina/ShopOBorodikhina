package com.myShop.ui;

import com.myShop.domain.Product;
import com.myShop.domain.Shop;
import com.myShop.exception.ClientExistsException;
import com.myShop.exception.exNotFoundProduct;

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
    private JTextArea textArea1;
    private JButton ADDButton;
    private JTextArea textArea2;
    private JTextArea textArea3;

    public Dialog(final Shop shop) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
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

        Order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOrders();
            }
        });


        //all the Products
        for(int i = 0; i < shop.products.size();i++) {
            comboBox1.addItem(shop.products.get(i).toString());
        }
        spinner1.addComponentListener(new ComponentAdapter() {});

        try {
            spinner1.commitEdit();
        } catch ( java.text.ParseException e ) {
            e.printStackTrace();
        }

        ADDButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                final int value = (Integer) spinner1.getValue();
                if(value != 0) {
                    String nameProduct = (String)comboBox1.getSelectedItem();
                    textArea1.append(nameProduct);
                    textArea1.append(" count = ");
                    textArea1.append(Integer.toString(value));
                    textArea1.append("\n");
                    nameProduct = (String)comboBox1.getSelectedItem();
                    try {
                        shop.addProductInOrder(shop.findProduct(nameProduct), value);

                    } catch (com.myShop.exception.exNotFoundProduct exNotFoundProduct) {
                        exNotFoundProduct.printStackTrace();
                    }
                    textArea2.setText("");
                    textArea2.append(Long.toString(shop.getSumOrder()));
                }
            }
        });

        Order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    shop.client.setName((String)nameTextField.getText().trim());
                    shop.client.setSurname((String)surnameTextField.getText().trim());
                    shop.client.setNumberTelephone((String)numberTelephoneTextField.getText().trim());
                    nameTextField.setText("");
                    surnameTextField.setText("");
                    numberTelephoneTextField.setText("");
                    textArea3.append(shop.client.getName()+ " " + shop.client.getSurname() + " " + shop.client.getNumberTelephone()+ " " + " sum = " + shop.curOrder.getSum());
                    textArea3.append("\n");
                    textArea2.setText("");
                    textArea1.setText("");
                    spinner1.setValue(0);
                    shop.addToOrderInTransaction(shop.client,shop.curOrder);
                } catch (ClientExistsException e1) {
                    e1.printStackTrace();
                }

            }
        });
    }

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

}
