package hilos;

/**
 *
 * @author Adro
 */
public class Hilo2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("D");
            try {
                Hilo2.sleep(1000);
            } catch (InterruptedException er) {
                System.out.println("Error" + er);
            } 
        }
    }

}
