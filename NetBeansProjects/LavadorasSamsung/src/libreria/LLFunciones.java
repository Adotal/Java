/*
 *Clase para la funcion lógica de
 *lavadoras Samsung
 */
package libreria;

/*
 *@author Adro
 */
public class LLFunciones {

    private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0,
            lavadoCompleto = 0, secadoCompleto = 0;

    public LLFunciones(int kg, int tipo) {
        this.kilos = kg;
        this.tipoRopa = tipo;

    }

    private void Llenado() {

        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado Completado");
        } else {
            System.out.println("La carga de ropa es muy pesada, porfavor reduce la carga");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (tipoRopa == 1) {
                System.out.println("Ropa Blanca / Lavado suave");
                System.out.println("Iniciando el lavado...");
                lavadoCompleto = 1;

            } else if (tipoRopa == 2) {
                System.out.println("Ropa Negra / Lavado normal");
                System.out.println("Iniciando el lavado...");
                lavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado normal");
                System.out.println("Iniciando el lavado...");
                lavadoCompleto = 1;
            }
        } else {
            System.out.println("La carga de ropa es muy pesada, porfavor reduce la carga");         
        }
    }

    private void Secado() {
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Iniciando el secado...");
            secadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (secadoCompleto == 1) {
            System.out.println("Tu ropa esta lista");

        }

    }
    
    //Setter y Getter
     
    public int getTipoRopa(){
        return tipoRopa;
    }    
    
    public void setTipoRopa(int tipoRopa){
        this.tipoRopa = tipoRopa;
    }


}
