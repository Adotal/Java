package hilos;

/**
 *
 * @author Adro
 */
public class HiloPrincipal {

    public static void main(String args[]) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();

        // Hilo 1
        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException er) {
            System.out.println("Error" + er);
        }
        //Hilo 2
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException er) {
            System.out.println("Error" + er);
        }
        //Hilo 3
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException er) {
            System.out.println("Error" + er);
        }
        //Hilo4
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException er) {
            System.out.println("Error" + er);
        }

        //Sincronización de Hilos
    }

}
