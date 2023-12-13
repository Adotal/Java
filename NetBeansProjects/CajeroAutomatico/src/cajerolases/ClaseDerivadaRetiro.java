package cajerolases;

public class ClaseDerivadaRetiro extends ClaseBaseAbstract {

    @Override
    public void Transaccion() {
        Extraer();

        if (Retiro <= getSaldo()) {
            //Mi Codigo 
            //Transaccion = getSaldo()-Retiro;
            Transaccion = getSaldo();
            setSaldo(Transaccion - Retiro);

            System.out.println("------------------------------------");
            System.out.println("Cantidad retirada: $" + Retiro);
            System.out.println("Cantidad restante: $" + getSaldo());
            System.out.println("------------------------------------");
        } else {
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------");
        }
    }

}
