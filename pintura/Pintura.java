package javagames.javaBasics.pintura;

public class Pintura {
    // Atributes
    // Final pq es definitivo el color del cual lo queremos pintar y el tipo de mueble
    private final String color;

    // Constructor
    public Pintura(String color) {
        this.color = color;
    }

    public String toString() {
        return "Pintura " + color;
    }
}
