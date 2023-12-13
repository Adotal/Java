package newpackage;

import java.util.Scanner;

/**
 *
 * @author Adro
 */
public class Prueba {

    public static void main(String[] args) {
        int aleatorio;
        aleatorio = (int) (Math.random() * 3 + 1);

        int player = 0;

        Scanner in = new Scanner(System.in);
    
            System.out.println("Escribe que eliges:");
            System.out.println("1.Piedra");
            System.out.println("2.Papel");
            System.out.println("3.Tijera");
            player = in.nextInt();

            //Piedra
            if (aleatorio == 1) {
                System.out.println("Yo elijo... Piedra");
                if (player == 1) {
                    System.out.println("Elejiste piedra, Empate");
                } else if (player == 2) {
                    System.out.println("Elejiste papel, Ganaste!!!");
                } else if (player == 3) {
                    System.out.println("Elejiste tijera, YOU LOSE");
                }

                //Papel
            } else if (aleatorio == 2) {
                System.out.println("Yo elijo... Papel");
                if (player == 1) {
                    System.out.println("Elejiste piedra, YOU LOSE :(");
                } else if (player == 2) {
                    System.out.println("Elejiste papel, Empate");
                } else if (player == 3) {
                    System.out.println("Elejiste tijera, Ganaste!!!");
                }

                //Tijera
            } else if (aleatorio == 3) {
                System.out.println("Yo elijo... Tijera");
                if (player == 1) {
                    System.out.println("Elejiste piedra, Ganaste!!!");
                } else if (player == 2) {
                    System.out.println("Elejiste papel, YOU LOSE :(");
                } else if (player == 3) {
                    System.out.println("Elejiste tijera, Empate");
                }

            }
      
    
   
    
    }
}
