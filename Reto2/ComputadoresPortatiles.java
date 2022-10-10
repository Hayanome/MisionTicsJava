package Reto2;

public class ComputadoresPortatiles extends Computadores {
    protected final static Integer PULGADAS_BASE = 20;
    protected final static boolean CAMARA = false;

    // Atributos
    protected Integer pulgadas;
    protected boolean camaraITG;
    // Constructor
    public ComputadoresPortatiles() {
        pulgadas = PULGADAS_BASE;
        camaraITG = CAMARA;
    }
    public ComputadoresPortatiles(Integer pulgadas, boolean camaraITG) {
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
        this.peso = getPeso();
        this.consumoW = getConsumoW();
        this.precioBase = getPrecioBase();

    }
    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = CAMARA;
        this.peso = getPeso();
        this.precioBase = getPrecioBase();
    }
    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer
    pulgadas, boolean camaraITG) {
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
        this.peso = getPeso();
        this.consumoW = getConsumoW();
        this.precioBase = getPrecioBase(); 
        }
    // Métodos
    public Double calcularPrecio() {
        Double adicion = super.calcularPrecio();
        if (pulgadas>40){
            adicion += (precioBase * 0.3);
        }
        if (camaraITG=true){
            adicion += 50;
        }
        return adicion;
    // Método Código return adicion;
    } 
    }
        