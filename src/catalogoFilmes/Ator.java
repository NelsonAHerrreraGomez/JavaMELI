package catalogoFilmes;
import java.time.LocalDate;
public class Ator extends Pessoa {
    private int premiacoes;

    public Ator(String nome, LocalDate dataNascimento, int premiacoes) {
        super(nome, dataNascimento);
        this.premiacoes = premiacoes;
    }

    public int getPremiacoes() {
        return premiacoes;
    }
}
