package Limitar_Decimales;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Adro
 */
public class ClasePrincipal {

    public static void main(String args[]) {
        double numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("La raís cuadrada de " + numero + " es " + raiz);

        /*Para limitar los decimal que se muestran
        *existen 4 metodos disintos:
         */
        //1.Método con la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raís cuadrada de " + numero + " es " + df.format(raiz));

        //2.Utilizando StringFormat
        System.out.println("La raís cuadrada de " + numero + " es " + String.format("%.3f", raiz));

        //3.MathRound
        System.out.println("La raís cuadrada de " + numero + " es " + (double) Math.round(raiz * 10000) / 10000);

        //Usar la clase BigDecimal
        BigDecimal bg = new BigDecimal(raiz);
        bg = bg.setScale(5, RoundingMode.HALF_UP);
        System.out.println("La raís cuadrada de " + numero + " es " + bg.doubleValue());
    }

}
