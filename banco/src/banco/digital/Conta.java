package banco.digital;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco = new Banco();
    List<Conta> contas = new ArrayList<>();

    //Metodo construtor para Conta corrente e poupança
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        imprimirInfosComuns();
    }

    public void atualizaContas(List<Conta> contasRecebidas) {
        this.contas = contasRecebidas;
        banco.setContas(contas);
    }

    @Override
    public void sacar(int contato, double valor){
        saldo = contas.get(contato).getCliente().getSaldo();
        saldo -= valor;
        contas.set(contato, contas.get(contato)).saldo = saldo;
        banco.setContas(contato, contas.get(contato), saldo);
    }

    @Override
    public void depositar(int contato, double valor){
        saldo = contas.get(contato).getCliente().getSaldo();
        saldo += valor;
        contas.set(contato, contas.get(contato)).saldo = saldo;
        banco.setContas(contato, contas.get(contato), saldo);
    }

    @Override
    public void transferir(int contaRemetente, double valor, int contaDestino){
        this.sacar(contaRemetente, valor);
        this.depositar(contaDestino, valor);
    }

    public void saldo(int numeroConta){
        this.numero = contas.get(numeroConta).getNumero();
        this.cliente = contas.get(numeroConta).getCliente();
        imprimirInfosComuns();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.cliente.getSaldo());
    }

    public abstract void imprimirExtrato();

    @Override
    public String toString() {
        return "\n{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + cliente.getSaldo() +
                ", cliente=" + cliente.getNome() +
                ", tipo= " + cliente.getTipoConta() +
                '}';
    }
}
