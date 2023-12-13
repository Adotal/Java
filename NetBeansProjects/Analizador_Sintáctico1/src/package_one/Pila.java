package package_one;

/**
 *
 * @author Adro
 */
public class Pila {

    private Nodo UltimoValor;

    public Pila() {
        UltimoValor = null;

    }

    //Metodo para insertar en la pila
    public void Insertar(char valor) {

        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.info = valor;

        if (UltimoValor == null) {

            nuevo_nodo.siguiente = null;
            UltimoValor = nuevo_nodo;

        } else {
            nuevo_nodo.siguiente = UltimoValor;
            UltimoValor = nuevo_nodo;
        }
    }

    //Método para Extraer el valor de la pila
    public char Extraer() {
        if (UltimoValor != null) {
            char info = UltimoValor.info;
            UltimoValor = UltimoValor.siguiente;
            return info;

        } else {
            return Character.MAX_VALUE;
        }
    }

    //Método para saber si la pila esta vacia
    public boolean PilaVacia() {
        return UltimoValor == null;
    }

}


