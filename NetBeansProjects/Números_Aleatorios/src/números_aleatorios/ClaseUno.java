package números_aleatorios;
import java.util.Random;

/**
 *
 * @author Adro
 */
public class ClaseUno {
    public static void main(String[] args) {
        int aleatorio;
        
        Random r = new Random();
        aleatorio = (int)(r.nextFloat()*10);
        System.out.println(""+aleatorio);
    }
}
