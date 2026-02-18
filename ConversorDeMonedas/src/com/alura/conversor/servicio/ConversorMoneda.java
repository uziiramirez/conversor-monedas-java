package com.alura.conversor.servicio;

public class ConversorMoneda package com.alura.conversor.servicio;

import com.alura.conversor.modelo.Moneda;

import java.util.Scanner;

public class ConversorMoneda {

    public void iniciar() {
        Scanner lectura = new Scanner(System.in);

        Moneda dolar = new Moneda("Dólar", 1000);
        Moneda euro = new Moneda("Euro", 1100);

        System.out.println("=== Conversor de Monedas ===");
        System.out.print("Ingrese monto en pesos: ");
        double monto = lectura.nextDouble();

        System.out.println("1 - Convertir a Dólar");
        System.out.println("2 - Convertir a Euro");
        System.out.print("Seleccione opción: ");
        int opcion = lectura.nextInt();

        if (opcion == 1) {
            convertir(monto, dolar);
        } else if (opcion == 2) {
            convertir(monto, euro);
        } else {
            System.out.println("Opción inválida");
        }

        lectura.close();
    }

    private void convertir(double monto, Moneda moneda) {
        double resultado = monto / moneda.getValor();
        System.out.println("Resultado: " + resultado + " " + moneda.getNombre());
    }
}
}
