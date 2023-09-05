package set.Pesquisa.AgendaDeContatos;

import java.util.Objects;

public class Contatos {
    private String nome;
    private int numero;
    public Contatos(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contatos contatos)) return false;
        return Objects.equals(getNome(), contatos.getNome());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
    @Override
    public String toString(){
        return "Nome do contato: "+nome+
                ", numero do telefone: "+numero;
    }
}
