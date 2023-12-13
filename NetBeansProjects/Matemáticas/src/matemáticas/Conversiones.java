package matemáticas;

/**
 *
 * @author Adro
 */
public class Conversiones {

    public static void main(String args[]) {
        double anguloGrados = 45;
        double anguloRadiales = Math.toRadians(anguloGrados);
        
        System.out.println("Deg a Rad: " +anguloGrados + "° " + " = "+ anguloRadiales+" rad");
        
        anguloGrados = Math.toDegrees(anguloRadiales);
        
        System.out.println("Rad a Deg: " + anguloRadiales+" rad" +" = " + anguloGrados +"°");

    }

}
