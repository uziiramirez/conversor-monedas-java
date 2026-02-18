package com.alura.conversor.principal;

import com.alura.conversor.modelo.RespuestaAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PruebaAPI {

    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = "d6cb43c7c6cf22fdd9eab75b";
        String direccion = "https://v6.exchangerate-api.com/v6/"
                + apiKey + "/latest/USD";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        RespuestaAPI respuesta = gson.fromJson(json, RespuestaAPI.class);

        System.out.println("Base: " + respuesta.base_code);
        System.out.println("Tasa USD a ARS: " + respuesta.conversion_rates.get("ARS"));
    }
}

