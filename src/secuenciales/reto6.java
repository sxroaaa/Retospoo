package secuenciales;
import java.util.Random;
import java.util.Scanner;
public class reto6 {
   
    
    public static void main(String[] args) {
        int cantidad=0, precio=0, subtotal=0, compra=0, juego, descuento=0, pago=0, montototal=0;
        String respuesta="si";
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("ingrese la cantidad de productos adquiridos");
            cantidad=leer.nextInt();
            System.out.println("ingrese el precio de los productos adquiridos");
            precio=leer.nextInt();
            subtotal= cantidad*precio;
            compra+=subtotal;
            leer.nextLine();
            if (subtotal>=0){
                System.out.println("¿desea ingresar otro gasto?");
                respuesta=leer.nextLine();
            }
          

        } while(respuesta.equals("si"));

                if (compra>50000){
                    System.out.println("¡¡FELICIDADES!! puede acceder al descuento");
                    System.out.println("de manera aleatoria saldra el color de una bola");
                    System.out.println("1.bola roja\n 2.bola azul\n 3.bola amarilla\n 4.bola blanca");
                    Random aleatorio=new Random(); 
                    juego= (int)(aleatorio.nextDouble()*4);
                    System.out.println("salio la bola " +juego);
                    switch(juego){
                        case 1:
                         descuento= (int) (compra * 0.10);
                        montototal=compra-descuento;
                        System.out.println("felicidades tiene un 10% de descuento en su compra\n su valor total a pagar es: " +montototal);
                        System.out.println("ingrese el valor con el que cancela la cuenta: ");
                        pago=leer.nextInt();
                        pago=pago-descuento;
                        System.out.println("su cambio es de " +pago);
                        break;

                        case 2:
                            descuento= (int) (compra * 0.30);
                            montototal=compra-descuento;
                            System.out.println("felicidades tiene un 30% de descuento en su compra\n su valor total a pagar es: " +montototal);
                            System.out.println("ingrese el valor con el que cancela la cuenta: ");
                            pago=leer.nextInt();
                            pago=pago-descuento;
                            System.out.println("su cambio es de " +pago);
                        break;

                        case 3:
                         descuento= (int) (compra * 0.50);
                        montototal=compra-descuento;
                        System.out.println("felicidades tiene un 50% de descuento en su compra\n su valor total a pagar es: " +montototal);
                        System.out.println("ingrese el valor con el que cancela la cuenta: ");
                        pago=leer.nextInt();
                        pago=pago-descuento;
                        System.out.println("su cambio es de " +pago);
                        break;

                        case 4:
                         System.out.println("Felicidades, llevas tu compra completamente gratis");
                        break;

                        

                    }
                    }
                          leer.close();
 }
            
                
      
}
        


        
    
        
