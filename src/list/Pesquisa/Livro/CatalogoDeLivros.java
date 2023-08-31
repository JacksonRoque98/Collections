package list.Pesquisa.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {

    private List<Livros> livroList;

    CatalogoDeLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livros(titulo, autor, anoDePublicacao));
    }

    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livros l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livros> pesquisarIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livros l : livroList){
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
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
            return livroPorTitulo;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

}
