package cajerolases;

import java.util.Scanner;

public abstract class ClaseBaseAbstract {

    protected int Transaccion, Ingresar, Retiro;
    private static int Dentro;
    Scanner en = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;

        do {
            do {

                System.out.println("Porfavor, selecciona una opción:");
                System.out.println("");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retirar efectivo");
                System.out.println("    3. Depósito de efectivo");
                System.out.println("    4. Salir");
                seleccion = en.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                   
                    bandera =1;

                } else {
                    System.out.println("---------------------------");
                    System.out.println("La opción elegida no existe");
                    System.out.println("---------------------------");

                }

            } while (bandera == 0);

            if (seleccion == 1) {
                ClaseBaseAbstract interact = new ClaseDerivadaConsulta();
                interact.Transaccion();

            } else if (seleccion == 2) {
                ClaseBaseAbstract interact = new ClaseDerivadaRetiro();
                interact.Transaccion();

            } else if (seleccion == 3) {
                ClaseBaseAbstract interact = new ClaseDerivadaDeposito();
                interact.Transaccion();

            } else if (seleccion == 4) {
                System.out.println("----------------------");
                System.out.println("Gracias, vuelva pronto");
                System.out.println("----------------------");
                bandera = 2;

            }

        } while (bandera != 2);

    }

    public void Extraer() { // Pedir cantidad a retirar
        System.out.print("Escribe la cantidad que deseas retirar: ");
        Retiro = en.nextInt();

    }

    public void Deposito() { // Pedir cantidad a depositar
        System.out.println("Escribe la cantidad que deseas depositar");
        Ingresar = en.nextInt();

    }

    // Metodo abstracto
    public abstract void Transaccion();

    // Setter y Getter
    public int getSaldo() {
        return Dentro;

    }

    public void setSaldo(int Dentro) {
        this.Dentro = Dentro;

    }

}
