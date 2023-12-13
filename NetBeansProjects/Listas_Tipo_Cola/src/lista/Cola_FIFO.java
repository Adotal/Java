package lista;

import javax.swing.JOptionPane;

/**
 * @author Adro
 */
public class Cola_FIFO {

    private Nodo In, Out;
    String Cola = "";

    //Estabkecer los valores de inicio
    public Cola_FIFO() {
        In = null;
        Out = null;
    }

    //Método para saber si la cola esta vacia
    public boolean ColaVacia() {
        if (In == null) {
            return true;
        } else {
            return false;
        }
    }

    //Método para insertar valor a la cola
    public void Insetar(int info) {
        Nodo new_Nodo = new Nodo();
        new_Nodo.info = info;
        new_Nodo.siguiente = null;

        if (ColaVacia()) {
            In = new_Nodo;
            Out = new_Nodo;
        } else {
            Out.siguiente = new_Nodo;
            Out = new_Nodo;
        }
    }

    //Método para extraer de la cola
    public int Extraer() {
        if (!ColaVacia()) {
            int info = In.info;

            if (In == Out) {
                In = null;
                Out = null;
            } else {
                In = In.siguiente;
            }
            return info;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = In;
        String ColaInvertida="";
        
        while(recorrido!=null){
            Cola += recorrido.info +" ";
            recorrido = recorrido.siguiente;
            
        }
        String cadena[] = Cola.split(" ");
    
        for (int i = cadena.length -1; i >= 0; i--) {
            ColaInvertida += " "+cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola=null;
    }
}
