import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Terminos1 extends JFrame implements ActionListener, ChangeListener{
 private JLabel label1;
 private JCheckBox check1;
 private JButton boton1;
 private JTextArea area1;

 public Terminos1(){
  setLayout(null);

  label1 = new JLabel("Aceptar Terminos y Condiciones");
  label1.setBounds(10,10,400,30);
  add(label1);

  area1 = new JTextArea("bla bla bla y mas texto aburrido");
  area1.setBounds(10,40,200,15);
  add(area1);

  check1 = new JCheckBox("Acepto");
  check1.setBounds(10,70,100,30);
  check1.addChangeListener(this);
  add(check1); 
 
  boton1 = new JButton("Continuar");
  boton1.setBounds(10,120,100,30);
  boton1.addActionListener(this);
  add(boton1);
  boton1.setEnabled(false);
 }
 public void stateChanged(ChangeEvent e){
  if(check1.isSelected() == true){
    boton1.setEnabled(true);
   }
  else{
    boton1.setEnabled(false);
   }
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    System.exit(0);
   }
 }
 public static void main(String args[]){
  Terminos1 wiw = new Terminos1();
  wiw.setBounds(0,0,350,250);
  wiw.setVisible(true);
  wiw.setLocationRelativeTo(null);
  wiw.setResizable(false);
 }
}





