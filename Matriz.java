import java.util.Scanner;
 public class Matriz{ 
  public static void main(String args[]){
  int filas = 0, columnas = 0, contador = 1;
  Scanner in = new Scanner(System.in);

  System.out.println("Cuantas filas deseas agregar");
  filas = in.nextInt();
  System.out.println("Cuantas columnas deseas agregar");
  columnas = in.nextInt();
  
  int num[][] = new int[filas][columnas];

  for(int j = 0; j < filas; j++){
   for(int i = 0; i < columnas; i++){
    num[j][i] = contador;
    contador++;
    System.out.print("[" + num[j][i] + "]");
   }
   System.out.println("");
  }
 }
}