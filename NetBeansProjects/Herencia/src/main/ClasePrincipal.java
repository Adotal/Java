package main;
import java.awt.Frame;
import operaciones1.ClaseDerivada_Resta;
import operaciones1.ClaseDerivada_Suma;

public class ClasePrincipal {
    public static void main(String args[]){
        
        ClaseDerivada_Suma interact1 = new ClaseDerivada_Suma();         
        ClaseDerivada_Resta interact2 = new ClaseDerivada_Resta();
  
        
        interact1.PedirDatos();
        interact1.Suma();
        System.out.print("El resultado es: " );
        interact1.MostrarResultado();

        
        interact2.PedirDatos();
        interact2.Restar();
        System.out.print("El resultado es: ");
        interact2.MostrarResultado();    
        
    }    
}
