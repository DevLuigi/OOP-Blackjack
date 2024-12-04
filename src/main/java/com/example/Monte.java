package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        for (Naipe naipe : Naipe.values()) {
            criarCartasNaipe(naipe);
        }
    }

    private void criarCartasNaipe(Naipe naipe) {
        for (int i = 1; i <= 13; i++) {
            cartas.add(new Carta(i, naipe));
        }
    }

    public void embaralhar() {
        System.out.println("Embaralhar");
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        cartas.forEach( (c) -> System.out.println(c.imagePath()) );
        return cartas.remove(0);
    }
}
