package catalogoFilmes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private LocalDate dataLancamento;
    private Diretor diretor;
    private List<Ator> atores = new ArrayList<>();

    public Filme(String titulo, LocalDate dataLancamento, Diretor diretor) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.diretor = diretor;
    }

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public Diretor getDiretor() {  // Método adicionado
        return diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }
}
