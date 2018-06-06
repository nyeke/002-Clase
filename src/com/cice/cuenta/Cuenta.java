package com.cice.cuenta;

public class Cuenta {

    private String cuenta;
    private double balance;
    private int importe;

    //Metodos

    public void reintegro(double importe){
        balance=-importe;
        System.out.println("Reintegro de " + importe + "€ relizado");
    }

    public void ingreso(double importe){
        balance=+importe;
        System.out.println("Ingreso de " + importe + "€ realizado");
    }

    public void transferencia(double importe){
        balance=-importe;
        System.out.println("Transferencia de " + importe + "€ realizada");
    }

    //Get Set

    public void setBalance(double balanceDado){
        balance=balanceDado;
    }

    public double getBalance(){
        return balance;
    }

    public void setCuenta(String cuentaDada){
        cuenta = cuentaDada;
    }

    public String getCuenta(){
        return cuenta;
    }
}
