package area;

import java.util.Scanner;

public class RectanguloMain {

    public static void main(String args[]) {

        Scanner en = new Scanner(System.in);

        System.out.print("Escribe el ancho de tu rectangulo:   ");
        int base = en.nextInt();

        System.out.print("Escribe el alto de tu rectangulo:    ");
        int alto = en.nextInt();

        Rectangulo interact = new Rectangulo(base, alto);

        interact.Imprimir();

    }
}
