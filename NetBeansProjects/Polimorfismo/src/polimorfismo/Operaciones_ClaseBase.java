package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClaseBase {

    protected int valor1, valor2, resultado;
    Scanner en = new Scanner(System.in);

    public void Datos() { //Método que pide datos
        System.out.print("Dame el primer valor: ");
        valor1 = en.nextInt();

        System.out.print("Dame el segundo valor: ");
        valor2 = en.nextInt();
    }

    public abstract void Operaciones(); //Método referente al polimorfismo

    public void Mostrar() { //Meodo que muestra resultado
        System.out.println("El resultado es: " + resultado);

    }

}
