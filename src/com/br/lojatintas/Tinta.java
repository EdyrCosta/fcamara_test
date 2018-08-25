package com.br.lojatintas;

public class Tinta {
    private final float RENDIMENTO_POR_L = 3.0f; // metros
    private final float CAPACIDADE_LATA = 18.0f; // litros
    private final double PRECO = 80.0d; // reais

    public float getRendimentoPorL() {
        return RENDIMENTO_POR_L;
    }

    public float getCapacidadeLata() {
        return CAPACIDADE_LATA;
    }

    public double getPreco() {
        return PRECO;
    }
}
