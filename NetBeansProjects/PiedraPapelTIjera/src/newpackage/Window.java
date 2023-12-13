package newpackage;

import java.applet.AudioClip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * @author Adro
   1.Version = 20/02/2021
 */
public class Window extends JFrame implements ActionListener {

    int aleatorio = (int) (Math.random() * 3 + 1);
    private JButton botonPiedra, botonPapel, botonTijera, botonStart, botonRestart, botonExit, botonCon, botonInicio;
    private JLabel labelPiedra, labelPapel, labelTijera, labelTitle, labelInd, labelCPU, labelCPUimg, labelEstado, labelCredit;
    private AudioClip adc;

    ImageIcon imagenPiedra = new ImageIcon("src/images/Piedra.png");
    ImageIcon imagenPapel = new ImageIcon("src/images/Papel.png");
    ImageIcon imagenTijera = new ImageIcon("src/images/Tijera.png");

    public Window() {
        this.setTitle("Piedra, Papel o Tijera");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon Icon = new ImageIcon("src/images/Icon.png");
        this.setIconImage(Icon.getImage());
        getContentPane().setBackground(new Color(200, 200, 230));
        adc = java.applet.Applet.newAudioClip(getClass().getResource("/sounds/Promises.wav"));

        botonExit = new JButton("Salir");
        botonExit.setBounds(15, 20, 70, 30);
        botonExit.addActionListener(this);
        add(botonExit);

        botonInicio = new JButton("Menú principal");
        botonInicio.setBounds(100, 20, 130, 30);
        botonInicio.addActionListener(this);
        botonInicio.setVisible(false);
        add(botonInicio);

        botonStart = new JButton("Iniciar");
        botonStart.setFont(new Font("Andale Mono", 0, 20));
        botonStart.setBounds(390, 190, 100, 40);
        botonStart.addActionListener(this);
        add(botonStart);

        botonCon = new JButton("Configuración");
        botonCon.setBounds(340, 260, 200, 40);
        botonCon.setFont(new Font("Andale Mono", 0, 20));
        botonCon.addActionListener(this);
        add(botonCon);

        labelPiedra = new JLabel("Piedra");
        labelPiedra.setBounds(160, 410, 100, 50);
        labelPiedra.setFont(new Font("Comic Sans", 1, 18));
        labelPiedra.setVisible(false);
        add(labelPiedra);

        botonPiedra = new JButton(imagenPiedra);
        botonPiedra.setBounds(115, 460, 150, 150);
        botonPiedra.addActionListener(this);
        botonPiedra.setEnabled(false);
        botonPiedra.setVisible(false);
        add(botonPiedra);

        labelPapel = new JLabel("Papel");
        labelPapel.setBounds(410, 410, 100, 50);
        labelPapel.setFont(new Font("Comic Sans", 1, 18));
        labelPapel.setVisible(false);
        add(labelPapel);

        botonPapel = new JButton(imagenPapel);
        botonPapel.setBounds(365, 460, 150, 150);
        botonPapel.addActionListener(this);
        botonPapel.setEnabled(false);
        botonPapel.setVisible(false);
        add(botonPapel);

        labelTijera = new JLabel("Tijera");
        labelTijera.setBounds(660, 410, 100, 50);
        labelTijera.setFont(new Font("Comic Sans", 1, 18));
        labelTijera.setVisible(false);
        add(labelTijera);

        botonTijera = new JButton(imagenTijera);
        botonTijera.setBounds(615, 460, 150, 150);
        botonTijera.addActionListener(this);
        botonTijera.setEnabled(false);
        botonTijera.setVisible(false);
        add(botonTijera);

        labelTitle = new JLabel("Piedra, Papel o Tijera");
        labelTitle.setBounds(300, 10, 700, 50);
        labelTitle.setFont(new Font("Georgia", 1, 25));
        labelTitle.setVisible(true);
        add(labelTitle);

        labelInd = new JLabel("Elige una de las tres opciones para Iniciar...");
        labelInd.setBounds(250, 120, 400, 300);
        labelInd.setFont(new Font("Georgia", 0, 20));
        labelInd.setForeground(new Color(50, 50, 150));
        labelInd.setVisible(false);
        add(labelInd);

        botonRestart = new JButton("Reiniciar partida");
        botonRestart.setFont(new Font("Andale Mono", 1, 13));
        botonRestart.setBounds(720, 20, 140, 40);
        botonRestart.addActionListener(this);
        botonRestart.setEnabled(false);
        botonRestart.setVisible(false);
        add(botonRestart);

        labelCPU = new JLabel();
        labelCPU.setBounds(350, 140, 240, 40);
        labelCPU.setFont(new Font("Georgia", 0, 30));
        labelCPU.setForeground(new Color(150, 50, 50));
        labelCPU.setVisible(false);
        add(labelCPU);

        labelCPUimg = new JLabel();
        labelCPUimg.setBounds(365, 170, 160, 160);
        labelCPUimg.setVisible(false);
        add(labelCPUimg);

        labelEstado = new JLabel();
        labelEstado.setBounds(320, 360, 480, 45);
        labelEstado.setFont(new Font("Georgia", 0, 40));
        labelEstado.setForeground(new Color(150, 50, 50));
        labelEstado.setVisible(false);
        add(labelEstado);

        labelCredit = new JLabel("By Adro ©Cup of Java");
        labelCredit.setBounds(380, 60, 200, 20);
        add(labelCredit);

        adc.loop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (botonStart == e.getSource()) {
            //Cuando el boton Start sea presionado el programa eligirá piedra papel o tijera pero esto no se mostrará tocavíá:
            labelCPU.setText("Yo elijo... " + CPUSelect());

            //Se elige la imagen según lo que se reciba del metodo CPUSelect()
            switch (CPUSelect()) {
                case "Piedra":
                    labelCPUimg.setIcon(imagenPiedra);
                    break;
                case "Papel":
                    labelCPUimg.setIcon(imagenPapel);
                    break;
                case "Tijera":
                    labelCPUimg.setIcon(imagenTijera);
                    break;
                default:
                    break;
            }

            //Cuando el boton Start es presionado aparece toda la interfaz y desaparece el mismo boton
            botonInicio.setVisible(true);

            botonStart.setVisible(false);
            botonStart.setEnabled(false);

            botonCon.setVisible(false);
            botonCon.setEnabled(false);

            labelInd.setVisible(true);
            labelPiedra.setVisible(true);
            labelPapel.setVisible(true);
            labelTijera.setVisible(true);

            botonPiedra.setVisible(true);
            botonPiedra.setEnabled(true);
            botonPapel.setVisible(true);
            botonPapel.setEnabled(true);
            botonTijera.setVisible(true);
            botonTijera.setEnabled(true);
            botonRestart.setEnabled(true);
            botonRestart.setVisible(true);
        }
        //Cuando el boton restart es presionado todos los botonqes y etiquetas se esconden o se muestran según el inicio
        if (botonRestart == e.getSource()) {

            botonInicio.setVisible(false);

            botonStart.setVisible(false);
            botonStart.setEnabled(false);

            labelInd.setVisible(true);
            labelPiedra.setVisible(true);
            labelPapel.setVisible(true);
            labelTijera.setVisible(true);
            botonPiedra.setVisible(true);
            botonPiedra.setEnabled(true);
            botonPapel.setVisible(true);
            botonPapel.setEnabled(true);
            botonTijera.setVisible(true);
            botonTijera.setEnabled(true);

            botonRestart.setEnabled(true);
            botonRestart.setVisible(true);

            labelCPU.setVisible(false);
            labelCPUimg.setVisible(false);
            labelEstado.setVisible(false);

            //Para que cada ve que se de a reiniciar aleatorio de un numero distinto:
            aleatorio = (int) (Math.random() * 3 + 1);
        }
        //Función de los botones Piedra papel y tijera
        if (botonPiedra == e.getSource()) {
            labelInd.setVisible(false);//Desaparecer la etiqueta de indicación

            //Quitar los otros botones y etiquetas
            botonPapel.setVisible(false);
            botonPapel.setEnabled(false);
            botonTijera.setVisible(false);
            botonTijera.setEnabled(false);

            labelPapel.setVisible(false);
            labelTijera.setVisible(false);

            //Desición de quien gana
            switch (CPUSelect()) {
                case "Piedra":
                    labelCPU.setText("Yo elijo... Piedra");
                    labelCPUimg.setIcon(imagenPiedra);
                    labelEstado.setText("Empate");

                    break;
                case "Papel":
                    labelCPU.setText("Yo elijo... Papel");
                    labelCPUimg.setIcon(imagenPapel);
                    labelEstado.setText("Sí, GANÉ! :)");
                    break;
                case "Tijera":
                    labelCPU.setText("Yo elijo... Tijera");
                    labelCPUimg.setIcon(imagenTijera);
                    labelEstado.setText("Me ganste :(");
                    break;
                default:
                    break;
            }
            //Se muestran los resultado de la desición de la computadora
            labelCPU.setVisible(true);
            labelCPUimg.setVisible(true);
            labelEstado.setVisible(true);
        }

        if (botonPapel == e.getSource()) {
            labelInd.setVisible(false);

            botonPiedra.setVisible(false);
            botonPiedra.setEnabled(false);
            botonTijera.setVisible(false);
            botonTijera.setEnabled(false);
            labelPiedra.setVisible(false);
            labelTijera.setVisible(false);

            switch (CPUSelect()) {
                case "Piedra":
                    labelCPU.setText("Yo elijo... Piedra");
                    labelCPUimg.setIcon(imagenPiedra);
                    labelEstado.setText("Tú ganaste :|");

                    break;
                case "Papel":
                    labelCPU.setText("Yo elijo... Papel");
                    labelCPUimg.setIcon(imagenPapel);
                    labelEstado.setText("Es un empate :v");
                    break;
                case "Tijera":
                    labelCPU.setText("Yo elijo... Tijera");
                    labelCPUimg.setIcon(imagenTijera);
                    labelEstado.setText("Yo gané");
                    break;
                default:
                    break;
            }

            labelCPU.setVisible(true);
            labelCPUimg.setVisible(true);
            labelEstado.setVisible(true);

        }
        if (botonTijera == e.getSource()) {
            labelInd.setVisible(false);

            botonPapel.setVisible(false);
            botonPapel.setEnabled(false);
            botonPiedra.setVisible(false);
            botonPiedra.setEnabled(false);

            labelPiedra.setVisible(false);
            labelPapel.setVisible(false);

            switch (CPUSelect()) {
                case "Piedra":
                    labelCPU.setText("Yo elijo... Piedra");
                    labelCPUimg.setIcon(imagenPiedra);
                    labelEstado.setText("Yo he ganado esta véz :)");

                    break;
                case "Papel":
                    labelCPU.setText("Yo elijo... Papel");
                    labelCPUimg.setIcon(imagenPapel);
                    labelEstado.setText("Diablos..., tú ganas");
                    break;
                case "Tijera":
                    labelCPU.setText("Yo elijo... Tijera");
                    labelCPUimg.setIcon(imagenTijera);
                    labelEstado.setText("Un empate");
                    break;
                default:
                    break;
            }
            labelCPU.setVisible(true);
            labelCPUimg.setVisible(true);
            labelEstado.setVisible(true);

        }
        if (botonExit == e.getSource()) {
            System.exit(0);
        }
        if (botonCon == e.getSource()) {
            JOptionPane.showInputDialog(null, "                     Ajustes"
                    + "\n 1. Volumen    "
                    + "\n'TRABAJANDO EN LAS ACTUALIZACIONES \n PROGRAMA INCOMPLETO' ");
        }

    }

    public static void main(String args[]) {
        Window wiw = new Window();
        wiw.setBounds(0, 0, 900, 700);
        wiw.setVisible(true);
        wiw.setLocationRelativeTo(null);
        wiw.setResizable(false);

    }

    public String CPUSelect() {
        //Según lo que reciba de "aleatorio" regresará una de las tres opciones
        //Para eso este método
        switch (aleatorio) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                break;
        }
        return null;
    }
}
