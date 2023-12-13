package matemáticas;

/**
 *
 * @author Adro
 */
public class Trigonometria {

    public static void main(String[] args) {

        double resultado = 0;

        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);

        //Seno
        resultado=Math.sin(anguloRadianes);
        System.out.println("Seno de "+ anguloGrados+"°" +" = " + resultado);
        
        
        //Coseno
        resultado=Math.cos(anguloRadianes);
        System.out.println("Coseno de "+ anguloGrados+"°" +" = " + resultado);
        
        //Tangente
        resultado=Math.tan(anguloRadianes);
        System.out.println("Tangente de "+ anguloGrados+"°" +" = " + resultado);
        
        double valorIngresado=0.707;
        
        //Arco coseno
        anguloRadianes = Math.acos(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco coseno de: "+valorIngresado +" = "+ anguloGrados +"°");
        
        //Arco seno
        anguloRadianes = Math.asin(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco seno de: "+valorIngresado +" = "+ anguloGrados +"°");
        
         //Arco Tangente
        anguloRadianes = Math.atan(valorIngresado);
        anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Arco tangente de: "+valorIngresado +" = "+ anguloGrados +"°");
        

    }

}
