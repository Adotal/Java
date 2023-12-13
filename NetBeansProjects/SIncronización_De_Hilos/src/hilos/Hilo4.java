package hilos;

/**
 *
 * @author Adro
 */
public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("O");
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException er) {
                System.out.println("Error" + er);
            }
        }
    }
}
