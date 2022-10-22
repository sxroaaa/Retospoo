package condicionales;
import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        String nombre, apellido;
        Scanner leer=new Scanner(System.in);

        System.out.println("digite su nombre");
        nombre=leer.nextLine();

        System.out.println("digite su apellido");
        apellido=leer.nextLine();

        System.out.println("la longitud de su nombre es: " +nombre.length() );
        System.out.println("la longitud de su apellido es: " +apellido.length() );
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());

        String nombre2= nombre.substring(0, 2);
        System.out.println(nombre2);
        System.out.println(nombre2+apellido);

     
    }
}
