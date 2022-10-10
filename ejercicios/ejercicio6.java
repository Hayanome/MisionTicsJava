//Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.


import java.util.Scanner;

public class ejercicio6 {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escriba un numero");
        String dato = sc.nextLine();
        double datDouble = Double.parseDouble(dato);
        if (datDouble%2==0){
            System.out.println("El valor indicado es divisible entre dos");
        } else {
            System.out.println("el valor dado no es divisible en 2");
        }

    }
    
}
