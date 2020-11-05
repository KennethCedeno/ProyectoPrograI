package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema2ProyectoPromedioSinArreglo {
   //metodo de suma, necesario para calcular el promedio
    public static int suma(int numA, int numB) {
        int resultadoSuma= numA + numB;
        return resultadoSuma;
    }
    
    
    public static void main(String[] args) {
        
        // k corresponde al numero de datos que el usuario desea utilizar (p.1)
        int k;
        int berenjena = 0;
        int promedio;
        Scanner datos = new Scanner(System.in);
        // se le pide al usuario los datos con los que desea trabajar (p.1)
        System.out.println("Favor inserte el numero de datos con los que desea trabajar: ");
        k = datos.nextInt();
        // ciclo para calcular la sumatoria de los datos del usuario (p.1)
        for (int p = 1; p<=k; p++) {
            System.out.println("Favor insertar el numero " + p + ": ");
            int sumasindiv = datos.nextInt();
            berenjena = sumasindiv + berenjena;
        }
        // division para calcular el promedio
        promedio = berenjena / k;
        System.out.println("El promedio es: " + promedio); 
    } 
    
    
}
