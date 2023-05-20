package javagames.javaBasics.complexNumbers;

import java.lang.Math;

class ComplexNumber {
    // Atributes
    private double real;
    private double imag;
    private double mod;
    private double arg;

    // Constructor
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
        this.mod = this.calcMod()[0];
        this.arg = this.calcMod()[1]*360;
    }

    // Getters
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public double getMod() {
        return mod;
    }
    public double getArg() {
        return arg;
    }

    // Setters
    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }

    // Calculate module and arg
    public double[] calcMod() {
        double[] mod_arg = new double[2];
        mod_arg[0] = Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
        mod_arg[1] = Math.atan(imag / real);
        return mod_arg;
    }

    // Metodo de printado
    @Override
    public String toString() {
        if (this.imag < 0) {
            return real + " " + imag+"j";
        } 
        else {
            return real + " +" + imag+"j";
        }
    }

    // Metodo de printado alternativo
    public String toStringMod() {
        return mod + " < " + arg; 
    } 

    // Metodo de clase
    public static ComplexNumber suma(ComplexNumber c1, ComplexNumber c2) {
        double real = c1.getReal() + c2.getReal();
        double imag = c1.getImag() + c2.getImag();
        ComplexNumber c3 = new ComplexNumber(real, imag);
        return c3;
    }
}