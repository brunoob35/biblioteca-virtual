public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 120.0, true);
        Livro l2 = new Livro("Harry Potter", "J.K. Rowling", 1997, 80.0, true);
        Livro l3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, 50.0, false);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.listarLivrosDisponiveis();

        Livro encontrado = biblioteca.buscarLivroPorTitulo("Harry Potter");
        if (encontrado != null) {
            System.out.println("Livro encontrado: " + encontrado.getTitulo());
        } else {
            System.out.println("Livro não encontrado.");
        }

        System.out.println("Valor total dos livros: R$ " + biblioteca.calcularValorTotal());

    }
}
