package reto1;
public class BecaUniversitaria {
    //
    // Atributos
    private double Monto ;
    private double Interes ;
    private int Tiempo ;

    public BecaUniversitaria(){
        Monto = 0;
        Interes = 0;
        Tiempo = 0;
    }
    // Constructores
    //
    public BecaUniversitaria (int pTiempo, double pMonto, double
    pInteres ){
        this.Tiempo = pTiempo;
        this.Monto = pMonto;
        this.Interes = pInteres;
    }
    //
    // Métodos
    //
    
   
    public double calcularInteresSimple(){
        double interesesSimple = Monto * (Interes/100) * Tiempo;
        return Math.round(interesesSimple);
    }
    public double calcularInteresCompuesto(){
        double interesCompuesto = Monto * (Math.pow(1 + Interes / 100, Tiempo)  - 1);
        return Math.round(interesCompuesto);
    }
    public String compararInversion (int pTiempo, double pMonto, double pInteres){ 
        this.Tiempo = pTiempo;    
        this.Monto = pMonto;
        this.Interes = pInteres;  
        
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia > 0) {
            return("La diferencia entre la proyección de interés compuesto e interés simple es: $"+ Math.ceil(diferencia));
        }  else {
            return("No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.");
        }
    }
    public String compararInversion() {
        double diferencia = 0;

        diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }
}   