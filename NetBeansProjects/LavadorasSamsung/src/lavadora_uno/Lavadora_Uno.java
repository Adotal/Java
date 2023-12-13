package lavadora_uno;

import libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {

    public static void main(String args[]) {
        Scanner en = new Scanner(System.in);

        System.out.println("¿La ropa es de color blanco o negro?  ");
        System.out.println("Presiona 1 ropa blanca");
        System.out.println("Presiona 2 ropa negra ");
        int tipoRopa = en.nextInt();

        System.out.println("¿Cuántos Kg de ropa?");
        int kilos = en.nextInt();

        LLFunciones interact = new LLFunciones(kilos, tipoRopa);
        
        interact.setTipoRopa(2);
        System.out.println("El tipo de ropa es: " + interact.getTipoRopa());
        //Conexión con el programa principal: 
        interact.CicloFinalizado();
        
    }

}

