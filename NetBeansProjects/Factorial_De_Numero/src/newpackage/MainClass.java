package newpackage;
import java.util.Scanner;

/**
 *
 * @author Adro
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("¿Qué valor quieres elegir paara calcular su factorial?    ");
        int numero = in.nextInt();
        
        Recursividad mess = new Recursividad();
        int factorial = mess.Factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
        
    }
}
