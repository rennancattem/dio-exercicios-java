import java.util.*;

/**
 * Utilizando listas, faça um programa que faça 5 perguntas para uma
 * pessoa sobre um crime. As perguntas são:
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima?"
 * 5. "Já trabalhou com a vítima?"
 * Se a pessoa responder:
 * positivamente a 2 questões ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "Cumplice"
 * e 5 como "Assassina".
 * Caso contrario, ela será classificado como "Inocente".
 */

public class Crime {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        List<Integer> respostas = new ArrayList<Integer>();
        int respostasPositivas = 0;


        // Recebendo as respostas do questiorário
        System.out.println("**1 para SIM ou 2 para NÃO**");
        System.out.println("1. Telefonou para a vítima?: ");
        respostas.add(scan.nextInt());
        System.out.println("2. Esteve no local do crime?: ");
        respostas.add(scan.nextInt());
        System.out.println("3. Mora perto da vítima?: ");
        respostas.add(scan.nextInt());
        System.out.println("4. Devia para a vítima?: ");
        respostas.add(scan.nextInt());
        System.out.println("5. Já trabalhou com a vítima?: ");
        respostas.add(scan.nextInt());
        // Contabilizando as respostas positivas
        for(int i=0; i<5; i++){
            if(respostas.get(i) == 1) respostasPositivas += 1;
        }
        // Classificando as respostas
        if(respostasPositivas == 2)
            System.out.println("\nCLASSIFICAÇÃO: Suspeita");
        else if(respostasPositivas >2 && respostasPositivas < 5)
            System.out.println("\nCLASSIFICAÇÃO: Cumplice");
        else if(respostasPositivas == 5)
            System.out.println("\nCLASSIFICAÇÃO: Assassina");
        else
            System.out.println("\nCLASSIFICAÇÃO: Inocente");
    }
}
