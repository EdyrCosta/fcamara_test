package com.br;

import com.br.banco.ContaCorrente;
import com.br.funcionario.Funcionario;
import com.br.lojatintas.AppLojaTintas;
import com.br.matematica.AppRetangulo;
import com.br.matematica.CalculadoraPrimos;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        System.out.println(f.calcularSalarioAno((short) 2004));
        System.out.println(f.calcularSalarioAno((short) 2005));
        System.out.println(f.calcularSalarioAno((short) 2006));
        System.out.println(f.calcularSalarioAno((short) 2018));

        CalculadoraPrimos cp = new CalculadoraPrimos();
        cp.mostrarNumPrimosIntervalo(2, 100);

        AppLojaTintas appLojaTintas = new AppLojaTintas();
        appLojaTintas.main();

        ContaCorrente cc = new ContaCorrente(323232, "Edyr");
        cc.deposito(2000);
        cc.saque(500);

        AppRetangulo appRetangulo = new AppRetangulo();
        appRetangulo.main();
    }
}
