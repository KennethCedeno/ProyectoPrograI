package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema1Proyecto { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        Scanner operador = new Scanner(System.in);
        
        System.out.println("Por favor inserte el operador de la operacion deseada: ");
        String operacion = operador.next();
        
        if ("+".equals(operacion)) {
            System.out.println("Inserte el primer numero: ");
            int num1 = calc.nextInt();
            System.out.println("Inserte el segundo numero: ");
            int num2 = calc.nextInt();
            int resultadoSuma = num1 + num2;
            System.out.println("El resultado es: " + resultadoSuma);
            
        } else if ("-".equals(operacion)) {
            System.out.println("Inserte el primer numero: ");
            int num1 = calc.nextInt();
            System.out.println("Inserte el segundo numero: ");
            int num2 = calc.nextInt();
            int resultadoResta = num1 - num2;
            System.out.println("El resultado es: " + resultadoResta);
            
        } else if ("*".equals(operacion)) {
            System.out.println("Inserte el primer numero: ");
            int num1 = calc.nextInt();
            System.out.println("Inserte el segundo numero: ");
            int num2 = calc.nextInt();
            int resultadoMultiplicacion = num1 * num2;
            System.out.println("El resultado es: " + resultadoMultiplicacion);
            
        } else if ("/".equals(operacion)) {
            System.out.println("Inserte el primer numero: ");
            int num1 = calc.nextInt();
            System.out.println("Inserte el segundo numero: ");
            int num2 = calc.nextInt();
            int resultadoDivision = num1 / num2;
            System.out.println("El resultado es: " + resultadoDivision);
            
        }
        
        }
    }
    

