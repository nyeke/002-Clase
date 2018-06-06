package com.cice.coches;

public class Coche {

    //Atributos de la case suelen ser pivados

    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;

    public void arrancar(){
        System.out.println("Arrancando...");
    }

    public void acelerar(){
        String cadena = "Brum";
        int letras = potencia/10;

        for (int i = 0; i<= letras; i++){
            cadena+="m";
        }

        System.out.println(cadena);
    }

    public void frenar(){
        System.out.println("Frenando..");
    }

    public void parar(){
        System.out.println("Apagado");
    }

    public void setPotencia(int potenciaDada){
        if(potenciaDada>0){
            potencia = potenciaDada;
        }
    }


}
