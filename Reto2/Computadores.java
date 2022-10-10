package Reto2;

public class Computadores {
    // Variables base
    protected final static char CONSUMO_W = 'F';
    protected final static double PRECIO_BASE= 100.0;
    protected final static Integer PESO_BASE = 5;

    // Variables
    protected Integer peso;
    protected double precioBase;
    protected char consumoW;

    // Constructores public Computadores(){
    // Constructor
    public Computadores() {
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
    }
    public Computadores(Double precioBase, Integer peso) {
        this.peso = peso;
        this.consumoW = CONSUMO_W;
        this.precioBase = precioBase;
    }
    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }
    // getters
    public Integer getPeso() {
        return peso;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public char getConsumoW() {
        return consumoW;
    }
    // Metodos

       
    public Double calcularPrecio() {
        Double adicion= 0.0;

        if (peso >= 0 && peso <19){
            adicion += 10;
           } else if (peso >= 20 && peso <49){
            adicion += 50;
           }else if (peso >= 50 && peso <=79){
            adicion +=80;
           }else if (peso >= 80){
            adicion +=100;
           } 

        if (consumoW == 'A'){
            adicion += 100;
        } else if (consumoW == 'B'){
            adicion += 80;
        } else if (consumoW == 'C'){
            adicion += 60;
        } else if (consumoW == 'D'){
           adicion += 50;
        } else if (consumoW == 'E'){
            adicion += 30;
        } else if (consumoW == 'F'){
            adicion += 10;
        }else if (consumoW == 'Z'){
            adicion += 0;
        }
        return adicion + consumoW;
    } 
}

