package hilos;

/**
 *
 * @author Adro
 */
public class Hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i+": A");
            try {
                Hilo1.sleep(1000);
            } catch (InterruptedException er) {
                System.out.println("Error" + er);
            }
        }

        
        
    }
}
