package com.cice;

import com.cice.coches.Coche;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.setPotencia(20);

        coche.arrancar();
        coche.acelerar();
        coche.frenar();
        coche.parar();

        Coche coche2 = new Coche();
        coche2.setPotencia(80);

        coche2.arrancar();
        coche2.acelerar();
        coche2.frenar();
        coche2.parar();

        Coche coche3 = new Coche();
        coche3.setPotencia(130);

        coche3.arrancar();
        coche3.acelerar();
        coche3.frenar();
        coche3.parar();

        //System.out.println(coche);
        //System.out.println(coche2);
        //System.out.println(coche3);

    }



}
