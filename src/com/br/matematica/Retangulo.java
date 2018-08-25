package com.br.matematica;

public class Retangulo {
    private int comprimento;
    private int largura;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarValorLados() {
        int aux = comprimento;
        comprimento = largura;
        largura = aux;
    }

    public int[] retornarValorLados() {
        return new int[] {comprimento, largura};
    }

    public int calcularArea() {
        return comprimento * largura;
    }

    public int calcularPerimetro() {
        return (comprimento * 2) + (largura * 2);
    }
}
