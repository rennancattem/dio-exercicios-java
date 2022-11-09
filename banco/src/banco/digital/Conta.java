package banco.digital;

public abstract class Conta{

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldoParcial;


    //Metodo construtor para Conta corrente e poupança
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        imprimirInfosComuns();
    }


    public void sacar(double valor){
        saldoParcial = this.cliente.getSaldo() - valor;
        this.cliente.setSaldo(saldoParcial);
    }


    public void depositar(double valor){
        saldoParcial = this.cliente.getSaldo() + valor;
        this.cliente.setSaldo(saldoParcial);
    }


    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        if(this.cliente.getTipoConta() == 1)
            System.out.println(String.format("Tipo: Conta Corrente"));
        else
            System.out.println(String.format("Tipo: Conta Poupança"));
        System.out.println(String.format("Saldo: %.2f", this.cliente.getSaldo()));
    }

    public abstract void imprimirExtrato();

}
