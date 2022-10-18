import java.util.Scanner;
public class reto2 {
   
    public static void main(String args[]){
      System.out.println("Dosis vacuna");
      Scanner leer=new Scanner(System.in);
        double mesesbebe, dosisVacuna, pesobebe, dosisV;
        System.out.println("escribe el peso del bebe:");
        pesobebe=leer.nextDouble();
        System.out.println("escribe los meses que tiene el bebe:");
        mesesbebe=leer.nextDouble();

        dosisVacuna= (pesobebe+10)/(mesesbebe*10);
        dosisV = dosisVacuna * 8;
         System.out.println("las dosis necesarias para el bebe son: " +dosisV);
   }   
 }
