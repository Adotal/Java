package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Adro
 */
public class Example{
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        //Elemento para la tera o programa
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                System.out.println("La tarea timer se ejecuto en " + new Date() );  
            }
            
        };
        //Que tarea, retraso
        timer.schedule(tarea, 100);
    }
   
}
