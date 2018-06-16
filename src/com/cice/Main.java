package com.cice;

import com.cice.animal.Animal;
import com.cice.coches.Coche;
import com.cice.cuenta.Contador;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Animal("Podenco");
        Animal animal2 = new Animal("Carlino",5);

        System.out.println(animal.getRaza());
        System.out.println(animal1.getRaza());
        System.out.print(animal2.getRaza());
        System.out.print(" con " + animal2.getNumeroPatas() + " patas");

        int importe = 0;

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
