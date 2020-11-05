package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema2ProyectoNumeroMasAlto {
    public static void main(String[] args) {
        // cantidad de numeros deseados por el usuario
        int num;
        
        // numeros del usuario
        int usuario;
        
        // 0 nos asegura que todos los valores introducidos por el usuario sean mayores
        // esto nos ayuda a que el valor del usuario se guarde en la variable "masAlto"
        int masAlto = 0;
        
        Scanner apio = new Scanner(System.in);
        
        // cantidad de numeros deseados por el usuario, se guarda en num
        System.out.println("Indique la cantidad de numeros con los que desea trabajar: ");
        num = apio.nextInt();
        
        // ciclo para pedir una cantidad de veces igual a la cantidad de numeros deseados por el usuario
        for (int b = 0; b<num; b++) {
            System.out.println("Ingrese el numero " + (b+1) + ": ");
            usuario = apio.nextInt();
            
            if (usuario>masAlto) {
                masAlto=usuario;
            }
        }
        System.out.println("El valor mas alto es: " + masAlto);
    }
}
