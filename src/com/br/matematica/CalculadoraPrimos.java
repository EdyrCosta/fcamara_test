package com.br.matematica;

public class CalculadoraPrimos {
    public void mostrarNumPrimosIntervalo(int numInicial, int numFinal) {
        // Baseado neste algoritmo
        // https://www.vivaolinux.com.br/script/Saber-se-um-numero-e-primo-(algoritmo-super-simples)

        for (int i = numInicial; i < numFinal; i++) { // Percorre o intervalo
            int numDivisoesPerfeitas = 0;

            for (int o = 1; o <= i; o++) { // Vai do 1 ao número atual
                if (i % o == 0) { // Divisão perfeita
                    numDivisoesPerfeitas++;
                }
            }

            if (numDivisoesPerfeitas == 2) { // É primo, pois foi divisivel apenas por 1 e por ele mesmo
                System.out.print(i + " ");
            }
        }

    }
}
