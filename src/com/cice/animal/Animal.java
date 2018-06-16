package com.cice.animal;

public class Animal {

    private String raza;
    private int numeroPatas;

    public Animal(){}

    public Animal(String animal){
        this.raza = animal;
    }

    public Animal(String raza, int numeroPatas){
        super();
        this.raza = raza;
        this.numeroPatas = numeroPatas;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public int getNumeroPatas(){
        return numeroPatas;
    }



}
