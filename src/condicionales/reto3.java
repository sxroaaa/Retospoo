package condicionales;
import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String args[]){
         int juego, jugador;
         Scanner leer=new Scanner(System.in);
         Random aleatorio=new Random();
         juego= (int)(aleatorio.nextDouble()*2+1);

         System.out.println("elige 1.para cara o 2.para sello");
         jugador=leer.nextInt();

         if (jugador==juego){
            System.out.println("Ganaste, eligieron lo mismo");
         }
         else if(jugador!=juego){
            System.out.println("Perdiste, no salio lo mismo");
         }
         else{
            System.out.println("caracter no permitido");
         }
         leer.close();

        
 }
}
