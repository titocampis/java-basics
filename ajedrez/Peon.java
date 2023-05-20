package javagames.javaBasics.ajedrez;

public class Peon extends Pieza {
        // Atributos
        private int[] movimiento;
    
        // Constructor
        public Peon(String name ,String color,int[] movimiento) {
            super(name, color);
            this.movimiento = movimiento;
        }

        public int[] getMovimiento() {
            // return super.name no sería posible, pues es un atributo privado
            return movimiento;
        }

        // toString
        @Override
        public String toString() {
            // super.name no es accesible por esta clase, pues el atributo es privado
            return "Pieza: "+ super.getName() + " de color: " + super.getColor() + 
            " y que se mueve: " + movimiento[0] +", " + movimiento[1];
        }
}
