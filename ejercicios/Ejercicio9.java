//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y 
//calcule el precio final con IVA. El IVA sera una constante que sera del 21%.



import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor ingrese el precio del producto");
        String precio = sc.nextLine();
        Double precioDouble = Double.parseDouble(precio);
        Double iva = precioDouble * 1.21;
        System.out.println("El costo del producto con iva incluido es: "+ iva);
    }

}
