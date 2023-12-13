package suma;

public class Suma {
    private int v1, v2, vR;
    
    public Suma(int valorUno, int valorDos){
        
        this.v1 = valorUno;
        this.v2 = valorDos;
   
    }
    
    public void Operacion(){
    vR = v1 + v2;
    
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado es: " + vR);
        
    }
    
}
