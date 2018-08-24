package com.br.funcionario;

public class Funcionario {
    private final short ANO_CONTRATADO              = 2005;
    private final double SALARIO_INICIAL            = 1000.0d;
    private final double PORC_INICIAL_AUMENTO       = 1.5d;

    public double calcularSalarioAno(short ano) {
        // 2005 - R$ 1.000,00
        // 2006 - R$ 1.015,00 - 1,5%
        // 2007 - R$ 1.037,83 - 3%
        // 2008 - R$ 1.090,35 - 6%
        if (ano < ANO_CONTRATADO) {
            System.out.println("O Ano não pode ser inferior a data de Contratação");
            return 0;
        } else if (ano == ANO_CONTRATADO) {
            return SALARIO_INICIAL;
        }

        // Utiliza o conceito de P.G. para calcular o salário.
        // An = a1 . q^(n-1)
        // a1 = 1,5%
        // q = 2
        // n = ano - ANO_CONTRATADO
        short diff = (short) (ano - ANO_CONTRATADO);
        double porcentagem_aumento = PORC_INICIAL_AUMENTO * Math.pow(2, diff - 1);

        return SALARIO_INICIAL + ((SALARIO_INICIAL * porcentagem_aumento) / 100d);
    }
}
