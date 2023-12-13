package cajerolases;

public class ClaseDerivadaConsulta extends ClaseBaseAbstract {
    
    @Override
    public void Transaccion(){
        System.out.println("---------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------------");    
    }
    
}
