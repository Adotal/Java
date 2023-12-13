import javax.swing.*;
public class Etiqueta extends JFrame{
  private JLabel label1;
  private JLabel label2;
  public Etiqueta(){
   setLayout(null);
   label1 = new JLabel("Interfaz Grafica.");
   label1.setBounds(10,20,300,30);
   add(label1);
   label2 = new JLabel("Version 2.0");
   label2.setBounds(10,100,100,30);
   add(label2);
  } 
  public static void main(String args[]){
  Etiqueta wiw = new Etiqueta();
  wiw.setBounds(0,0,300,200);
  wiw.setResizable(false);
  wiw.setLocationRelativeTo(null);
  wiw.setVisible(true);
 }
}