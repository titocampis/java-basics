package javagames.javaBasics.pintura;

public class Persona {
    // Atributes
    // Final pq es definitivo el color del cual lo queremos pintar y el tipo de mueble
    // No es static pq cada uno puede tener un color diferente
    private final String DNI;
    private final String name;
    private String puesto;

    // Constructor
    public Persona(String DNI,String name, String puesto) {
        this.DNI = DNI;
        this.name = name;
        this.puesto = puesto;
    }

    // Getter
    public String getName() {
        return name;
    }

    // To string
    public String toString() {
        return "DNI: " + DNI + "\n" +
               "name: " + name + "\n" +
               "puesto: " + puesto;
    }


}
