package banco.digital;

import java.util.*;

public class Menu{
    Scanner scan = new Scanner(System.in);
    private String nome;
    List<Conta> contas = new ArrayList<>();
    Double valor = 0.00;
    Iterator<Conta> iterator;
    int tipoContaParcial = 0;
    Cliente next;
    Conta conta;
    int contaDestino;
    int numeroConta;
    //Cliente cliente = new Cliente();

    Banco banco = new Banco();

    public void Principal() {
        System.out.println("\n### MENU PRINCIPAL ###");
        System.out.println("1 - Criar nova Conta Corrente");
        System.out.println("2 - Criar nova Conta Poupança");
        System.out.println("3 - Acessar Conta");
        System.out.println("4 - Listar Contas");
        System.out.println("9 - Sair");
    }

    public void AcessarConta() {
        System.out.println("\n### MENU CONTA ###");
        System.out.println("5 - Depósito");
        System.out.println("6 - Saque");
        System.out.println("7 - Transferência");
        System.out.println("8 - Saldo");
        System.out.println("9 - Sair");
    }

    public void Opcao (int opcao){
        switch (opcao){
            case 1:
                System.out.println("\n### CRIAR NOVA CONTA CORRENTE ###");
                CriarConta(1);
                break;
            case 2:
                System.out.println("\n### CRIAR NOVA CONTA POUPANÇA ###");
                CriarConta(2);
                break;
            case 3:
                ListarConta();
                break;
            case 4:
                ListarContas();
                break;
            case 5:
                System.out.println("\nInforme o valor para depósito: ");
                valor = scan.nextDouble();
                conta.atualizaContas(contas);
                conta.depositar(numeroConta, valor);
                break;
            case 6:
                System.out.println("\nInforme o valor para saque: ");
                valor = scan.nextDouble();
                conta.atualizaContas(contas);
                conta.sacar(numeroConta, valor);
                break;
            case 7:
                System.out.println("\nInforme o valor para transferência: ");
                valor = scan.nextDouble();
                System.out.println("\nQuem é o destinatário da transferência: ");
                nome = scan.next();
                iterator = contas.iterator();
                while (iterator.hasNext()) {
                    conta = iterator.next();
                    next = conta.getCliente();
                    if(next.getNome().indexOf(nome) == 0) {
                        contaDestino = contas.indexOf(conta);
                    }
                }
                conta.atualizaContas(contas);
                conta.transferir(numeroConta, valor, contaDestino);
                break;
            case 8:
                conta.atualizaContas(contas);
                conta.saldo(numeroConta);
                break;
            case 9:
                System.out.println("\nSISTEMA FINALIZADO!");
                break;
            default:
                System.out.println("Opção inválida. Informe a opção desejada novamente!");
        }
    }

    public void CriarConta(int tipoConta){
        System.out.println("Informe o nome do Cliente: ");
        nome = scan.next();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);

        if (tipoConta == 1){
            cliente.setTipoConta(tipoConta);
            Conta conta = new ContaCorrente(cliente);
            contas.add(conta);
            banco.setContas(contas);
        }else{
            cliente.setTipoConta(tipoConta);
            Conta conta = new ContaPoupanca(cliente);
            contas.add(conta);
            banco.setContas(contas);
        }
    }

    public void ListarContas(){
        System.out.println(banco.getContas());
    }

    public void ListarConta(){
        System.out.println("Informe o nome do TITULAR: ");
        String nome = scan.next();
        iterator = contas.iterator();
        while (iterator.hasNext()){
            conta = iterator.next();
            next = conta.getCliente();

            if(next.getNome().indexOf(nome) == 0) {
                numeroConta = contas.indexOf(conta);
                AcessarConta();
            }
        }
    }
}
