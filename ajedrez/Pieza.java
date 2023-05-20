package javagames.javaBasics.ajedrez;

public class Pieza {
    
    // Atributos
    private final String name;
    private final String color;

    // Constructor
    public Pieza(String name ,String color) {
        super();
        this.name = name;
        this.color = color;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    // toString
    public String toString() {
        return "Pieza: "+ name + " de color: " + color;
    }
}
