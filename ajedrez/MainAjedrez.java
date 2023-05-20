package javagames.javaBasics.ajedrez;

public class MainAjedrez {
    public static void main(String[] args) {
        Pieza piez = new Pieza("peon", "negro");
        int[] m = {1, 0};
        Peon peon = new Peon("peon", "negro", m);
        System.out.println(piez);
        System.out.println(peon);
    }
}
