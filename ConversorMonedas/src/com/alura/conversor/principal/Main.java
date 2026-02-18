package com.alura.conversor.principal;

import com.alura.conversor.modelo.RespuestaAPI;
import com.alura.conversor.servicio.Conversor;
import com.alura.conversor.servicio.ServicioConversor;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ServicioConversor servicio = new ServicioConversor();
        Conversor conversor = new Conversor();

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("""
                    
                    ***********************************
                    Sea bienvenido/a al Conversor de Moneda
                    
                    1) Dólar => Peso Argentino
                    2) Peso Argentino => Dólar
                    3) Dólar => Real Brasileño
                    4) Real Brasileño => Dólar
                    5) Dólar => Peso Colombiano
                    6) Peso Colombiano => Dólar
                    7) Salir
                    Elija una opción válida:
                    ***********************************
                    """);

            opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor.");
                break;
            }

            System.out.println("Ingrese el valor que desea convertir:");
            double monto = scanner.nextDouble();

            RespuestaAPI respuesta = servicio.obtenerTasas("USD");

            double tasa = 0;
            String monedaDestino = "";

            switch (opcion) {
                case 1:
                    tasa = respuesta.conversion_rates.get("ARS");
                    monedaDestino = "ARS";
                    break;
                case 2:
                    tasa = 1 / respuesta.conversion_rates.get("ARS");
                    monedaDestino = "USD";
                    break;
                case 3:
                    tasa = respuesta.conversion_rates.get("BRL");
                    monedaDestino = "BRL";
                    break;
                case 4:
                    tasa = 1 / respuesta.conversion_rates.get("BRL");
                    monedaDestino = "USD";
                    break;
                case 5:
                    tasa = respuesta.conversion_rates.get("COP");
                    monedaDestino = "COP";
                    break;
                case 6:
                    tasa = 1 / respuesta.conversion_rates.get("COP");
                    monedaDestino = "USD";
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            double resultado = conversor.convertir(monto, tasa);

            System.out.println("Resultado: " + resultado + " " + monedaDestino);
        }

        scanner.close();
    }
}

