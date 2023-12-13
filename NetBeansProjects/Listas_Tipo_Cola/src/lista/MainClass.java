package lista;

import javax.swing.JOptionPane;

/**
 * @author Adro
 */
public class MainClass {

    public static void main(String[] args) {
        int opcion = 0, nodo_info = 0;
        Cola_FIFO cola = new Cola_FIFO();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        " Listas tipo Cola\n"
                        + "Escribe el número de la opcion que deseas realizar:\n\n"
                        + " 1.  Insertar un nodo\n"
                        + " 2.  Extraer un nodo\n"
                        + " 3.  Mostrar contenido de la lista\n"
                        + " 4.  Salir\n"
                        + " 5.  Sobre el Creador\n "));

                switch (opcion) {
                    case 1:
                        nodo_info = Integer.parseInt(JOptionPane.showInputDialog(null,
                                " Ingresa el valor que quieras añadir"));
                        cola.Insetar(nodo_info);
                        break;
                    case 2:
                        if (cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, " La pila esta vacía");
                        } else {
                            JOptionPane.showMessageDialog(null, " Se extrae el nodo con el valor: " + cola.Extraer());
                        }
                        break;
                    case 3:
                        if (cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacía \n :| ");
                        } else {
                            cola.MostrarContenido();
                        }
                        break;

                    case 4:
                        opcion = 10;
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null," Creado por: \n Ornelas Ornelas Adro Yael");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no disponible");
                        break;

                }

            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } while (opcion != 10);
    }

}
