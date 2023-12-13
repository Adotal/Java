package hilos;

/**
 *
 * @author Adro
 */
public class Hilo3 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("R");
            try {
                Hilo3.sleep(1000);
            } catch (InterruptedException er) {
                System.out.println("Error" + er);
            }
        }
    }

}
