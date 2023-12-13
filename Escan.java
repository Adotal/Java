import javax.swing.*;
import java.util.Scanner;
public class Escan extends JFrame{
  Scanner in = new Scanner(System.in);
  int letter = 0;
  private JLabel label1;
  private JLabel label2;
  public Escan(){
   System.out.println("Da un valor");
   letter = in.nextInt();
   setLayout(null);
   label1 = new JLabel("El numero ingresado en la cuenta es: " + letter);
   label2 = new JLabel("00000000000000000000000000000000000000000000");
   label1.setBounds(5,0,300,30);
   label2.setBounds(5,50,300,30);
   add(label1);
   add(label2);

  } 
  public static void main(String args[]){
  Escan wiw = new Escan();
  wiw.setBounds(0,0,600,400);
  wiw.setResizable(true);
  wiw.setLocationRelativeTo(null);
  wiw.setVisible(true);
 }
}