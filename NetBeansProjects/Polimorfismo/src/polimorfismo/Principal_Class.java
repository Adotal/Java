package polimorfismo;

public class Principal_Class {
    public static void main(String args[]){
        
        Operaciones_ClaseBase interact = new Suma_Derivada();
        interact.Datos();
        interact.Operaciones();
        interact.Mostrar();
    
        Operaciones_ClaseBase interactR = new Resta_Derivada();
        interactR.Datos();
        interactR.Operaciones();
        interactR.Mostrar();
        
    
    }
    
}
