package javagames.javaBasics.pintura;

import java.util.Iterator;

import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Empezamos con la paleta de pinturas (sin orden)
        Set<Pintura> paleta = new HashSet<Pintura>();

        // Añadimos una pintura roja
        paleta.add(new Pintura("rojo"));

        // En este caso nos dejara meter 2 azules porque no lo asocia al mismo objeto
        paleta.add(new Pintura("azul"));
        paleta.add(new Pintura("azul"));

        // Aquí ya si que no se lo va a comer
        Pintura pinturaVerde = new Pintura("verde");
        paleta.add(pinturaVerde);
        paleta.add(pinturaVerde);
        System.out.println(paleta);
        // Podemos iterar el objeto de la forma que mas nos convenga
        // For each
        // for (Pintura p : paleta) {
        //     System.out.println(p);
        // }

        // Iterator
        Iterator<Pintura> itPint = paleta.iterator();
        while(itPint.hasNext()) {
            Pintura pint = itPint.next();
            System.out.println(pint);
        }
        System.out.println("===================");

        // Empezamos con los muebles, estos si tienen orden pues los clientes se enfadan
        List<Mueble> mueblesArray = new ArrayList<Mueble>();
        mueblesArray.add(new Mueble("escritorio", "negro"));
        mueblesArray.add(new Mueble("armario", "azul"));
        mueblesArray.add(new Mueble("mesa", "verde"));
        System.out.println(mueblesArray);

        Iterator<Mueble> itMueb = mueblesArray.iterator();
        while(itMueb.hasNext()) {
            Mueble mueb = itMueb.next();
            System.out.println(mueb);
        }
        System.out.println("===================");

        // Ahora vamos con los trabjadores (personas)
        Persona alex = new Persona("491491491m", "Alex","SRE");
        Persona clau = new Persona("890890891c", "Claudia","Matematica");
        Persona mario = new Persona("01010101a", "Mario","Becario");

        Map<String, Persona> plantilla = new HashMap<String, Persona>();
        plantilla.put(alex.getName(), alex);
        plantilla.put(clau.getName(), clau);
        plantilla.put(mario.getName(), mario);
        System.out.println(plantilla.get("Alex"));
    }
}
