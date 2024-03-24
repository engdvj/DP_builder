package examples.davijr.factory;

import examples.davijr.conta.Conta;
import examples.davijr.conta.ContaCorrente;
import examples.davijr.conta.ContaPoupanca;
import examples.davijr.util.util.TipoClienteEnum;

public class ContaFactory {

    public static Conta getInstance(TipoClienteEnum tipoClienteEnum) {
        switch (tipoClienteEnum){
            case CONTA_CORRENTE:
                Conta CC = new ContaCorrente();
                CC.tipo("Corrente");
                return CC;
            case CONTA_POUPANCA:
                Conta CP = new ContaPoupanca();
                CP.tipo("Poupança");
                return CP;
            default:
                return new ContaCorrente();
        }
    }
}
