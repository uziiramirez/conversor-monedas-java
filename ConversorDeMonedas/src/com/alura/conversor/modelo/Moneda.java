package com.alura.conversor.modelo;

public class Moneda package com.alura.conversor.modelo;

public class Moneda {

    private String nombre;
    private double valor;

    public Moneda(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
}
