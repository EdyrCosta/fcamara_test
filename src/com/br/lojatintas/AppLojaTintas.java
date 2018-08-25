package com.br.lojatintas;

import java.util.Scanner;

public class AppLojaTintas {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        CalculadoraTintas calc = new CalculadoraTintas();

        System.out.println("Insira quantos metros quadrados serão pintados: ");
        int metros = scanner.nextInt();
        System.out.println("Calculando...");

        int qtdeLatas = calc.calcularQtdeLatasTintas(metros);
        double preco = calc.calcularPreco(qtdeLatas);
        System.out.println("Você precisará de " + qtdeLatas + " latas de tinta. O que te custará R$ " + preco);
    }
}
