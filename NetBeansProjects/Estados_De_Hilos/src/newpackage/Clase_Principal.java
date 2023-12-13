package newpackage;

/**
 *
 * @author Adro
 */
public class Clase_Principal {
    
    public static void main(String args[]){
        
        //Primer estado (New)
        Proceso hilo1 = new Proceso();        
        Proceso hilo2 = new Proceso();
        
        //Segundo estado (Runnable)
        hilo1.start();
        
        //Tercer estado (Bloqued)
        try{
        hilo1.sleep(1000);
        }catch(InterruptedException er){
            System.out.println("Error en el programa"+er);
        }finally{
            System.out.println("Programa concluido");
        }        
                
            
        hilo2.start();
        hilo2.stop();
        
        try{
        hilo2.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error" +e);
        
        }finally{
            System.out.println("Programa concluido");
        }
       
    }
    
    
}
