public class Biblioteca {
    private Livro[] livros;          // Array para armazenar os livros
    private int quantidadeLivros;    // Contador de livros na biblioteca

    // Construtor
    public Biblioteca() {
        this.livros = new Livro[10]; // capacidade para 10 livros na biblioteca
        this.quantidadeLivros = 0;
    }

    // Para adicionar livro
    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < livros.length) {
            livros[quantidadeLivros] = livro;
            quantidadeLivros++;
            System.out.println("Livro adicionado: " + livro.getTitulo());
        } else {
            System.out.println("A biblioteca está cheia, não é possível adicionar mais livros.");
        }
    }

    // Buscar livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        for (int i = 0; i < quantidadeLivros; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }
        return null; // não encontrado
    }

    // Listar livros disponíveis
    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        boolean encontrou = false;
        for (int i = 0; i < quantidadeLivros; i++) {
            if (livros[i].isDisponivel()) {
                System.out.println("- " + livros[i].getTitulo() + " (" + livros[i].getAutor() + ")");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro disponível no momento.");
        }
    }

    // Calcular valor total de todos os livros
    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeLivros; i++) {
            total += livros[i].getPreco();
        }
        return total;
    }
}

