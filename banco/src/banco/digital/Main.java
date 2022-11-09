package banco.digital;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();


        //MENU PRINCIPAL
        do {
            menu.Principal();
            System.out.println("\nEscolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n### CRIAR NOVA CONTA ###");
                    menu.CriarConta(1);
                    break;
                case 2:

                    break;
                case 9:
                    System.out.println("\nSISTEMA FINALIZADO!");
                    break;
                default:
                    System.out.println("Opção inválida. Informe a opção desejada novamente!");
            }
        }while(opcao != 9);
/*
        Cliente rennan = new Cliente();
        Cliente cattem = new Cliente();
        rennan.setNome("Rennan");
        cattem.setNome("Cattem");

        Conta cc = new ContaCorrente(rennan);
        Conta poupanca = new ContaPoupanca(cattem);

        cc.depositar(100);
        cc.transferir(25, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
 */
    }
}
