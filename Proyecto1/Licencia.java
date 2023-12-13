import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
 private JLabel label1, label2;
 private JTextArea area1;
 private JCheckBox check1;
 private JScrollPane scroll0;
 private JButton boton1, boton2;
 String Name2 = "";

 public Licencia(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Licencia de uso");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  Bienvenida window1 = new Bienvenida();
  Name2 = window1.Name1;         

  ImageIcon imagen1 = new ImageIcon("images/coca-cola.png");

  label1 = new JLabel("TÉRMINOS Y CONDICIONES");
  label1.setBounds(215,5,200,30);
  label1.setFont(new Font("Andale Mono", 1, 14));
  label1.setForeground(new Color(0,0,0));
  add(label1);

  label2 = new JLabel(imagen1);
  label2.setBounds(315,135,300,300);
  add(label2);

  area1 = new JTextArea();
  area1.setEditable(false);
  area1.setFont(new Font("Andale Mono", 0, 12));
  area1.setText("\n\n          TÉRMINOS Y CONDICIONES:" +
                "\n\n          >No esta permitido modificar el programa ni alterarlo de su estado originar." +           
                "\n\n          >La informacion presentada es completamente CONFIDENCIAL por lo que el usuario" +
                "\n             no tiene derecho de difundirla ni de compartirla." +
                "\n\n          >Bla bla la blallalaallala y texto aburrido, complejo y aveces dificil de" +
                "\n             comprender que es ignorado aunque aveces oculte un engaño, una estafa o" +
                "\n             simplemente ocultan algo que no quieren que alguien ajeno a la  'Empresa'" +
                "\n             tenga el conocimiento, y con razón, la arruinaria por completo. \n\n");                
  scroll0 = new JScrollPane(area1);
  scroll0.setBounds(10,40,575,200);
  add(scroll0);
  
  check1 = new JCheckBox("Yo " + Name2 + " Acepto");
  check1.setBounds(10,250,300,30);
  check1.addChangeListener(this);
  add(check1);

  boton1 = new JButton("Continuar");
  boton1.setBounds(10,290,100,30);
  boton1.addActionListener(this);
  boton1.setEnabled(false);
  add(boton1);

  boton2 = new JButton("No acepto");
  boton2.setBounds(120,290,100,30);
  boton2.addActionListener(this);
  boton2.setEnabled(true);
  add(boton2);
 }
 public void stateChanged(ChangeEvent e){
 if(check1.isSelected() == true){
   boton1.setEnabled(true);
   boton2.setEnabled(false);
  } else {
   boton1.setEnabled(false);
   boton2.setEnabled(true); 
  }
}
 public void actionPerformed(ActionEvent e){
 if(e.getSource() == boton1){
    Principal wiw = new Principal();
    wiw.setBounds(0,0,640,535);
    wiw.setVisible(true);
    wiw.setResizable(false);
    wiw.setLocationRelativeTo(null);
    this.setVisible(false);

  } else if(e.getSource() == boton2){
     Bienvenida wiw = new Bienvenida();
     wiw.setBounds(0,0,350,450);
     wiw.setVisible(true);
     wiw.setLocationRelativeTo(null);
     wiw.setResizable(false);
     this.setVisible(false);
   }
}
 public static void main(String args[]){
  Licencia wiw = new Licencia();
  wiw.setBounds(0,0,610,370);
  wiw.setVisible(true);
  wiw.setResizable(false);
  wiw.setLocationRelativeTo(null);
 }
}





