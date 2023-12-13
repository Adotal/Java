package cajerolases;

public class CajeroPrincipal {
    public static void main(String[] args) {
        
        ClaseBaseAbstract interact = new ClaseDerivadaConsulta();
        interact.setSaldo(500);
        interact.Operaciones();
    }
    
}
