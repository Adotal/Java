import java.util.Scanner;
public class Sistema_Vacacional{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String name;
   int key, old;
   char flag =1;

   while(flag == 1){

   System.out.println("");
   System.out.println("----------------------------------------------------");
   System.out.println("|  BIENVENIDO AL SISTEMA VACACIONAL DE COCA-COLA   |");
   System.out.println("----------------------------------------------------");
   System.out.println("| Todos los derechos reservados; Coca-Cola Company©|");
   System.out.println("----------------------------------------------------");

   System.out.println("Por favor, escribe tu nombre: ");
   name = in.nextLine();
   System.out.println("¡Hola! " +name+", porfavor escribe tu clave de departamento: ");
   key = in.nextInt();
   System.out.println("Escribe la cantidad de años que tienes en servicio: ");
   old = in.nextInt();
   System.out.println("");

   if(key == 1){ //Clave 1, departamento de Arención al cliente
     System.out.println("");
     System.out.println("Departamento de Atención al Cliente:");

     if(old == 1){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de Atención al cliente");
       System.out.println("con antiguedad de "+old+" año en servicio, tiene derecho a 6 días de vacaciones.");
       System.out.println("");
       name ="";
       old=0;
       key=0;
       flag=0;

     }else if(old >= 2 && old <=6){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de Atención al cliente");
       System.out.println("con antiguedad de "+old+" años en servicio, tiene derecho a 14  días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else if(old >= 7){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de Atención al cliente");
       System.out.println("con antiguedad de "+old+" años en servicio, tiene derecho a 20  días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else{
       System.out.println("La cantidad de años de servicio no es posible");
     }

   } else if(key == 2){ //Clave 2, departamento de logística
     System.out.println("");
     System.out.println("Departamento de logística:");

     if(old == 1){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de logística con antiguedad");
       System.out.println("de "+old+ " año en servicio, tiene derecho a 7 días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else if(old >=2 && old <=6){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de logística con antiguedad");
       System.out.println("de "+old+ " años en servicio, tiene derecho a 15 días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else if(old >= 7){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de logística con antiguedad");
       System.out.println("de "+old+ " años en servicio, tiene derecho a 22 días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else{
       System.out.println("La cantidad de años de servicio no es posible");
     }

   } else if(key == 3){ //Clave 3, departamento de gerencia
     System.out.println("");
     System.out.println("Departamento de gerencia:");

    if(old == 1){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de gerencia con antiguedad");
       System.out.println("de "+old+ " año en servicio, tiene derecho a 10 días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else if(old >=2 && old <=6){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de gerencia con antiguedad");
       System.out.println("de "+old+ " años en servicio, tiene derecho a 20 días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else if(old >= 7){
       System.out.println("");
       System.out.println("El trabajador "+name+", perteneciente al departamento de gerencia con antiguedad");
       System.out.println("de "+old+ " años en servicio, tiene derecho a 30 días de vacaciones.");
       System.out.println("");;
       name ="";
       old=0;
       key=0;
       flag=0;

     }else{
       System.out.println("La cantidad de años de servicio no es posible");
     }
   } else {
      System.out.println("Error, la clave de departamento que escribió no existe");
      System.out.println("");
   }

  }
 }
}
