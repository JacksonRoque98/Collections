package list.Pesquisa.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    //Instanciando uma lista de Livros
    private List<Livros> livroList;
    //Instanciando o construtor
    public CatalogoDeLivros(){
        this.livroList = new ArrayList<>();
    }
    //Adicionando um livro a lista de livros
    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livros(titulo, autor, anoDePublicacao));
    }
    //Pesquisando livro por autor
    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livros l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    //Pesquisando livros por intervalo de anos
    public List<Livros> pesquisarIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livros> livroPorIntervaloDeAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livros l : livroList) {
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
                    livroPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livroPorIntervaloDeAnos;
    }

    public Livros pesquisarPorTitulo(String titulo){
        Livros livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livros l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}
