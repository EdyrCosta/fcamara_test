package com.br.matematica;

import java.util.Scanner;

public class AppRetangulo {
    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o comprimento do retângulo: ");
        int comprimento = scanner.nextInt();
        System.out.println("Insira a largura do retângulo: ");
        int largura = scanner.nextInt();

        Retangulo retangulo = new Retangulo(comprimento, largura);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        int[] ladosRetangulo = retangulo.retornarValorLados();
        System.out.println("Comprimento: " + ladosRetangulo[0]);
        System.out.println("Largura: " + ladosRetangulo[1]);

        System.out.println("Invertendo valores dos lados");
        retangulo.mudarValorLados();
        ladosRetangulo = retangulo.retornarValorLados();
        System.out.println("Comprimento: " + ladosRetangulo[0]);
        System.out.println("Largura: " + ladosRetangulo[1]);
    }
}
