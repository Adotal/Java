import javax.swing.*;
public class Formulario extends JFrame{
  private JLabel label1;
 public Formulario(){ 
  setLayout(null);
  label1 = new JLabel("La enciclopedia de adro");
  label1.setBounds(10,20,200,300);
  add(label1);
 }
  public static void main(String args[]){
  Formulario form1 = new Formulario();
  form1.setBounds(0,0,400,300);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
 } 
}