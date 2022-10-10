package reto1;

public class mainPrincipal {
    
    public static void main (String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
    // Llamados para verificar con los casos de prueba el funcionamiento de la clase
    }
    
}
