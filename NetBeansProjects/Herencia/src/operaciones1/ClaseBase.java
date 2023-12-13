
package operaciones1;
import java.util.Scanner;

public class ClaseBase {
        protected int valor1, valor2, resultado;
    Scanner en = new Scanner(System.in);
    
    public void PedirDatos(){ //Pedir valores al usuario

        System.out.print("Dame el primer valor");
        valor1 = en.nextInt();
        
        System.out.print("Dame el segundo valor ");
        valor2 = en.nextInt();
    }

    public void MostrarResultado(){ //Mostrar el resultado

        System.out.println(resultado);
           
    }
    
}
