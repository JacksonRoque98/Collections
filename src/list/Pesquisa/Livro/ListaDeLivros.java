package list.Pesquisa.Livro;

public class ListaDeLivros {
    public static void main(String[] args) {
        //Instanciando um catalogo de livros
        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();

        // Adicionando livros ao catálogo
        catalogoDeLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoDeLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoDeLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoDeLivros.adicionarLivro("Livro 4", "Autor 3", 2023);
        catalogoDeLivros.adicionarLivro("Livro 5", "Autor 4", 1994);

        // Exibindo livros pelo mesmo autor
        System.out.println("Livros do mesmo autor:");
        System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor 3"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println("Livros por intervalo de anos:");
        System.out.println(catalogoDeLivros.pesquisarIntervaloAnos(2020, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println("Livros por intervalo de anos:");
        System.out.println(catalogoDeLivros.pesquisarIntervaloAnos(2025, 2030));

        // Exibindo livro por título
        System.out.println("Livros por titulo:");
        System.out.println(catalogoDeLivros.pesquisarPorTitulo("Livro 1"));

    }
}
