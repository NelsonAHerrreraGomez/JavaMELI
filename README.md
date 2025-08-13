----------------------------------------------------------
SISTEMA DE CATÁLOGO DE FILMES (TIPO IMDB) - DOCUMENTAÇÃO
----------------------------------------------------------

1. OBJETOS PRINCIPAIS DO SISTEMA

O sistema possui três entidades principais:

1.1 Filme
- Atributos: título, data de lançamento, orçamento, descrição
- Relacionamentos: possui 1 diretor e N atores

1.2 Pessoa (classe abstrata)
- Atributos: nome, data de nascimento, nacionalidade
- Especializações: Ator e Diretor

1.3 Ator
- Atributos adicionais: número de premiações

1.4 Diretor
- Atributos adicionais: estilo cinematográfico

2. CLASSES E REPRESENTAÇÃO UML EM TEXTO

// CLASSE ABSTRATA BASE
abstract class Pessoa {
  - nome: String
  - dataNascimento: LocalDate
  - nacionalidade: String
  + getNome(): String
}

// SUBCLASSES
class Ator extends Pessoa {
  - premiacoes: int
  + getPremiacoes(): int
}

class Diretor extends Pessoa {
  - estiloCinematografico: String
  + getEstilo(): String
}

class Filme {
  - titulo: String
  - dataLancamento: LocalDate
  - orcamento: double
  - descricao: String
  - diretor: Diretor
  - atores: List<Ator>
  + adicionarAtor(Ator)
  + pesquisarPorNome(String): List<Filme>
}

3. SEQUÊNCIA DE OPERAÇÕES

3.1 Fluxo Principal:
[Início] → [Menu Principal] → {
  1. Cadastrar Filme → [
      a. Informar dados do filme
      b. Cadastrar/Selecionar diretor
      c. Cadastrar/Associar atores
      d. Confirmar cadastro
  ]
  2. Pesquisar Filme → [
      a. Digitar termo de busca
      b. Exibir resultados
  ]
  3. Sair
} → [Fim]

3.2 Coleta de Dados:
- Para filmes: título, data, orçamento, descrição
- Para pessoas: nome, data nascimento, nacionalidade
- Específicos:
  * Atores: número de premiações
  * Diretores: estilo cinematográfico

4. DIAGRAMA DE ESTADO

Estados possíveis:
- INICIO
- MENU_PRINCIPAL
- CADASTRO_FILME
- CADASTRO_PESSOA
- PESQUISA
- VISUALIZACAO
- SAIDA

Transições:
[INICIO] → MENU_PRINCIPAL
[MENU_PRINCIPAL] → CADASTRO_FILME (opção 1)
[MENU_PRINCIPAL] → PESQUISA (opção 2)
[MENU_PRINCIPAL] → SAIDA (opção 3)
[CADASTRO_FILME] → CADASTRO_PESSOA (se novo diretor/ator)
[CADASTRO*] → MENU_PRINCIPAL (após conclusão)
[PESQUISA] → VISUALIZACAO (ao selecionar filme)
[VISUALIZACAO] → MENU_PRINCIPAL (voltar)

5. DESCRIÇÃO DA INTERFACE

5.1 Interface Console:
- Sistema via terminal/texto
- Menu numérado simples
- Fluxo linear passo-a-passo

5.2 Componentes:
- Cabeçalho com nome do sistema
- Área de mensagens (status/erros)
- Listagem tabulada de resultados
- Formulários para cadastro:
  * Campos claramente identificados
  * Validação básica de dados

5.3 Navegação:
- Teclas numéricas para seleção
- Enter para confirmação
- Opção "Voltar" em submenus
