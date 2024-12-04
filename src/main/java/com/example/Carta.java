package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;
    private String DEFAULT_IMAGE_PATH = "classic-cards/";

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath() {
        return DEFAULT_IMAGE_PATH + this.numero + this.naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
