import javax.swing.*;
import java.awt.event.*;
public class Mover extends JFrame implements ActionListener{
 private JTextField box1;
 private JButton boton1;
 private JScrollPane scroll1;
 private JTextArea area1;

 String texto = "";

  public Mover(){
  setLayout(null);
 
  box1 = new JTextField();
  box1.setBounds(10,10,200,30);
  add(box1);

  boton1 = new JButton("Agregar");
  boton1.setBounds(250,10,100,30);
  add(boton1);
  boton1.addActionListener(this);

  area1 = new JTextArea();
  scroll1 = new JScrollPane(area1);
  scroll1.setBounds(10,50,400,300);
  add(scroll1);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    texto += box1.getText() + "\n";
    area1.setText(texto);
    box1.setText("");
   } 
  }
 public static void main(String args[]){
  Mover wiw = new Mover();
  wiw.setBounds(0,0,540,400);
  wiw.setVisible(true);
  wiw.setResizable(false);
  wiw.setLocationRelativeTo(null);
 }
}

