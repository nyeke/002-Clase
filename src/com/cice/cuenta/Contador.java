package com.cice.cuenta;

public class Contador {

    private int cuenta;

    //Metodos

    public void incrementar(int importe){
        cuenta=+importe;
        System.out.println("El resultado de sumar " + importe + " es: " + cuenta);
    }


    public void decrementar(int importe){
        cuenta=-importe;
        System.out.println("El resultado de restar " + importe + " es: " + cuenta);
    }

    //Get Set

    public void setCuenta(int cuentaDada){
        cuenta=cuentaDada;
    }

    public int getCuenta(){
        return cuenta;
    }


}
