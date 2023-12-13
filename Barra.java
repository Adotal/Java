import javax.swing.*;
public class Barra extends JFrame{

 private JTextField box1;
 private JScrollPane scroll1;
 private JTextArea area1;
 
 public Barra(){
  setLayout(null);

  box1 = new JTextField();
  box1.setBounds(10,10,200,30);
  add(box1);

  area1 = new JTextArea();
  scroll1 = new JScrollPane(area1);
  scroll1.setBounds(10,50,400,300);
  add(scroll1);
 }
 public static void main(String args[]){
 Barra wiw = new Barra();
 wiw.setBounds(0,0,540,400);
 wiw.setVisible(true);
 wiw.setResizable(false);
 wiw.setLocationRelativeTo(null);
 
 }
}