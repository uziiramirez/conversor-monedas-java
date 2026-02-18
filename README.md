#  Conversor de Monedas - Java

Proyecto desarrollado como parte del Challenge de Alura Latam.

##  Descripción

Aplicación en consola desarrollada en Java que permite convertir monedas en tiempo real utilizando una API externa de tasas de cambio.

El sistema consume datos desde una API REST, procesa la respuesta en formato JSON y permite realizar conversiones entre distintas monedas mediante un menú interactivo.

##  Funcionalidades

- Conversión de:
  - USD ➝ ARS
  - ARS ➝ USD
  - USD ➝ BRL
  - BRL ➝ USD
  - USD ➝ COP
  - COP ➝ USD
- Consumo de API REST
- Procesamiento de JSON con Gson
- Menú interactivo en consola
- Estructura organizada por paquetes
- Uso de HttpClient

## 🛠 Tecnologías utilizadas

- Java 17
- HttpClient
- Gson
- IntelliJ IDEA
- Git & GitHub

## 📂 Estructura del proyecto

com.alura.conversor
│
├── principal
│ ├── Main.java
│ └── PruebaAPI.java
│
├── servicio
│ ├── ServicioConversor.java
│ └── Conversor.java
│
└── modelo
└── RespuestaAPI.java

## ▶ Cómo ejecutar

1. Clonar el repositorio
2. Abrir en IntelliJ IDEA
3. Ejecutar la clase `Main`

## 👨‍💻 Autor

Desarrollado por Uziel Ramírez
