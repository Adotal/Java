import javax.swing.*;
public class Area extends JFrame{
 private JTextField box1;
 private JTextArea area1;
 
 public Area(){
 setLayout(null);
  box1 = new JTextField();
  box1.setBounds(10,10,200,30);
  add(box1);

  area1 = new JTextArea();
  area1.setBounds(10,50,400,300);
  add(area1); 
 }  
 public static void main(String args[]){
  Area wiw = new Area(); 
  wiw.setBounds(0,0,540,400);
  wiw.setVisible(true);
  wiw.setResizable(false);
  wiw.setLocationRelativeTo(null);
 }
}