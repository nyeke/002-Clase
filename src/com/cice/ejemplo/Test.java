package com.cice.ejemplo;

public class Test {

    private int entero;
    private double numeroReal;
    private boolean esCierto;
    private char caracter;
    private String nombre;

    /**
     * Consutructor para inicializar entero
     * @param numeroEntero
     */
    public Test(int numeroEntero){
        entero = numeroEntero;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    @Override
    public String toString() {
        return "Test{" +
                "entero=" + entero +
                ", numeroReal=" + numeroReal +
                ", esCierto=" + esCierto +
                ", caracter=" + caracter +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
