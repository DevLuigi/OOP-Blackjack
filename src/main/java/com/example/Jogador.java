package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private int pontos;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Carta carta) {
        cartas.add(carta);
        this.setPontos(this.getPontos() + carta.getNumero());
    }

    public void parar() {
        this.setParou(true);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public int getPontos() {
        return pontos;
    }

    public boolean parou() {
        return parou;
    }

    public void setParou(boolean parou) {
        this.parou = parou;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
