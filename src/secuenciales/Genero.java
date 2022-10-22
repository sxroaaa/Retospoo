package secuenciales;
import java.util.Scanner;
public class Genero {
   
    public static void main(String[] args) {
        String eleccion;
        int mujer=0, hombre=0;
        for (int i=1; i<=10; i++){
        Scanner leer=new Scanner(System.in);
        System.out.println("escriba su genero");
        eleccion=leer.nextLine();
        if (eleccion.equals("mujer")){
            mujer=mujer+1;
        }
        else if (eleccion.equals("hombre")){
            hombre=hombre+1;

        leer.close();
        }
        }
        System.out.println("el total de mujeres en el grupo es: " +mujer+ " y de hombres es: " +hombre);
    }
}
