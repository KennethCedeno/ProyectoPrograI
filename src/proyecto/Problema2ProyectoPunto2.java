package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema2ProyectoPunto2 {
    
    //Metodo de suma usado en el punto anterior
    public static int suma(int numA, int numB) {
        int resultadoSuma= numA + numB;
        return resultadoSuma;
    }
    
    
    // recordar que el parentesis cuadrado indica un arreglo
    public static int ConArreglo(int[] datos) {
        // para ambos int, si no los inicializo con 0 o algun valor, me dara error
        int promedio = 0;
        int sumatoria = 0;
        // ciclo que permite sumar los valores introducidos por el usuario
        for (int yeet : datos) {
            sumatoria = suma(sumatoria, yeet);
        }
        // suma de los datos del usuario entre el numero de datos utilizados por el mismo
        promedio = sumatoria / datos.length;
        // si no uso return me da error
        return promedio;
    }
    /* tuve que renombrar el metodo de mainParaArreglo a solo main
        ya que me daba error "main method not found"
    */
    public static void main(String[] args) {
        // numero de datos del usuario
        int numeroDeDatos;
       
        // escaner para el numero de datos y los datos del usuario
        Scanner berenjena = new Scanner(System.in);
       
        // usuario indica la cantidad de numeros
        System.out.println("Indique la cantidad de numeros con los que desea trabajar: ");
        numeroDeDatos = berenjena.nextInt();
        
        //parentesis cuadrados indica arreglo
        int[] lol = new int[numeroDeDatos];
        //IMPORTANTE cuando use z<=numeroDeDatos me dio error a la hora de calcular el promedio
        //IMPORTANTE indicar el valor del int, evita gastar 10 minutos buscando el error c:
        for (int z=0; z<numeroDeDatos; z++) {
            // z + 1 para que no imprima "Inserte el numero 0"
            System.out.println("Inserte el numero "+(z+1)+":");
            // z indica el dato del usuario, puede ser confuso
            lol[z] = berenjena.nextInt();
        }
        // deberia cambiar el nombre del metodo, puede ser confuso
        int resultado = ConArreglo(lol);
        System.out.println("El promedio es: " + resultado);
    }
}
