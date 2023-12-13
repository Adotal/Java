import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SubMenu extends JFrame implements ActionListener{
 private JMenuBar barra1;
 private JMenu menu1, submenu1, submenu2;
 private JMenuItem object1, object2, object3, object4;

 public SubMenu(){
  setLayout(null);

  barra1 = new JMenuBar();
  setJMenuBar(barra1);

  menu1 = new JMenu("Opciones");
  barra1.add(menu1); 

  submenu1 = new JMenu("Tamaño");
  menu1.add(submenu1);  

  submenu2 = new JMenu("Color de fondo");
  menu1.add(submenu2);

  object1 = new JMenuItem("300*200");
  submenu1.add(object1);
  object1.addActionListener(this);

  object2 = new JMenuItem("640*480");
  submenu1.add(object2);
  object2.addActionListener(this);

  object3 = new JMenuItem("Rojo");
  submenu2.add(object3);
  object3.addActionListener(this);

  object4 = new JMenuItem("Azul");
  submenu2.add(object4);
  object4.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  Container fondo = this.getContentPane();
 
  if(e.getSource() == object1){
    setSize(300,200);
   }
  if(e.getSource() == object2){
    setSize(640,480);
   }
  if(e.getSource() == object3){
    getContentPane().setBackground(new Color(255,0,0));
   }
  if(e.getSource() == object4){
    getContentPane().setBackground(new Color(0,0,255));
   }
 }
 public static void main(String args[]){
  SubMenu wiw = new SubMenu();
  wiw.setBounds(0,0,300,200);
  wiw.setVisible(true);
  wiw.setLocationRelativeTo(null); 
  wiw.setResizable(false);
 }
}





