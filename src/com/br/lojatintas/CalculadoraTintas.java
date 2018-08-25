package com.br.lojatintas;

public class CalculadoraTintas {
    Tinta tinta;

    public CalculadoraTintas() {
        tinta = new Tinta();
    }

    public int calcularQtdeLatasTintas(int metroQuadradoPintar) {
        double litros = metroQuadradoPintar / tinta.getRendimentoPorL();

        return (int) Math.ceil(litros / tinta.getCapacidadeLata()); // Arredonda para cima
    }

    public double calcularPreco(int qtdeLatasTinta) {
        return qtdeLatasTinta * tinta.getPreco();
    }
}
