package catalogoFilmes;

import java.time.LocalDate;

public class Diretor extends Pessoa {
    private String estiloCinematografico;

    public Diretor(String nome, LocalDate dataNascimento, String estiloCinematografico) {
        super(nome, dataNascimento);
        this.estiloCinematografico = estiloCinematografico;
    }

    public String getEstiloCinematografico() {
        return estiloCinematografico;
    }
}
