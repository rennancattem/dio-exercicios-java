import java.awt.font.NumericShaper;
import java.text.CollationElementIterator;
import java.text.NumberFormat;
import java.util.*;

/**
 * Dada a população estimada de laguns estados do NE brasileiro, faça:
 * Estado = PE - População - 9.616.621
 * Estado = AL - População - 3.351.543
 * Estado = CE - População - 9.187.103
 * Estado = RN - População - 3.534.265
 * Crie um dicionário e relacione os estados e suas populações;
 * Substitua a população do estado do RN por 3.534.165;
 * Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277
 * Exiba a população PE;
 * Exiba todos os estados e suas populações na ordem que foi informado;
 * Exiba os estados e suas populações em ordem alfabética;
 * Exiba o estado com a menor população e sua quantidade;
 * Exiba o estado com a maior população e sua quantidade;
 * Exiba a soma da população desses estados;
 * Exiba a média da população deste dicionário de estados;
 * Remova os estados com a população menor que 4.000.000;
 * Apague o dicionário de estados;
 * Confira se o dicionário está vazio.
 */
public class Principal {
    public static void main(String[] args) {

        NumberFormat inteiro = NumberFormat.getInstance();

        // Criando o dicionário de estados e suas respectivas populações
        Map<String, Integer> estados = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("\n**\tEstados e População\t**");
        System.out.println(estados);

        // Substituindo população do RN
        estados.put("RN", 3534165);

        // Verificando se o estado PB consta no dicionário, caso não exista será inserido
        if(!estados.containsKey("PB")) {
            estados.put("PB", 4039277);
        }

        // Exibindo a população de PE
        System.out.println("\nPopulação PE = " + estados.get("PE"));

        // Exibir na ordem que foi inserido
        System.out.println("\n**\tEstados e População\t**");
        System.out.println(estados);

        // Exibindo os estados e população em ordem alfabética
        Map<String, Integer> estadosOrdemAlfabetica = new TreeMap<>();
        estadosOrdemAlfabetica.putAll(estados);

        System.out.println("\n**\tEstados e População em Ordem Alfabética\t**");
        System.out.println(estadosOrdemAlfabetica);

        // Exibir estado com menor população
        System.out.println("\n**\tEstado com Menor População\t**");
        Integer menorPopulacao = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String menorEstado = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)){
                menorEstado = entry.getKey();
                System.out.println("Estado: " + menorEstado + " - População: " + menorPopulacao);
            }
        }

        // Exibir estado com menor população
        System.out.println("\n**\tEstado com Maior População\t**");
        Integer maiorPopulacao = Collections.max(estados.values());
        entries = estados.entrySet();
        String maiorEstado = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(maiorPopulacao)){
                maiorEstado = entry.getKey();
                System.out.println("Estado: " + maiorEstado + " - População: " + maiorPopulacao);
            }
        }

        // Exibindo a soma das populações
        Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
    }

}
