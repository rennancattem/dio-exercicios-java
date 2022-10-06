import java.util.*;

/**
 * Faça um programa que simule um lançamento de dados.
 * Lance o dado 100 vezes e armazene.
 * Depois, mostre quantas vezes cada valor foi inserido.
 */


public class Desafio {
    public static void main(String[] args) {
        // Iniciando gerador de números aleatórios
        Random gerador = new Random();
        // Inicializando a List
        List<Integer> valor = new ArrayList<>();
        // armcazenando os dados
        for (int i=0; i < 100; i++){
            valor.add(gerador.nextInt(100)); // limitando os numeros gerados aleatórios a 100
        }
        // Ordenando a lista do menor ao maior
        Collections.sort(valor);
        Iterator<Integer> iterator = valor.iterator();
        // declarando variáveis auziliares
        int contador = 1;
        int i = 1;
        int anterior = -1;
        // imprimindo a lista
        System.out.println(valor);


        while(iterator.hasNext()){
            Integer dado = iterator.next();
            // verificando se o próximo numero é igual ao atual armazenado
            if(dado == anterior) {
                    contador++;
            }else if (contador > 1) { // caso o contato ainda for 1 significa que o proximo numero é diferente
                System.out.println("Foi armazenado " + contador + "x o numero " + anterior);
                contador = 1; // zerando o contador
            }else if(anterior != -1){ // verificando o primeiro numero da lista
                System.out.println("Foi armazenado " + contador + "x o numero " + anterior);
            }

            anterior = dado; // fazendo o armazenamento na variável auxiliar do numero desejado na verificação
            i++;
        }
        System.out.println("Ultimo armazenado " + contador + "x o numero " + anterior);
    }
}

