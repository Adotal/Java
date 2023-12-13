import javax.swing.*;
public class Formulario extends JFrame{
 public Formulario(){
  setLayout(null);
 }
  public static void main(String args[]){
  Formulario object = new Formulario();
  object.setBounds(0,0,400,550);  
  object.setVisible(true);
  object.setLocationRelativeTo(null);
  object.setResizable(false);
 }
}