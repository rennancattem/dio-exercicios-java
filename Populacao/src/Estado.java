import java.util.Objects;

public class Estado {
    private String estado;
    private Integer populacao;

    public Estado(String estado, Integer populacao) {
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado1 = (Estado) o;
        return estado.equals(estado1.estado) && populacao.equals(estado1.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado, populacao);
    }

    @Override
    public String toString() {
        return "Estado{" +
                "estado='" + estado + '\'' +
                ", Populacao=" + populacao +
                '}';
    }

}
