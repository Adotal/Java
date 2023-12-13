import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu1 extends JFrame implements ActionListener{

 private JMenuBar barra1;
 private JMenu menu1;
 private JMenuItem object1, object2, object3;

 public Menu1(){
  setLayout(null);
  setTitle("Menu1");
  barra1 = new JMenuBar();
  setJMenuBar(barra1);

  menu1 = new JMenu("Opciones");
  barra1.add(menu1);

  object1 = new JMenuItem("Rojo");
  object1.addActionListener(this); 
  menu1.add(object1);

  object2 = new JMenuItem("Verde");
  object2.addActionListener(this);
  menu1.add(object2);
 
  object3 = new JMenuItem("Azul");
  object3.addActionListener(this);
  menu1.add(object3);
 }
 public void actionPerformed(ActionEvent e){
  Container fondo = this.getContentPane();

  if(e.getSource() == object1){
    fondo.setBackground(new Color(255,0,0));
   }  
  if(e.getSource() == object2){
    fondo.setBackground(new Color(0,255,0));
   }
  if(e.getSource() == object3){
    fondo.setBackground(new Color(0,0,255));
   }
 }
 public static void main(String args[]){

  Menu1 wiw = new Menu1();
  wiw.setBounds(0,0,400,300);
  wiw.setVisible(true);
  wiw.setLocationRelativeTo(null);
  wiw.setResizable(true);
 }
}




