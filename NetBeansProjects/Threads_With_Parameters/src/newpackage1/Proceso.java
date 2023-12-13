package newpackage1;

/**
 *
 * @author Adro
 */
public class Proceso extends Thread{
    
    public Proceso(String Name){
        super(Name);
    }
    
    int parametro_uno;
    
    @Override
    public void run(){
        for (int i = 0; i <= parametro_uno; i++) {
            System.out.println(i + this.getName());
        }
        System.out.println("");
    
    }
    
    public void Valor_Condicion(int num_uno){
        this.parametro_uno = num_uno;
    

    }
    
}
