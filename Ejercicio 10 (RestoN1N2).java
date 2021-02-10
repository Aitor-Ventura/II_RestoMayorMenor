import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {

    public static void main(String[] args) {
        resto();
    }
    
    /**
     * Método resto a modificar. Debe leer dos números enteros y
     * mostrar en pantalla el resto de la división del mayor 
     * entre el menor
     */
     public static void resto() {
        Scanner input = new Scanner(System.in);
        int num1 , num2;
        System.out.print("Introduce un valor entero: ");
            num1 = input.nextInt();
        System.out.print("Introduce otro valor entero: ");
            num2 = input.nextInt();
        if(num1 > num2){
            System.out.println(num1 % num2 + " es el resto de la división del mayor entre el menor.");
        } else {
            System.out.println(num2 % num1 + " es el resto de la división del mayor entre el menor.");
        }
    }
}