/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Adro
 */
public class Prueba1 {

    public static void main(String[] args) {
        int aleatorio;
        aleatorio = (int) (Math.random() * 3 + 1);

        int player;

        Scanner in = new Scanner(System.in);

        switch (aleatorio) {
            case 1:
                System.out.println("Elijo... Piedra");
                break;
            case 2:
                System.out.println("Elijo... Papel");
                break;
            case 3:
                System.out.println("Elijo... Tijera");
                break;
            default:
                break;
        }

        System.out.println("Y tú que elijes?");
        System.out.println("1.Piedra");
        System.out.println("2.Papel");
        System.out.println("3.Tijera");
        player = in.nextInt();

        switch (player) {
            case 1://Piedra
                if (aleatorio == 1) {
                    System.out.println("Empate");
                } else if (aleatorio == 2) {
                    System.out.println("YOU LOSE");
                } else if (aleatorio == 3) {
                    System.out.println("Ganaste");
                }

                break;
            case 2://Papel
                if (aleatorio == 1) {
                    System.out.println("Ganaste");
                } else if (aleatorio == 2) {
                    System.out.println("Empate");
                } else if (aleatorio == 3) {
                    System.out.println("YOU LOSE");
                }
                break;
            case 3://Tijera
                if (aleatorio == 1) {
                    System.out.println("YOU LOSE");
                } else if (aleatorio == 2) {
                    System.out.println("Ganaste");
                } else if (aleatorio == 3) {
                    System.out.println("Empate");
                }
                break;
            default:
                break;

        }
    }

}
