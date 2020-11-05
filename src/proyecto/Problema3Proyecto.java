package proyecto;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Problema3Proyecto {
    // metodo para calcular el impuesto sobre la renta a pagar
    public static int impuestoRenta(int salarioMensual, int numDependientes) {
        int porPagar = 0;
        
        
        if (numDependientes == 1) {
            if (salarioMensual < 200000) {
                porPagar = 0;
            } else if (200000 <= salarioMensual) {
                porPagar = (salarioMensual*10)/100;
            } else if (salarioMensual < 400000) {
                porPagar = (salarioMensual*10)/100;
            } else if (400000 <= salarioMensual) {
                porPagar = (salarioMensual*15)/100;
            } else if (salarioMensual < 600000 ) {
                porPagar = (salarioMensual*15)/100;
            } else if (600000 <= salarioMensual) {
                porPagar = (salarioMensual*20)/100;
            } else if (salarioMensual < 800000 ) {
                porPagar = (salarioMensual*20)/100;
            } else if (800000 <= salarioMensual) {
                porPagar = (salarioMensual*30)/100;
            }
        } else if (numDependientes == 2) {
            if (salarioMensual < 200000) {
                porPagar = 0;
            } else if (200000 <= salarioMensual) {
                porPagar = (salarioMensual*10)/100;
            } else if (salarioMensual < 400000) {
                porPagar = (salarioMensual*10)/100;
            } else if (400000 <= salarioMensual) {
                porPagar = (salarioMensual*15)/100;
            } else if (salarioMensual < 600000 ) {
                porPagar = (salarioMensual*15)/100;
            } else if (600000 <= salarioMensual) {
                porPagar = (salarioMensual*20)/100;
            } else if (salarioMensual < 800000 ) {
                porPagar = (salarioMensual*20)/100;
            } else if (800000 <= salarioMensual) {
                porPagar = (salarioMensual*30)/100;
            }
            porPagar = (porPagar*90)/100;
        } else if (numDependientes == 3) {
            if (salarioMensual < 200000) {
                porPagar = 0;
            } else if (200000 <= salarioMensual) {
                porPagar = (salarioMensual*10)/100;
            } else if (salarioMensual < 400000) {
                porPagar = (salarioMensual*10)/100;
            } else if (400000 <= salarioMensual) {
                porPagar = (salarioMensual*15)/100;
            } else if (salarioMensual < 600000 ) {
                porPagar = (salarioMensual*15)/100;
            } else if (600000 <= salarioMensual) {
                porPagar = (salarioMensual*20)/100;
            } else if (salarioMensual < 800000 ) {
                porPagar = (salarioMensual*20)/100;
            } else if (800000 <= salarioMensual) {
                porPagar = (salarioMensual*30)/100;
            }
            porPagar = (porPagar*70)/100;
        } else if (numDependientes == 4) {
            if (salarioMensual < 200000) {
                porPagar = 0;
            } else if (200000 <= salarioMensual) {
                porPagar = (salarioMensual*10)/100;
            } else if (salarioMensual < 400000) {
                porPagar = (salarioMensual*10)/100;
            } else if (400000 <= salarioMensual) {
                porPagar = (salarioMensual*15)/100;
            } else if (salarioMensual < 600000 ) {
                porPagar = (salarioMensual*15)/100;
            } else if (600000 <= salarioMensual) {
                porPagar = (salarioMensual*20)/100;
            } else if (salarioMensual < 800000 ) {
                porPagar = (salarioMensual*20)/100;
            } else if (800000 <= salarioMensual) {
                porPagar = (salarioMensual*30)/100;
            }
            porPagar = (porPagar*60)/100;
        } else if (numDependientes > 4) {
            if (salarioMensual < 200000) {
                porPagar = 0;
            } else if (200000 <= salarioMensual) {
                porPagar = (salarioMensual*10)/100;
            } else if (salarioMensual < 400000) {
                porPagar = (salarioMensual*10)/100;
            } else if (400000 <= salarioMensual) {
                porPagar = (salarioMensual*15)/100;
            } else if (salarioMensual < 600000 ) {
                porPagar = (salarioMensual*15)/100;
            } else if (600000 <= salarioMensual) {
                porPagar = (salarioMensual*20)/100;
            } else if (salarioMensual < 800000 ) {
                porPagar = (salarioMensual*20)/100;
            } else if (800000 <= salarioMensual) {
                porPagar = (salarioMensual*30)/100;
            }
            porPagar = (porPagar*40)/100;
        }
        return porPagar;
    }
    public static void main(String[] args) {
        int salarioMensua;
        int numDependiente;
        int resultado;
        //escaner para pedir el salario mensual y el numero de dependientes
        Scanner transito = new Scanner(System.in);
        
        
        System.out.println("Inserte su salario mensual: ");
        salarioMensua = transito.nextInt();
        System.out.println("Inserte el numero de dependientes: ");
        numDependiente = transito.nextInt();
        
        resultado = impuestoRenta(salarioMensua, numDependiente);
        System.out.println("El impuesto que debe pagar es de: "+ resultado);
        
    }
}
