package banco.digital;

import java.util.List;

public interface IConta {

    void sacar(int contato, double valor);

    void depositar(int contato, double valor);

    void transferir(int contaRemetente, double valor, int contaDestino);

    void saldo(int numeroConta);

    void imprimirExtrato();

}
