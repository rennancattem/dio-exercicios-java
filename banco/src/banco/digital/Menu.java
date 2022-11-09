package banco.digital;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Cliente cliente = new Cliente();
    private String nome;
    private Banco banco = new Banco();

    public void Principal() {
        System.out.println("\n### MENU PRINCIPAL ###");
        System.out.println("1 - Criar nova Conta Corrente");
        System.out.println("2 - Criar nova Conta Poupança");
        System.out.println("3 - Acessar Conta");
        System.out.println("8 - Listar Contas");
        System.out.println("9 - Sair");
    }

    public void CorrentePoupanca() {
        System.out.println("\n### MENU CONTA ###");
        System.out.println("4 - Depísito");
        System.out.println("5 - Saque");
        System.out.println("6 - Transferência");
        System.out.println("7 - Saldo");
    }

    public void CriarConta(Integer tipoConta){
        System.out.println("Informe o nome do Cliente: ");
        nome = scan.next();
        cliente.setNome(nome);
        cliente.setTipoConta(tipoConta);
        if (tipoConta == 1) {
            Conta conta = new ContaCorrente(cliente);
            banco.setContas(conta);
        } else {
            Conta conta = new ContaPoupanca(cliente);
            banco.setContas(conta);
        }

        System.out.println("Conta criada com sucesso!");
    }
}
