package newpackage1;

public class Hilos {

    public static void main(String args[]) {

        Proceso1 interact = new Proceso1();

        Thread interacta = new Thread(new Proceso2());

        interact.start();
        interacta.start();

    }

}
