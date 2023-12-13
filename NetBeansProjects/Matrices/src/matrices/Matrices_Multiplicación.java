package matrices;

/**
 *
 * @author Adro
 */
public class Matrices_Multiplicación {

    public static void main(String args[]) {

        int matrizUno[][] = new int[2][3];
        int matrizDos[][] = new int[3][2];
        int matrizR[][] = new int[2][2];

        //Llenado de la matriz Uno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                matrizUno[i][j] = (int) (Math.random() * 3);
            }

        }
        //Llenado de la matriz Dos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                matrizDos[i][j] = (int) (Math.random() * 3);
            }

        }

        //Multiplicación de matrices
        for (int i = 0; i < 4; i++) {

            //Poscición en la matriz Resultante [0][0]
            if (matrizR[0][0] == 0) {
                int tempo = (matrizUno[0][0] * matrizDos[0][0])
                          + (matrizUno[0][1] * matrizDos[1][0])
                          + (matrizUno[0][2] * matrizDos[2][0]);
                matrizR[0][0] = tempo;
            }

            //Poscición en la matriz Resultante [1][0]
            if (matrizR[1][0] == 0) {
                int tempo = (matrizUno[1][0] * matrizDos[0][0])
                          + (matrizUno[1][1] * matrizDos[1][0])
                          + (matrizUno[1][2] * matrizDos[2][0]);
                matrizR[1][0] = tempo;
            }

            //Poscición en la matriz Resultante [0][1]
            if (matrizR[0][1] == 0) {
                int tempo = (matrizUno[0][0] * matrizDos[0][1])
                          + (matrizUno[0][1] * matrizDos[1][1])
                          + (matrizUno[0][2] * matrizDos[2][1]);
                matrizR[0][1] = tempo;
            }

            //Poscición en la matriz Resultante [1][1]
            if (matrizR[1][1] == 0) {
                int tempo = (matrizUno[1][0] * matrizDos[0][1])
                          + (matrizUno[1][1] * matrizDos[1][1])
                          + (matrizUno[1][2] * matrizDos[2][1]);
                matrizR[1][1] = tempo;
            }
        }

        //Estructura en pantalla
        for (int i = 0; i < 3; i++) {

            if (i < 2) {
                //Matriz Uno
                for (int j = 0; j < 3; j++) {

                    System.out.print("[" + matrizUno[i][j] + "] ");
                }

                if (i == 1) {
                    System.out.print("  x  ");
                } else {
                    System.out.print("     ");
                }
            } else {
                System.out.print("                 ");
            }
            //Matriz Dos
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + matrizDos[i][j] + "] ");

            }
            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }

            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + matrizR[j][i] + "] ");

                }
            }
            System.out.println("");
        }
    }
}
