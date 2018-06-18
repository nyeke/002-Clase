package com.cice;

import com.cice.animal.Animal;
import com.cice.coches.Coche;
import com.cice.cuenta.Contador;
import com.cice.ejemplo.ClaseEstatica;
import com.cice.ejemplo.Test;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Animal("Podenco");
        Animal animal2 = new Animal("Carlino",5);

        System.out.println(animal.getRaza());
        System.out.println(animal1.getRaza());
        System.out.print(animal2.getRaza());
        System.out.println(" con " + animal2.getNumeroPatas() + " patas");

        int importe = 0;

        // Referencia Valor
        Test test = new Test(10);
        Test test1 = test;

        test.setEntero(20);

        System.out.println(test.getEntero());
        System.out.println(test1.getEntero());

        //Copia valor

        int numero = 10;
        int numeroEntero = numero;
        numero = 20;

        System.out.println(numero + " " + numeroEntero);

        String nombre = "Ernesto";
        String nombreCompleto = nombre;
        nombre = "Antonio";

        System.out.println(nombre + " " + nombreCompleto);

        //Llamada a metod estatici de una clase no requiere instanciar objeto
        ClaseEstatica.nombreCompuesto("Ernesto", "Muñoz");

        //Crea un objeto y modifica el valor de su variable estatica
        ClaseEstatica estatica1 = new ClaseEstatica();
        estatica1.numeroEstatico = 10;

        //Genero un nuevo objeto
        ClaseEstatica estatica2 = new ClaseEstatica();

        //Pinto el valor de la variable estatica del nuevo objeto
        System.out.println(estatica2.numeroEstatico);


        //Coche coche = new Coche();
        //coche.setPotencia(20);

        //coche.arrancar();
        //coche.acelerar();
        //coche.frenar();
        //coche.parar();

        //Coche coche2 = new Coche();
        //coche2.setPotencia(80);

        //coche2.arrancar();
        //coche2.acelerar();
        //coche2.frenar();
        //coche2.parar();

        //Coche coche3 = new Coche();
        //coche3.setPotencia(130);

        //coche3.arrancar();
        //coche3.acelerar();
        //coche3.frenar();
        //coche3.parar();

        //System.out.println(coche);
        //System.out.println(coche2);
        //System.out.println(coche3);

        //Contador contador = new Contador();
        //contador.setCuenta(0);

        //contador.incrementar(5);
        //contador.getCuenta();
        //contador.setCuenta();

        //contador.decrementar(2);

    }



}
