import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie uma classe LinguagemFavorita que possua os atributos
 * nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
 * 3 linguagens e faça um programa que ordene esse conjunto por:
 * A. Ordem de Inserção
 * B. Ordem Natural (nome)
 * C. IDE
 * D. Ano de criação e nome
 * E. Nome, ano de criação e IDE
 * Ao final, exiba as linguagens no console, um abaixo do outro.
 */
public class Main {
    public static void main(String[] args) {
        // Criando um conjunto com 3 linguagens
        List<LinguagemFavorita> minhasLinguagens = new ArrayList<>(){{
           add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
           add(new LinguagemFavorita("HTML", 1990, "Sublime"));
           add(new LinguagemFavorita("PHP", 1994, "Eclipse"));
        }};

        // Ordenações e suas comparações
        System.out.println("\n**Ordem de Inserção **");
        System.out.println(minhasLinguagens);

        System.out.println("\n**Ordem Natural (Nome) **");
        Collections.sort(minhasLinguagens); // Utilizando metodo SORT para usar metodo Comparable e organizar a List
        System.out.println(minhasLinguagens);

        System.out.println("\n**Ordem IDE **");
        minhasLinguagens.sort(new ComparatorIDE());
        System.out.println(minhasLinguagens);

        System.out.println("\n**Ordem Ano de Criação e Nome **");
        minhasLinguagens.sort(new ComparatorAnoNome());
        System.out.println(minhasLinguagens);

        System.out.println("\n**Ordem Nome / Ano de Criação / IDE**");
        minhasLinguagens.sort(new ComparatorNomeAnoIDE());
        System.out.println(minhasLinguagens);
    }
}
