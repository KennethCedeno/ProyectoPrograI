package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema2ProyectoFactorial {
    // SUPER IMPORTANTE, no poner 0 en ninguna de las variables, ya que multiplicara por 0 y lo manda alv
    // metodo para calcular el factorial del numero pedido
    public static int factorial(int numeroUsuario) {
       int resultado = 1;
       for (int n = 1; n <= numeroUsuario; n++) {
           resultado= resultado * n;
       }
       return resultado;
   } 
   // no puedo al metodo berenjena :D
   public static void main(String[] args) {
       //n sera el numero del usuario
       int n;
       // escaner para el numero del usuario
       Scanner zed = new Scanner(System.in);
       // pedimos y registramos el numero del usuario
       System.out.println("Insertar el numero: ");
       n = zed.nextInt();
       // calculamos con el metodo factorial e imprimimos el resultado
       int kekw = factorial(n);
       System.out.println("El factorial de tu numero es: " + kekw);
   }
}
// update: no sirve :D
// ahora si, revisar nota SUPER IMPORTANTE