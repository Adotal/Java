import javax.swing.*;
import java.awt.event.*;
public class Pasar extends JFrame implements ActionListener{
 private JTextField box1, box2;
 private JLabel label1, label2, label3;
 private JButton boton1;
 
 public Pasar(){
 setLayout(null);
 
 label1 = new JLabel("Valor 1:");
 label1.setBounds(50,5,100,30);
 add(label1);

 label2 = new JLabel("Valor 2:");
 label2.setBounds(50,35,100,30);
 add(label2);

 label3 = new JLabel("Resultado:");
 label3.setBounds(120,80,100,30);
 add(label3);

  box1 = new JTextField();
  box1.setBounds(120,10,150,20);
  add(box1);
  
  box2 = new JTextField();
  box2.setBounds(120,40,150,20);
  add(box2);

  boton1 = new JButton("Sumar");
  boton1.setBounds(10,80,100,30);
  boton1.addActionListener(this);
  add(boton1);
 }
 public void actionPerformed(ActionEvent e){
 
 if(e.getSource() == boton1){
   int num1 = 0, num2 = 0, resultado = 0;
   
   num1 = Integer.parseInt(box1.getText());
   num2 = Integer.parseInt(box2.getText());
   resultado = num1 + num2;
 
   label3.setText("Resultado: " + resultado);
  }
 }
 public static void main(String args[]){
  Pasar wiw = new Pasar();
  wiw.setBounds(0,0,300,150);
  wiw.setVisible(true);
  wiw.setResizable(false);
  wiw.setLocationRelativeTo(null);
 }
}