import java.util.Comparator;


class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().compareToIgnoreCase(linguagem.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        // Compara 2 IDE para ordenar
        return linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        // recebedo parametros de comparação
        int ano = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());

        // Verifica se as datas são diferentes e em caso positivo retorna o Ano de Criação
        if (ano != 0) return ano;
        // Em caso dos parametros Ano forem datas iguais ele retorna a comparação do Nome
        return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
    }
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        // recebendo parametros de comparação
        int nome = linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
        int ano = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        // Verifica se os Nomes são diferentes e em caso positivo retorna o Nome da Linguagem
        if (nome != 0) return nome;
        // Verifica se os parametros Ano são diferentes e em caso positivo retorna o Ano de Criação
        if (ano != 0) return ano;
        // Em caso dos parametros Ano forem datas iguais ele retorna a comparação da IDE
        return linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());
    }
}
