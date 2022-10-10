//Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.


import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor escriba un numero");
        String dato = sc.nextLine();
        byte[] bytes = dato.getBytes(StandardCharsets.US_ASCII);
        System.out.print ("el vallor AsCII para "+ dato + " es: " + bytes);

    }
    
}
