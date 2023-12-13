package newpackage;

/**
 *
 * @author Adro
 */
public class Proceso extends Thread {
    @Override
    public void run(){
        for(int i=0; i<=4; i++){
            System.out.println(i+ " "+ getName());
            
            //Retrasar proceso
            try{
            Proceso.sleep(1000);
            }catch(InterruptedException er){
                System.out.println("Error"+er);
            }
        }
    
    }
}
