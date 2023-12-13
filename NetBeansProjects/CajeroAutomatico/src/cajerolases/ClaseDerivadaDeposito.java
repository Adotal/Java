package cajerolases;

public class ClaseDerivadaDeposito extends ClaseBaseAbstract {
    
    @Override
    public void Transaccion(){
        Deposito();
        
        Transaccion = getSaldo();
        setSaldo(Transaccion + Ingresar);
        
        System.out.println("----------------------------------------");
        System.out.println("Cantidad ingresada: " + Ingresar);
        System.out.println("cantidad actual: "  + getSaldo());
        System.out.println("----------------------------------------");
    }
    
}
