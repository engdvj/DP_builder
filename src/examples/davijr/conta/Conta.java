package examples.davijr.conta;

public abstract class Conta implements ContaBancaria{
    private int agencia;
    private int numeroConta;
    private double saldo;
    private String cliente;
    private String tipo;

    public Conta agencia(int agencia) {
        this.agencia = agencia;
        return this;
    }

    public Conta numeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public Conta saldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public Conta cliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public Conta tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    protected Conta (){}

    @Override
    public String toString() {
        return "Conta{" +
               "agencia=" + agencia +
               ", numeroConta=" + numeroConta +
               ", saldo=" + saldo +
               ", cliente='" + cliente + '\'' +
               ", tipo='" + tipo + '\'' +
               '}';
    }
}
