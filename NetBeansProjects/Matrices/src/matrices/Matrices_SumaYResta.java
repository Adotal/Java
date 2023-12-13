package matrices;

/**
 *
 * @author Adro
 */
public class Matrices_SumaYResta {

    public static void main(String[] args) {

        int MatrizUno[][] = new int[3][3];
        int MatrizDos[][] = new int[3][3];
        int MatrizResultado[][] = new int[3][3];

        //Primer Matriz
        for (int i = 0; i < MatrizUno.length; i++) {
            for (int j = 0; j < MatrizUno.length; j++) {

                MatrizUno[i][j] = (int) (Math.random() * 5);

            }

        }

        //Segunda Matriz
        for (int i = 0; i < MatrizDos.length; i++) {
            for (int j = 0; j < MatrizDos.length; j++) {

                MatrizDos[i][j] = (int) (Math.random() * 5);

            }

        }

        //Suma o resta
        for (int i = 0; i < MatrizUno.length; i++) {
            for (int j = 0; j < MatrizDos.length; j++) {
                MatrizResultado[i][j] = MatrizUno[i][j] + MatrizDos[i][j];

            }
        }

        //Estructura en pantalla
        for (int i = 0; i < MatrizUno.length; i++) {

            //Matriz Uno
            for (int j = 0; j < MatrizUno.length; j++) {
                System.out.print("[" + MatrizUno[i][j] + "] ");
            }

            //Espacio ente matrices
            if (i == 1) {
                System.out.print("  +  ");
            } else {
                System.out.print("     ");
            }

            //Matriz Dos
            for (int j = 0; j < MatrizDos.length; j++) {
                System.out.print("[" + MatrizDos[i][j] + "] ");
            }

            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }


            //Matriz tres
            for (int j = 0; j < MatrizResultado.length; j++) {
                System.out.print("[" + MatrizResultado[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
