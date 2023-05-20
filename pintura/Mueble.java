package javagames.javaBasics.pintura;

public class Mueble {
    
    // Atributes
    // Final pq es definitivo el color del cual lo queremos pintar y el tipo de mueble
    // No es static pq cada uno puede tener un color diferente
    private final String color;
    private final String type;

    // Constructor
    public Mueble(String type,String color) {
        this.type = type;
        this.color = color;
    }

    public String toString() {
        return type + " "+ color;
    }

}
