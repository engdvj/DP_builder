package factory;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import util.util.TipoClienteEnum;

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
