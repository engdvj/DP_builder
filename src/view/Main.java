package view;

import conta.Conta;
import conta.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Conta CC = ContaCorrente.build()
                .saldo(500)
                .numeroConta(123456)
                .agencia(1)
                .cliente("Davi");

        System.out.println(CC);
    }
}