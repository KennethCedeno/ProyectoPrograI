package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema6Proyecto {
    public static int areaCuadrado(int lado) {
        int area;
        area = lado*lado;
        return area;
    }
    public static int areaRectangulo(int ancho, int largo) {
        int area;
        area = ancho*largo;
        return area;
    }
    public static double areaCirculo(int radio) {
        double area;
        //no reconoce el pi :D
        area = 3.14159265359*(radio*radio);
        return area;
    }
    public static void main(String[] args) {
        
        Scanner piopio = new Scanner(System.in);
        
        String figura;
        int ladoCuadrado;
        int resultado;
        int largoRectangulo;
        int anchoRectangulo;
        int radioCirculo;
        double resultadoCirculo;
        
        System.out.println("¿De qué figura desea saber el área?");
        figura = piopio.next();
        
        if (figura.equals("Cuadrado")) {
            
            // guarda la medida del lado en "ladoCuadrado"
            System.out.println("Inserte la medida del lado: ");
            ladoCuadrado = piopio.nextInt();
            
            // calcula el area con el metodo "areaCuadrado" e imprime el resultado
            resultado = areaCuadrado(ladoCuadrado);
            System.out.println("El area de su cuadrado es: " + resultado);
        
        } else if (figura.equals("Rectangulo")) {
            
            // guarda la medida del ancho en "anchoRectangulo"
            System.out.println("Inserte la medida del ancho del Rectangulo: ");
            anchoRectangulo = piopio.nextInt();
            //guarda la medida del largo en "largoRectangulo"
            System.out.println("Inserte la medida del largo del Rectangulo: ");
            largoRectangulo = piopio.nextInt();
            
            resultado = areaRectangulo(anchoRectangulo,largoRectangulo);
            System.out.println("El area de su rectangulo es:" + resultado );
        } else if (figura.equals("Circulo")) {
            
            // guarda la medida del radio en "radioCirculo"
            System.out.println("Inserte la medida del radio: ");
            radioCirculo = piopio.nextInt();
            
            // calcula el area con el metodo "areaCuadrado" e imprime el resultado
            resultadoCirculo = areaCirculo(radioCirculo);
            System.out.println("El area de su circulo es: " + resultadoCirculo);
        }
        
    }
}
