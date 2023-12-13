import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mesclas extends JFrame implements ActionListener{
 
 private JLabel label1, label2, label3;
 private JComboBox combo1, combo2, combo3;
 private JButton boton1;

 public Mesclas(){
 setLayout(null);
 
  label1 = new JLabel("Rojo:");
  label1.setBounds(10,10,100,10);
  add(label1); 
  
  combo1 = new JComboBox();
  combo1.setBounds(120,10,50,30);
  for(int i = 0; i <=250; i++){
   combo1.addItem(String.valueOf(i));
  }
  add(combo1);  

  label2 = new JLabel("Verde:");
  label2.setBounds(10,50,100,10);
  add(label2);

  combo2 = new JComboBox();
  combo2.setBounds(120,50,50,30);
  for(int i = 0; i<=250; i++){
   combo2.addItem(String.valueOf(i));
  }
  add(combo2);

  label3 = new JLabel("Azul:");
  label3.setBounds(10,90,100,10);
  add(label3); 
  
  combo3 = new JComboBox();
  combo3.setBounds(120,90,50,30);
  for(int i = 0; i <=250; i++){
   combo3.addItem(String.valueOf(i));
  }
  add(combo3);  

  boton1 = new JButton("Fijar Color");
  boton1.setBounds(10,130,100,30);  
  boton1.addActionListener(this);
  add(boton1);
 }  
 
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
   String select1 = combo1.getSelectedItem().toString();
   String select2 = combo2.getSelectedItem().toString();
   String select3 = combo3.getSelectedItem().toString();
   
   int rojo = Integer.parseInt(select1);
   int verde = Integer.parseInt(select2);
   int azul = Integer.parseInt(select3);

   Color color1 = new Color(rojo,verde,azul);
   boton1.setBackground(color1);
  }
 }

 public static void main(String args[]){
  Mesclas wiw = new Mesclas();
  wiw.setBounds(0,0,190,220);
  wiw.setVisible(true);
  wiw.setResizable(false);
  wiw.setLocationRelativeTo(null);
 }
} 