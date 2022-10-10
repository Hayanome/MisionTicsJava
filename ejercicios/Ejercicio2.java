//Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. 
//Ves cambiando los valores para comprobar que funciona.


//1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división)

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        int a = 15;
        int b = 31;
        if (a>b) {
            System.out.println("El numero "+a+" es es el valor mayor");
        } else if (a==b){
            System.out.println("ambas cifras son iguales");
        }
        else {
            System.out.println("El numero "+b+" es es el valor mayor");
        }
    }
      
}