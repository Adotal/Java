package listastipopila;

import javax.swing.JOptionPane;

/**
 *
 * @author Adro
 */
public class Pila {

    private Nodo UltimoValor;
    int size = 0;
    String lista = "";

    public Pila() {
        UltimoValor = null;
        size = 0;
    }

    //Método para saber si la pila esta vacia 
    public boolean PilaVacia() {
        return UltimoValor == null;
    }

    //Método para insertar un nodo en la pila
    public void InsertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValor;
        UltimoValor = nuevo_nodo;
        size++;
    }

    //Método para Eliminar un Nodo
    public int EliminarNodo() {
        int auxiliar = UltimoValor.info;
        UltimoValor = UltimoValor.siguiente;
        size--;
        return auxiliar;
    }

    //Metodo para saber cual es el último Valor ingresado
    public int MostrarUltimoValor() {
        return UltimoValor.info;
    }

    //Método para saber el tamaño de la pila
    public int TamanoPila() {
        return size;
    }

    //Metodo para vaciar la pila
    public void VaciarPila() {
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }

    //Método para mostrar el contenido de la pila
    public void MostrarPila() {
        Nodo recorrido = UltimoValor;
        while (recorrido != null) {
            lista += recorrido.info + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }

}
