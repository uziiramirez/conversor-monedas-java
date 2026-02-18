package com.alura.conversor.principal;

import com.alura.conversor.servicio.ConversorMoneda;

public class Principal {
    public static void main(String[] args) {
        ConversorMoneda conversor = new ConversorMoneda();
        conversor.iniciar();
    }
}
