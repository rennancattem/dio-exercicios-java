import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Faça um programa que receba a temperatura média dos 6
 * primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
 * mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */

class Temperatura {

    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        List<String> mes = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
        int meses = 6;
        double media = 0;
        //Recebendo os 6 valores de temperatura
        for(int i=1; i<=meses; i++){
            System.out.println("\nInforme a temperatura do mês "+i+": ");
            temperaturas.add(scan.nextDouble());
            //Somando as temperaturas armazenadas
            media = media + temperaturas.get(i-1);
        }
        //Calculando a média das temperaturas armazenadas
        media = media / meses;
        System.out.println("\nMédia semestral das temperaturas: "+media);
        //Imprimindo os valores de temperaturas acima da média calculada
        for(int y=0; y<meses; y++){
            if (temperaturas.get(y) > media){
                System.out.println(mes.get(y) + ": " + temperaturas.get(y));
            }
        }
    }
}
