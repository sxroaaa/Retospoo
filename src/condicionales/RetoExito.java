package condicionales;
import java.util.Scanner;

public class RetoExito {
    public static void main(String[] args) {

        int precioP, Cantidad, referencias=0, subtotal=0, total=0, valorpaga, cambio;
        String pregunta;
        Scanner leer=new Scanner(System.in);
        for (int i=1; i<=5; i++){
            System.out.println("Digite el precio del producto");
            precioP=leer.nextInt();
            System.out.println("digite la cantidad del producto");
            Cantidad=leer.nextInt();
            referencias=referencias+1;
            subtotal=precioP*Cantidad;
            total=total+subtotal;
            System.out.println(Cantidad+ " del producto de precio " +precioP+ " es " +subtotal);
    

          }
          System.out.println("el total de su compra es " +total);
          System.out.println("escriba el valor con el que cancela la cuenta");
            valorpaga=leer.nextInt();
            cambio=valorpaga-total;
            System.out.println("su cambio es: " +cambio);
          leer.nextLine();//limpieza buffer
            System.out.println("cuenta con telefonia movil exito, escriba si o no:");
          pregunta=leer.nextLine();

          if(pregunta.equals("si")){
            System.out.println("la cantidad de minutos de la compra es " +referencias);
          }
           else{
            System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil");
           }
           leer.close();
 }
}
