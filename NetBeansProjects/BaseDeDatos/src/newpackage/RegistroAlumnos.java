/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
//El siguiente import es necesario para conectarse a la base de datos

import java.sql.*;

import javax.swing.JOptionPane;

//Los siguientes imports son necesarios para la generación de reportes en PDF
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;

//Los siguientes importes son necesarios para la inserccion de imagenes en PDF y editar su formato de texto
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Adro
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlumnos
     */
    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        labelStatus = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Grupo:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el codigo del Alumno:");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        labelStatus.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jButton5.setText("Generar PDF");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3))
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(labelStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(29, 29, 29)
                .addComponent(labelStatus)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            /*Primeras Comillas: Ruta y nombre de base de datos
            
             *Segunda Comillas: Nombre de la base de datos (si se tiene)
                        
             *Terceras Comillas: Contraseña de base de datos (Si se tiene)
            
            
             */
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/prueba1", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into sesiones values(?,?,?)");

            //Columna , incremento
            pst.setString(1, "0");
            //Método trim quita esacios al inicio y final
            pst.setString(2, txtNombre.getText().trim());
            pst.setString(3, txtGrupo.getText().trim());

            //El metodo siguiente ejecuta el programa
            pst.executeUpdate();

            txtNombre.setText("");
            txtGrupo.setText("");
            labelStatus.setText("Registro Exitoso");
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/prueba1", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from sesiones where ID = ?");

            pst.setString(1, txtBuscar.getText().trim());

            //Result set nos permite obtener el resultado de la búsqueda
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtNombre.setText(rs.getString("NombreAlumno"));

                txtGrupo.setText(rs.getString("Grupo"));

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado \n El alumno no existe o ha ocurrido un fallo de conexión");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String ID = txtBuscar.getText().trim();

            Connection cd = DriverManager.getConnection("jdbc:mysql://localhost/prueba1", "root", "");
            PreparedStatement pst = cd.prepareStatement("update sesiones set NombreAlumno = ?, Grupo = ? where ID = " + ID);

            pst.setString(1, txtNombre.getText().trim());
            pst.setString(2, txtGrupo.getText().trim());

            pst.executeUpdate();

            labelStatus.setText("Modificación Exitosa");

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            Connection cd = DriverManager.getConnection("jdbc:mysql://localhost/prueba1", "root", "");
            PreparedStatement pst = cd.prepareStatement("delete from sesiones where ID = ?");

            pst.setString(1, txtBuscar.getText().trim());
            pst.executeUpdate();

            txtNombre.setText("");
            txtGrupo.setText("");
            txtBuscar.setText("");

            labelStatus.setText("Registro Eliminado");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Document doc = new Document();

        try {
            //Aquí va la ruta para que el archivo PDF aparezca en escritorio
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/Reporte1.pdf"));
            
            //Código para generar imagenes en el documento
            
            Image img = Image.getInstance("src/images/header.png"); //Las imagenes en Neatbeans se guardan en src
            img.scaleToFit(650, 1000); //Nos permite añadir dimensiones a la imagen
                          //Largo, escala de visualisación, (1000 es el max)
            img.setAlignment(Chunk.ALIGN_CENTER); //Nos permite alinear la imagen
            
            //Dar formato al texto:
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER); // Alinear el texto
            parrafo.add("Formato añadido por: Cup of Java© \n\n"); ///Añadir leyenda o texto
            parrafo.setFont(FontFactory.getFont("Andale Mono", 18, Font.BOLD, BaseColor.DARK_GRAY)); //Fuente d eletra, tamaño, color y acentuado
            parrafo.add("Registro de  Alumnos\n\n");
                      
            doc.open();
            doc.add(img);
            doc.add(parrafo);

            PdfPTable tabla = new PdfPTable(3);
            //addcell nos permite añadir elementos o texto en las columnas
            tabla.addCell("Código");
            tabla.addCell("Nombre Alumno");
            tabla.addCell("Grupo");

            try {

                Connection cd = DriverManager.getConnection("jdbc:mysql://localhost/prueba1", "root", "");
                PreparedStatement pst = cd.prepareStatement("select * from sesiones");
                ResultSet rs = pst.executeQuery();

                //La estructura condicional indica si se encontraron los datos
                //El do-while cicla la acción(se repite el vaciado de datos mientras encuentre más valores)
                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                    } while (rs.next());
                    //Aquí todos los datos son guardados en el documento 
                    doc.add(tabla);
                }
                //Cada vez que se abre un documento se tiene que cerrarlo:
                doc.close();
                //JOption pane de que el documento fue creado
                JOptionPane.showMessageDialog(null, "Reporte Creado");

            } catch (DocumentException | HeadlessException | SQLException eA) {
                System.out.println("Error al llenar el documento"+eA);
            }
        } catch (DocumentException | FileNotFoundException eB) {
            System.out.println("Error en el documento"+eB);

        } catch(IOException eC){
            System.out.println("Error en la imagen"+eC);
        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
