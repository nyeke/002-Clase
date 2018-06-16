package com.cice.circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        System.out.println("Introduce Radio del Circulo: ");
        Scanner sc = new Scanner(System.in);

        double radio = sc.nextInt();

        double area = circulo.area(radio);
        double perimetro = circulo.perimetro(radio);

        circulo.pintarResultado(area,perimetro);

        //Circulo circulo1 = new Circulo(radio);
        //System.out.println("El radio es:"+ circulo1.getRadio());

    }
}
