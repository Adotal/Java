import javax.swing.*;
import java.awt.event.*;
public class Toxt extends JFrame implements ActionListener{
 private JTextField box1;
 private JButton boton1, boton2;
 private JLabel label1; 
 public Toxt(){
  setLayout(null);
  box1 = new JTextField();
  box1.setBounds(120,17,150,20);
  add(box1);

  label1 = new JLabel("Usuario:");
  label1.setBounds(10,10,100,30);
  add(label1);

  boton1 = new JButton("Aceptar");
  boton1.setBounds(10,80,100,30);
  add(boton1);
  boton1.addActionListener(this);

  boton2 = new JButton("Cerrar");
  boton2.setBounds(200,80,80,30);
  add(boton2);
  boton2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    String text = box1.getText();
    setTitle(text);
   }
   if(e.getSource() == boton2){
    System.exit(0); 
   }
  }
  public static void main(String args[]){
   Toxt wiw = new Toxt();
   wiw.setBounds(0,0,300,200);
   wiw.setVisible(true);
   wiw.setResizable(false);
   wiw.setLocationRelativeTo(null);
 }
}
