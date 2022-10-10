
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;
public class Ejercicio5 {
    
    public static void main (String [] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Por favor escriba el radio del circulo");
            String radio = scanner.nextLine();
            double valorRadio = Double.parseDouble(radio);
            double area = 3.1416 * Math.pow (valorRadio, 2);
            System.out.println ("El area del circulo es "+ area);
        }
    } 

