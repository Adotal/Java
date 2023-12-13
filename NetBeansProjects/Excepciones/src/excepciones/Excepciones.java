package excepciones;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        
         try{
             // Code
             
                     
         int valor1, valor2, resultado;
         Scanner en = new Scanner(System.in);
         
         System.out.print("Dame el primer valor: ");
         valor1 = en.nextInt();
         System.out.print("Dame el segundo valor: ");
         valor2 = en.nextInt();
         
         resultado = valor1 / valor2; 
        
         System.out.println(valor1 +" / "+ valor2 + " = " + resultado);
         
             
         }catch(Exception er){
             // Comportamiento
             System.out.println("¡Error!  "+ er);
         }finally{
             System.out.println("LOL");
         }
         

         
    }
    
}
