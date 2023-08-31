package list.Pesquisa.Livro;

public class ListaDeLivros {
    public static void main(String[] args) {
        //Instanciando um catalogo de livros
        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();

        // Adicionando livros ao catálogo
        catalogoDeLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoDeLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoDeLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoDeLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoDeLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoDeLivros.pesquisarIntervaloAnos(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoDeLivros.pesquisarIntervaloAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoDeLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoDeLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
