//Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».



import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor escriba su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
}
