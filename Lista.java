import javax.swing.*;
import java.awt.event.*;

public class Lista extends JFrame implements ItemListener{

 private JComboBox combo1;

 public Lista(){
  setLayout(null);

  combo1 = new JComboBox();
  combo1.setBounds(10,10,80,20);
  add(combo1);
 
  combo1.addItem("rojo"); 
  combo1.addItem("verde"); 
  combo1.addItem("azul");
  combo1.addItem("negro");
  combo1.addItem("amarillo");
  combo1.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
   String selection = combo1.getSelectedItem().toString();
   setTitle(selection);
  }
 }
 public static void main(String args[]){
 Lista wiw = new Lista();
 wiw.setBounds(0,0,300,250);
 wiw.setVisible(true);
 wiw.setResizable(false);
 wiw.setLocationRelativeTo(null);
 }
}