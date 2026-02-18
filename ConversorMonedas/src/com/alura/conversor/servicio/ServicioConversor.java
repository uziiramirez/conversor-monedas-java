package com.alura.conversor.servicio;

import com.alura.conversor.modelo.RespuestaAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioConversor {

    private final String apiKey = "d6cb43c7c6cf22fdd9eab75b";

    public RespuestaAPI obtenerTasas(String base) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/"
                + apiKey + "/latest/" + base;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        return gson.fromJson(response.body(), RespuestaAPI.class);
    }
}

