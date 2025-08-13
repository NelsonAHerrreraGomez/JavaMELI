package catalogoFilmes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Filme> filmes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Catálogo de Filmes ---");
            System.out.println("1. Cadastrar filme");
            System.out.println("2. Listar filmes");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarFilme(scanner);
                    break;
                case 2:
                    listarFilmes();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarFilme(Scanner scanner) {
        System.out.print("Título do filme: ");
        String titulo = scanner.nextLine();

        System.out.print("Data lançamento (AAAA-MM-DD): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        System.out.print("Nome do diretor: ");
        String nomeDiretor = scanner.nextLine();

        Diretor diretor = new Diretor(nomeDiretor, LocalDate.now(), "Ação"); // Exemplo simplificado

        Filme filme = new Filme(titulo, data, diretor);
        filmes.add(filme);

        System.out.println("Filme cadastrado com sucesso!");
    }

    private static void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }

        System.out.println("\nFilmes cadastrados:");
        for (Filme filme : filmes) {
            System.out.println("- " + filme.getTitulo() +
                    " (Dir: " + filme.getDiretor().getNome() + ")");
        }
    }
}


