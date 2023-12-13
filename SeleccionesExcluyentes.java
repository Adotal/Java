import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class SeleccionesExcluyentes extends JFrame implements ChangeListener, ActionListener{
 private JRadioButton option1, option2, option3;
 private ButtonGroup group1;
 private JButton boton1;
 public SeleccionesExcluyentes(){
  setLayout(null);
  
  group1 = new ButtonGroup();
  option1 = new JRadioButton("640*480");
  option1.setBounds(10,20,100,30);
  option1.addChangeListener(this);
  add(option1);
  group1.add(option1);

  option2 = new JRadioButton("800*600");
  option2.setBounds(10,70,100,30);
  option2.addChangeListener(this);
  add(option2);
  group1.add(option2);

  option3 = new JRadioButton("1024*768");
  option3.setBounds(10,120,100,30);
  option3.addChangeListener(this);
  add(option3);
  group1.add(option3);

  boton1 = new JButton("Cerrar");
  boton1.setBounds(150,120,100,30);
  boton1.addActionListener(this);
  add(boton1);
  
 }
 public void actionPerformed(ActionEvent e){
 if(e.getSource() == boton1){
   System.exit(0);
  }
}

 public void stateChanged(ChangeEvent e){

  if(option1.isSelected()){
    setSize(640, 480);
   }
  if(option2.isSelected()){
    setSize(800, 600);
   }
  if(option3.isSelected()){
    setSize(1024, 768);
   }
 }
 public static void main(String args[]){
  SeleccionesExcluyentes wiw = new SeleccionesExcluyentes();
  wiw.setTitle("SeleccionesExcluyentes");
  wiw.setBounds(0,0,350,230);
  wiw.setVisible(true);
  wiw.setResizable(false);
 
 }
}




