package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema4Proyecto {
    public static void main(String[] args) {
        // teclado en ingles, esto va a ser raro
        int anoUsuario; 
        int residuoCon4;
        int cuatrolol = 4;
        int cuatrocientoslol = 400;
        int residuoCon400;
        
        Scanner berenjenaBisiesta = new Scanner(System.in);
        System.out.println("¿Qué año desea saber si fue/sera bisiesto o no?");
        anoUsuario = berenjenaBisiesta.nextInt();
        // operaciones para saber si es bisiesto
        residuoCon4 = anoUsuario%cuatrolol;
        residuoCon400 = anoUsuario%cuatrocientoslol;
        
        if (residuoCon4 == 0 && residuoCon400 == 0) {
            System.out.println("Ese año si fué/será bisiesto.");
        } else {
            System.out.println("Ese año no fué/será bisiesto.");
        }
    }
}
