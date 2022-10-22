package secuenciales;
import java.util.Scanner;
public class Ciclowhile {
    public static void main(String[] args) {
       int presupuesto=100000, gasto=0, gastoc=0;
       String eleccion="si";
       Scanner leer=new Scanner (System.in);
       while(eleccion.equals("si")){
         System.out.println("Escriba el valor de su gasto: ");
         gasto=leer.nextInt();
         gastoc=gastoc+1;
         presupuesto=presupuesto-gasto;
         System.out.println("su gasto ha sido de " +gasto+ " y le queda un presupuesto de " +presupuesto);

        leer.nextLine();

         System.out.println("escriba si quiere agregar otro gasto");
            eleccion=leer.nextLine();

        if ( gasto <=3 || presupuesto<10000){
            System.out.println("no puede seguir ");
            
         }
      

        }

        leer.close();
       }

    }

