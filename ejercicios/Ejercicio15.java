//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
//si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.print("ingrese un valor mayor a cero");
            valor=sc.nextInt();
        } while(valor<=0);
  
        System.out.println(valor);
    }    
}
