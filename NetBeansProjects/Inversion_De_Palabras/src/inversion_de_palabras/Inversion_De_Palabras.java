package inversion_de_palabras;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeRegExp;

public class Inversion_De_Palabras {
    public static void main(String[] args) {
        
        String palabra = "", inversa = "";
        int numcaracteres = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Porfavor escribe una palabra que quieras invertir");
        palabra = in.nextLine();
        
        numcaracteres = palabra.length();
        
        for (int i = numcaracteres; i != 0; i--) {
            inversa += palabra.substring(i-1, i);
            
           }
        System.out.println("Resultado: " + inversa);
    }
}
