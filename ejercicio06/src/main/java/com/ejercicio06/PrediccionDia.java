package com.ejercicio06;

import java.time.LocalDate;

public class PrediccionDia {

    private LocalDate fecha;
    private int probabilidadPrecipitacion;
    private int temperaturaMinima;
    private int temperaturaMaxima;
    private int nivelUV;

    public PrediccionDia(LocalDate fecha, int probabilidadPrecipitacion,
                         int temperaturaMinima, int temperaturaMaxima, int nivelUV) {
        this.fecha = fecha;
        this.probabilidadPrecipitacion = probabilidadPrecipitacion;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.nivelUV = nivelUV;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getProbabilidadPrecipitacion() {
        return probabilidadPrecipitacion;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public int getNivelUV() {
        return nivelUV;
    }

    public String getImagenUrl() {
        if (probabilidadPrecipitacion < 25)
            return "https://www.aemet.es/imagenes/png/estado_cielo/11_g.png";
        else if (probabilidadPrecipitacion < 50)
            return "https://www.aemet.es/imagenes/png/estado_cielo/12_g.png";
        else if (probabilidadPrecipitacion < 75)
            return "https://www.aemet.es/imagenes/png/estado_cielo/14_g.png";
        else
            return "https://www.aemet.es/imagenes/png/estado_cielo/25_g.png";
    }
}