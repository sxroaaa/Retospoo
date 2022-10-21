package condicionales;

import java.util.Random;
import java.util.Scanner;
public class reto4 {
    
    public static void main(String args[]){
        int numero, eleccion; 
        Random dado=new Random();
        Scanner leer=new Scanner(System.in);
        numero= (int) (dado.nextDouble()*3+1);
        System.out.println(numero);
        System.out.println("elige un numero\n 1. piedra\n 2. papel \n 3.tijera ");
        eleccion=leer.nextInt();

        if (numero==1 && eleccion== 2){
            System.out.println("Ganaste, papel le gana a piedra");
        }
        else if(numero==1 && eleccion ==3 ){
            System.out.println("Perdiste, piedra le gana a tijera");
        }
        else if(numero==2 && eleccion==1){
            System.out.println("Perdiste, papel le gana a piedra");
        }
        else if(numero==2 && eleccion==3){
            System.out.println("Ganaste, piedra le gana a papel");
        }
        else if(numero==3 && eleccion==1){
            System.out.println("Ganaste, piedra le gana a tijera");
        }
        else if(numero==3 && eleccion==2){
            System.out.println("Perdiste, tijera le gana a papel");
        }
        else if (numero==eleccion){
            System.out.println("hay un empate");
        
        }
        else{
            System.out.println("caracter no admitido");
        }

        leer.close();
    }
}
