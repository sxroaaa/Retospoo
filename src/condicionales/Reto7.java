package condicionales;
import java.util.Random;
import java.util.Scanner;
public class Reto7{
    public static void main(String[] args) {
        int apuesta=0, juego=0, jugador1, jugador2, gana=0;
        String seguir="si";
        Scanner leer=new Scanner(System.in);
         Random aleatorio=new Random();
         jugador2= (int)(aleatorio.nextDouble()*2+1);

         do{

            System.out.println("ingrese el valor que desea apostar ");
            apuesta=leer.nextInt();

            System.out.println("elige 1.para cara o 2.para sello");
            jugador1=leer.nextInt();
            juego=juego+1;
            

            if (jugador1==jugador2){
               System.out.println("Ganaste, ahora puedes duplicar tu apuesta!!");
                apuesta=apuesta*2;
                gana=gana+apuesta;
              
            }
            else if(jugador1!=jugador2){
               System.out.println("Perdiste, no salio lo mismo");
               apuesta-=apuesta; 
                                           
            }
            else{
               System.out.println("caracter no permitido");
            }
            leer.nextLine();
            System.out.println("¿desea seguir jugando?");
            seguir=leer.nextLine();

            
          
   
         } while(seguir.equalsIgnoreCase("si"));

                System.out.println("la veces que usted jugo fue: " +juego+ " y gano " +gana);


       leer.close();
    }
}