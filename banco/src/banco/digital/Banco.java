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
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {return contas;}

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
