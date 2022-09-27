import java.util.*;

import static java.util.Collections.reverse;

/**
 * Crie um conjunto contendo as cores do arco-íris e:
 * A. Exiba todas as cores uma abaixo da outra
 * B. A quantidade de cores que o arco-íris tem
 * C. Exiba as cores em ordem alfabética
 * D. Exiba as cores na ordem inversa da que foi informada
 * E. Exiba todas as cores que começam com a letra "v"
 * F. Remova todas as cores que não começam com a letra "v"
 * G. Limpe o conjunto
 * H. Confira se o conjunto está vazio
 */
public class ArcoIris {
    public static void main(String[] args) {
        // Criando o Set de Cores do Arco Íris
        Set<String> cores = new HashSet<>(){{
            add(new String("Vermelha"));
            add(new String("Laranja"));
            add(new String("Amarela"));
            add(new String("Verde"));
            add(new String("Azul"));
            add(new String("Azul-Escuro"));
            add(new String("Violeta"));
        }};
        // Exibindo uma abaixo da outra
        for (String cor: cores) System.out.println(cor.toString());

        // Contabilizando as cores
        int quantidadeCores = 0;
        for (String cor: cores) quantidadeCores += 1;
        // Imprimindo a quantidade de cores
        System.out.println("\nQuantidade Cores: " + quantidadeCores);

        // Exibindo cores em ordem alfabética
        Set<String> ordemAlfabetica = new TreeSet<>(cores);
        System.out.println("\n** Lista em Ordem Alfabética **");
        System.out.println(ordemAlfabetica);

        // Exibindo lista na ordem inversa da informada
        List<String> ordemInversa = new ArrayList<String>(); // Criando nova lista
        ordemInversa.addAll(cores); // Inserindo as cores da SET LISTA na nova lista
        reverse(ordemInversa); // Invertendo a lista (pois no Set List não é possivel usar este método)
        System.out.println("\n** Lista Original em Ordem Inversa **");
        System.out.println(ordemInversa);

        // Exibindo cores que começam com a letra "V"
        Iterator<String> iterator = cores.iterator();
        System.out.println("\n** Lista de Cores com a letra V **");
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.indexOf('V') == 0) System.out.println(next);
        }

        // Removendo cores que não começam com letra "V"
        System.out.println("\n** Removendo cores que não começam com letra V **");
        iterator = cores.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.indexOf('V') != 0) iterator.remove();
        }
        System.out.println(cores.toString());

        // Limpando a Lista de Cores
        cores.clear();
        //Verificando se a lista está vazia
        if (cores.isEmpty())
            System.out.println("\nA lista está vazia!");
        else
            System.out.println("\nA lista não está vazia!");


        // Imprimindo todas as cores na mesma linha
//        System.out.println("\nCor: " + cores.toString());
    }

    @Override
    public String toString() {
        return "ArcoIris{}";
    }
}
