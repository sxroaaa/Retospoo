package secuenciales;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        double nota=0,  total=0, promedio=0;
        Scanner leer=new Scanner(System.in);
        for (int i=1; i<=4; i++){
          System.out.println("Digite de 1.0 al 5.0 la nota obtenidad en cada uno de los talleres:");
          nota=leer.nextDouble();
          total=total+nota;
          promedio= total/4;

        
       }
      
        
        System.out.println("su nota final es: " +promedio);
        leer.close();

        if ( 0.0 >= promedio || promedio <2.9){
           System.out.println("Reprobaste la asignatura");     
       }
       else if( 3.0 >= promedio|| promedio<=4.0){
        System.out.println("pasaste raspando la asignatura");
       }
       else if(promedio>4){
        System.out.println("Aprobaste con buenos resultados");
       }
    }
       
}
