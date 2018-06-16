package com.cice.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora, introduce primer numero: ");

        Scanner sc = new Scanner(System.in);

        int primero = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");

        int segundo = sc.nextInt();

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.suma(primero,segundo);
        calculadora.pintarResultado(resultado);
    }
}
