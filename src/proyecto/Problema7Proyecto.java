package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema7Proyecto {
    public static void main(String[] args) {
        Scanner pajaro = new Scanner(System.in);
        int x;
        int y;
        int multiplicacion = 1 ;
        
        System.out.println("Inserte el numero que desea potenciar: ");
        x = pajaro.nextInt();
        
        
        
        System.out.println("Inserte el numero con el que desea potenciar: ");
        y = pajaro.nextInt();
        
        for (int p = 1 ; p <= y; p++) {
            multiplicacion = multiplicacion*x;
            
        }
        
        System.out.println("El resultado de "+x+" potenciado a la "+y+" es igual a "+multiplicacion+"." );
    }
}
