package banco.digital;

import java.util.*;

/**
 * Um banco oferece aos seus clientes dois tipos de
 * contas (corrente e poupança), as quais possuem as
 * funcionalidades de depósito, saque e transferência
 * (entre contas da própria instituição).
 *
 *
 */

public class Banco {

    private String nome;
    List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setContas(int i, Conta conta, Double valor){

        contas.set(i,conta).getCliente().setSaldo(valor);

    }


}
