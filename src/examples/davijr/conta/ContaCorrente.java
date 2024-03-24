package examples.davijr.conta;

public class ContaCorrente extends Conta{
    private ContaCorrente() {
        super();
    }
    public static ContaCorrente build() {
        return new ContaCorrente();
    }
    @Override
    public void sacar() {}

    @Override
    public void depositar() {}

}

