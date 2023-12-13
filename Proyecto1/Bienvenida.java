import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
 private JLabel label1, label2, label3, label4;
 private JTextField caja1;
 private JButton boton1;
 public static String Name1 = "";

 public Bienvenida(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Bienvenido");
  getContentPane().setBackground(new Color(255,10,10));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  ImageIcon imagen1 = new ImageIcon("images/logo-coca.png");


  label1 = new JLabel(imagen1);
  label1.setBounds(25,15,300,150);
  add(label1);

  label2 = new JLabel("Sisema de Control Vacacional");
  label2.setBounds(35,135,300,30);
  label2.setFont(new Font("Andale Mono", 3, 18));
  label2.setForeground(new Color(255,255,255));
  add(label2);
  
  label3 = new JLabel("Ingrese su nombre:");
  label3.setBounds(45,212,200,30);
  label3.setFont(new Font("Andale Mono", 1, 12));
  label3.setForeground(new Color(255,255,255));
  add(label3);
 
  label4 = new JLabel("©2020 The Coca-Cola Company");
  label4.setBounds(85,375,300,30);
  label4.setFont(new Font("Andale Mono", 3, 12));
  label4.setForeground(new Color(255,255,255));
  add(label4);

  caja1 = new JTextField();
  caja1.setBounds(45,240,255,25);
  caja1.setBackground(new Color(224,224,224));
  caja1.setFont(new Font("Andale Mono", 1, 14));
  caja1.setForeground(new Color(255,0,0));
  add(caja1);
 
  boton1 = new JButton("Ingresar");
  boton1.setBounds(125,280,100,30);
  boton1.setBackground(new Color(255,255,255));
  boton1.setFont(new Font("Andale Mono", 1, 14));
  boton1.setForeground(new Color(255,0,0));
  boton1.addActionListener(this);
  add(boton1);
 }
 public void actionPerformed(ActionEvent e){

  if(e.getSource() == boton1){   
    Name1 = caja1.getText().trim();
    if(Name1.equals("")){
      JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
     } else {
         Licencia wiw = new Licencia();
         wiw.setBounds(0,0,610,370);
         wiw.setVisible(true);
         wiw.setResizable(false);
         wiw.setLocationRelativeTo(null);
         this.setVisible(false);
      }
   }
  
 }
 public static void main(String args[]){
  Bienvenida wiw = new Bienvenida();
  wiw.setBounds(0,0,350,450);
  wiw.setVisible(true);
  wiw.setLocationRelativeTo(null);
  wiw.setResizable(false);
 }
}











