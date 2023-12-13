package gui_int;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// @author Adro
public class Interfaz_Uno extends JFrame implements ActionListener {

    private JLabel label1;
    private JTextField text1;
    private JButton boton1;

    public Interfaz_Uno() {
        setLayout(null);
        setTitle("GUI Principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(222, 222, 222));

        label1 = new JLabel("Escribe: ");
        label1.setBounds(15, 10, 100, 30);
        label1.setForeground(new Color(20,20,50));
        add(label1);

        text1 = new JTextField();
        text1.setBounds(80, 16, 190, 20);
        text1.setBackground(new Color(220,220,250));
        text1.setFont(new Font("Andale Mono", 1, 14));
        
        add(text1);

        boton1 = new JButton("Mostrar");
        boton1.setBounds(10, 60, 100, 30);
        boton1.addActionListener(this);
        add(boton1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == boton1) {

            String temp = text1.getText();
            JOptionPane.showMessageDialog(null, "Tu mensaje es: \n  " + temp);
        }

    }
    public static void main(String[] args) {
        Interfaz_Uno wiw = new Interfaz_Uno();
        wiw.setBounds(0,0,300,180);
        wiw.setVisible(true);
        wiw.setLocationRelativeTo(null);
        wiw.setResizable(false);
    }

}
