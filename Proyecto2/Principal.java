import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{

 private JButton boton1;
 private JLabel labelLogo, labelWLC, labelDatos, labelName, labelSur1, labelSur2, labelDep, labelOld, labelCal, labelLey;
 private JMenuBar menubar;
 private JMenu menuOptions, menuInf, submenuColors;
 private JMenuItem object1, object2, object3, object4, object5, object6, object7;
 private JTextField boxName, boxSur1, boxSur2;
 private JComboBox comboDep, comboOld;
 private JTextArea areaCal;
 private JScrollPane scrollCal;
 String Name2 = "";

 public Principal(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Pantalla Principal");
  getContentPane().setBackground(new Color(255,10,10));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
 
  Bienvenida window1 = new Bienvenida();
  Name2 = window1.Name1;
  
 
  ImageIcon imagen1 = new ImageIcon("images/logo-coca.png");
  labelLogo = new JLabel(imagen1);
  labelLogo.setBounds(5,5,250,100);
  add(labelLogo);

  menubar = new JMenuBar();
  menubar.setBackground(new Color(255,10,10));
  setJMenuBar(menubar);


  menuOptions = new JMenu("Opciones");
  menuOptions.setBackground(new Color(255,10,10));
  menuOptions.setFont(new Font("Andale Mono", 1, 14));
  menuOptions.setForeground(new Color(255,255,255));
  menubar.add(menuOptions);

  submenuColors = new JMenu("Color de Fondo");
  submenuColors.setFont(new Font("Andale Mono", 1, 14));
  submenuColors.setForeground(new Color(255,10,10));
  menuOptions.add(submenuColors);
  

  object3 = new JMenuItem("Rojo");
  object3.setFont(new Font("Andale Mono", 1, 14));
  object3.setForeground(new Color(255,10,10));
  object3.addActionListener(this);
  submenuColors.add(object3);

  object4 = new JMenuItem("Azul");
  object4.setFont(new Font("Andale Mono", 1, 14));
  object4.setForeground(new Color(255,10,10));
  object4.addActionListener(this);
  submenuColors.add(object4);

  object5 = new JMenuItem("Morado");
  object5.setFont(new Font("Andale Mono", 1, 14));
  object5.setForeground(new Color(255,10,10));
  object5.addActionListener(this);
  submenuColors.add(object5);

  object1 = new JMenuItem("Nuevo");
  object1.setFont(new Font("Andale Mono", 1, 14));
  object1.setForeground(new Color(255,10,10));
  object1.addActionListener(this);
  menuOptions.add(object1);

  object2 = new JMenuItem("Salir");
  object2.setFont(new Font("Andale Mono", 1, 14));
  object2.setForeground(new Color(255,10,10));
  object2.addActionListener(this);
  menuOptions.add(object2);

  menuInf = new JMenu("Acerca de");
  menuInf.setBackground(new Color(255,10,10));
  menuInf.setFont(new Font("Andale Mono", 1, 14));
  menuInf.setForeground(new Color(255,255,255));
  menubar.add(menuInf);

  object7 = new JMenuItem("El Creador");
  object7.setFont(new Font("Andale Mono", 1, 14));
  object7.setForeground(new Color(255,10,10));
  object7.addActionListener(this);
  menuInf.add(object7);


  labelWLC = new JLabel("Bienvenid@ " + Name2);
  labelWLC.setBounds(280,30,300,50);
  labelWLC.setFont(new Font("Andale Mono", 1, 32));
  labelWLC.setForeground(new Color(255,255,255));
  add(labelWLC);


  labelDatos = new JLabel("Datos del trabajador para el cálculo de vacaciones");
  labelDatos.setBounds(45,140,900,25);
  labelDatos.setFont(new Font("Andale Mono", 0, 24));
  labelDatos.setForeground(new Color(255,255,255));
  add(labelDatos);


  labelName = new JLabel("Nombre completo:");
  labelName.setBounds(25,188,180,25);
  labelName.setFont(new Font("Andale Mono", 1, 12));
  labelName.setForeground(new Color(255,255,255));  
  add(labelName);

  boxName = new JTextField();  
  boxName.setBounds(25,213,150,25);
  boxName.setBackground(new Color(224,224,224));
  boxName.setFont(new Font("Andale Mono", 1, 14));
  boxName.setForeground(new Color(255,10,10));
  add(boxName);


  labelSur1 = new JLabel("Apellido Paterno:");
  labelSur1.setBounds(25,248,180,25);
  labelSur1.setFont(new Font("Andale Mono", 1, 12));
  labelSur1.setForeground(new Color(255,255,255));  
  add(labelSur1);

  boxSur1 = new JTextField();  
  boxSur1.setBounds(25,273,150,25);
  boxSur1.setBackground(new Color(224,224,224));
  boxSur1.setFont(new Font("Andale Mono", 1, 14));
  boxSur1.setForeground(new Color(255,10,10));
  add(boxSur1);


  labelSur2 = new JLabel("Apellido Materno");
  labelSur2.setBounds(25,308,180,25);
  labelSur2.setFont(new Font("Andale Mono", 1, 12));
  labelSur2.setForeground(new Color(255,255,255));  
  add(labelSur2);

  boxSur2 = new JTextField();  
  boxSur2.setBounds(25,334,150,25);
  boxSur2.setBackground(new Color(224,224,224));
  boxSur2.setFont(new Font("Andale Mono", 1, 14));
  boxSur2.setForeground(new Color(255,10,10));
  add(boxSur2);


  labelDep = new JLabel("Selecciona el Departmento");
  labelDep.setBounds(220,188,180,25);
  labelDep.setFont(new Font("Andale Mono", 1, 12));
  labelDep.setForeground(new Color(255,255,255));
  add(labelDep);

  comboDep = new JComboBox();
  comboDep.setBounds(220,213,220,25);
  comboDep.setBackground(new Color(224,224,224));
  comboDep.setFont(new Font("Andale Mono", 1, 14));
  comboDep.setForeground(new Color(255,10,10));
  comboDep.addItem("");
  comboDep.addItem("Atención al Cliente");
  comboDep.addItem("Departamento de Logística");
  comboDep.addItem("Departamento de Gerencia");
  add(comboDep);
  

  labelOld = new JLabel("Selecciona la Antigüedad");
  labelOld.setBounds(220,248,180,25);
  labelOld.setFont(new Font("Andale Mono", 1, 12));
  labelOld.setForeground(new Color(255,255,255));
  add(labelOld);

  comboOld = new JComboBox();
  comboOld.setBounds(220,273,220,25);
  comboOld.setBackground(new Color(224,224,224));
  comboOld.setFont(new Font("Andale Mono", 1, 14));
  comboOld.setForeground(new Color(255,10,10));
  comboOld.addItem("");
  comboOld.addItem("1 año de servicio");
  comboOld.addItem("2 a 6 años de servicio");
  comboOld.addItem("7 o más años de servicio");
  add(comboOld);

  boton1 = new JButton("Calcular");
  boton1.setBounds(450,260,140,40);
  boton1.setBackground(new Color(224,224,224));
  boton1.setFont(new Font("Andale Mono", 1, 14));
  boton1.setForeground(new Color(255,10,10));
  boton1.addActionListener(this);
  add(boton1);

  labelCal = new JLabel("Resultado del Cálculo:");
  labelCal.setBounds(220,307,180,25);
  labelCal.setFont(new Font("Andale Mono", 1, 12));
  labelCal.setForeground(new Color(255,255,255));
  add(labelCal);

  areaCal = new JTextArea();
  areaCal.setEditable(false);
  areaCal.setBackground(new Color(224,224,224));
  areaCal.setFont(new Font("Andale Mono", 1, 12));
  areaCal.setForeground(new Color(255,10,10));
  areaCal.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones");
  scrollCal = new JScrollPane(areaCal);
  scrollCal.setBounds(220,333,385,90);
  add(scrollCal);

  labelLey = new JLabel("©2020 The Coca-Cola Company | Todos los derechos reservados");
  labelLey.setBounds(135,445,500,30);
  labelLey.setFont(new Font("Andale Mono", 1, 12));
  labelLey.setForeground(new Color(255,255,255));
  add(labelLey);  
 }
 public void actionPerformed(ActionEvent e){

  if(e.getSource() == object1){  //Nuevo//
    boxName.setText("");
    boxSur1.setText("");
    boxSur2.setText("");
    comboDep.setSelectedIndex(0);
    comboOld.setSelectedIndex(0);
    areaCal.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones");
   }
  if(e.getSource() == object2){  //Salir//
    System.exit(0);
   }
  if(e.getSource() == object3){  //Rojo//
    getContentPane().setBackground(new Color(255,10,10));
   }
  if(e.getSource() == object4){  //Azul//
    getContentPane().setBackground(new Color(10,10,200));
   }
  if(e.getSource() == object5){  //Morado//
    getContentPane().setBackground(new Color(100,0,100));
   }
  if(e.getSource() == boton1){  //Vacaciones//

    String Name = boxName.getText();
    String Sur1 = boxSur1.getText();
    String Sur2 = boxSur2.getText();
    String Dep  = comboDep.getSelectedItem().toString(); 
    String Old  = comboOld.getSelectedItem().toString();

    if(Name.equals("") || Sur1.equals("") || Sur2.equals("") ||
       Dep.equals("") || Old.equals("")){
       JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.\n   :D"); 
    } else {
      if(Dep.equals("Atención al Cliente")){
        if(Old.equals("1 año de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 6 días de vacaciones.");
        }
        if(Old.equals("2 a 6 años de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 14 días de vacaciones.");
        }
        if(Old.equals("7 o más años de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 20 días de vacaciones.");
        }
       }
      if(Dep.equals("Departamento de Logística")){
        if(Old.equals("1 año de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 7 días de vacaciones.");
        }
        if(Old.equals("2 a 6 años de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 14 días de vacaciones.");
        }
        if(Old.equals("7 o más años de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 20 días de vacaciones.");
        }
       }
      if(Dep.equals("Departamento de Gerencia")){
       if(Old.equals("1 año de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 10 días de vacaciones.");
       }
       if(Old.equals("2 a 6 años de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 20 días de vacaciones.");
       }
       if(Old.equals("7 o más años de servicio")){
         areaCal.setText("\n   El trabajador " + Name + " " + Sur1 + " " + Sur2 +
                         "\n   quien labora en " + Dep + " con " + Old +
                         "\n   recibe 30 días de vacaciones.");
       }
      }
     }
   }
  if(e.getSource() == object7){  //El Creador//
    JOptionPane.showMessageDialog(null, "Creado por:\nOrnelas Ornelas Adro Yael");
   }

 } 
 public static void main(String args[]){
  Principal wiw = new Principal();
  wiw.setBounds(0,0,640,535);
  wiw.setVisible(true);
  wiw.setResizable(false);
  wiw.setLocationRelativeTo(null);
 }
}
