package view;

import conta.Conta;
import conta.ContaCorrente;
import factory.ContaFactory;
import util.util;

public class Main {
    public static void main(String[] args) {
        Conta CC = ContaFactory.getInstance(util.TipoClienteEnum.CONTA_CORRENTE);
        Conta CP = ContaFactory.getInstance(util.TipoClienteEnum.CONTA_POUPANCA);

        System.out.println(CC);
        System.out.println(CP);

    }
}