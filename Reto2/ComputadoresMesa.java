package Reto2;

public class ComputadoresMesa extends Computadores {
    protected final static Integer ALMACENAMIENTO_BASE = 50;
    // Variable
    protected Integer almacenamiento;
    // Constructor
    public ComputadoresMesa() {
        almacenamiento = ALMACENAMIENTO_BASE;
    }
    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso) {
        this.almacenamiento = ALMACENAMIENTO_BASE;
        this.peso = getPeso();
        this.consumoW = getConsumoW();
        this.precioBase = getPrecioBase();
    }
    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer
    almacenamiento) {
        this.almacenamiento = ALMACENAMIENTO_BASE;
        this.peso = getPeso();
        this.consumoW = getConsumoW();
        this.precioBase = getPrecioBase();
    }
    // Métodos
    public Double calcularPrecio() {
        Double adicion = super.calcularPrecio();
        if (almacenamiento > 100){
            adicion += 50;
        }
        return adicion;
    // Código return adicion;
    }
    public Integer getCarga() {
        return almacenamiento;
        }
        
    }
    