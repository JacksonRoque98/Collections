package comparableXcomparator;

//UMA CLASSE 'LIVRO' QUE IMPLEMENTA COMPARABLE
class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private Integer ano;

    //Construtor
    public Livro(String ti, String au, Integer an){
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }

    //usado para ordenar livros por ano
    public int compareTo(Livro l){
        return titulo.compareTo(l.titulo);
    }
    //metodos getters para acessar os dados privados
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public Integer getAno(){
        return ano;
    }


}
