package newpackage1;

/**
 *
 * @author Adro
 */
public class HiloPrincipal {
    
    public static void main(String args[]){
        
        
        Proceso hilo1 = new Proceso(" Hilo-1");
        Proceso hilo2 = new Proceso(" Hilo-2");
        Proceso hilo3 = new Proceso(" Hilo-3");
        
        hilo1.Valor_Condicion(5);
        hilo2.Valor_Condicion(10);
        hilo3.Valor_Condicion(5);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
