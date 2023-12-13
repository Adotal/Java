package listastipopila;

import javax.swing.JOptionPane;

/**
 *
 * @author Adro
 */
public class ListasTipoPila {

    public static void main(String[] args) {
        int opcion = 0, nodo = 0;

        Pila pila = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones Listas tipo pila\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La pila está vacía?\n"
                        + "4. ¿Cuál es el último valor ingresado en la pila?\n"
                        + "5. ¿Cuántos nodos tiene la pila?\n"
                        + "6. Vaciar Pila\n"
                        + "7. Mostrar contenido de la Pila\n"
                        + "8. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "\n Ingresa el valor que quieras añadir al nodo: "));
                        pila.InsertarNodo(nodo);

                        break;

                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo: \n " + pila.EliminarNodo() + ".");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;

                    case 3:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia."
                                    + "\n El último valor ingresado es: \n " + pila.MostrarUltimoValor() + ".");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;

                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es:\n " + pila.MostrarUltimoValor() + ".");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }

                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene:\n  " + pila.TamanoPila() + " nodos.");
                        break;

                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Pila vaciada.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;

                    case 7:
                        pila.MostrarPila();
                        break;

                    case 8:
                        opcion = 8;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "\n »Opcion no disponible.");
                        break;

                }

            } catch (NumberFormatException e) {
            }

        } while (opcion != 8);
    }

}
