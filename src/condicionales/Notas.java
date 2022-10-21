package condicionales;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        double nota=0, totalnota=0, suma=0;
        Scanner leer=new Scanner(System.in);
        for (int i=1; i<=4; i++){
          System.out.println("Digite de 1.0 al 5.0 la nota obtenidad en cada uno de los talleres:");
          nota=leer.nextDouble();
          suma=suma+i;
        
       }
        totalnota= nota + nota / 4;
        
        System.out.println("su nota final es: " +totalnota);
        leer.close();

        if ( 0.0 >= totalnota || totalnota <2.9){
           System.out.println("Reprobaste la asignatura");     
       }
       else if( 3.0 >= totalnota || totalnota <=4.0){
        System.out.println("pasaste raspando la asignatura");
       }
       else if(totalnota >4){
        System.out.println("Aprobaste con buenos resultados");
       }
    }
       
}
