package com.cice.circulo;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circulo {

    private double radio;
    private double area;
    private double perimetro;

    public double area(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public double perimetro(double radio){
        return 2*Math.PI*radio;
    }

    public static void pintarResultado(double area, double perimetro){
        System.out.println("El Area es: "+area);
        System.out.println("El Perimetro es: "+perimetro);
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public void setArea(double area){
        this.area = area;
    }

    public void setPerimetro(double perimeto){
        this.perimetro=perimeto;
    }
}
