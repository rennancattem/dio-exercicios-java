package banco.digital;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        Conta conta;
        double valor;

        //MENU PRINCIPAL
        do {
            if (opcao != 3) menu.Principal();
            System.out.println("\nEscolha uma opção: ");
            opcao = scan.nextInt();

            menu.Opcao(opcao);

        }while(opcao != 9);

    }
}
