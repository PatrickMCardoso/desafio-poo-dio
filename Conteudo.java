import java.util.ArrayList;
import java.util.List;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private List<String> feedbacks = new ArrayList<>();
    private List<Integer> avaliacoes = new ArrayList<>();

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarFeedback(String feedback) {
        feedbacks.add(feedback);
    }

    public List<String> getFeedbacks() {
        return feedbacks;
    }

    public void adicionarAvaliacao(int avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public double getAvaliacaoMedia() {
        return avaliacoes.stream().mapToInt(a -> a).average().orElse(0);
    }
}
