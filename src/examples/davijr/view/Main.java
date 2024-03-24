package examples.davijr.view;

import examples.davijr.conta.Conta;
import examples.davijr.factory.ContaFactory;
import examples.davijr.util.util;

public class Main {
    public static void main(String[] args) {
        Conta CC = ContaFactory.getInstance(util.TipoClienteEnum.CONTA_CORRENTE);
        Conta CP = ContaFactory.getInstance(util.TipoClienteEnum.CONTA_POUPANCA);

        System.out.println(CC);
        System.out.println(CP);

    }
}