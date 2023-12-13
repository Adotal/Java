package exampleone;

import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import java.util.Scanner;

public class ExampleOne {

    public static void main(String[] args) {

        String palabra1 = "";
        int caracteres = 0;
        String palabra2 = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Porfavor, escribe algo que quieras invertir:");
        palabra1 = in.nextLine();

        caracteres = palabra1.length();

        while (caracteres != 0) {

            palabra2 +=  palabra1.substring(caracteres -1,caracteres ); 
            caracteres--;
        }

        System.out.println("Resultado: " + palabra2);
        
        System.out.println("");
        String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        System.out.println(Arrays.toString(fontNames));   

    }

}
