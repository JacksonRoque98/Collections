package set.OperacoesBasicas.Convidados;

import java.util.Objects;

public class Convidados {
    private String nome;
    private Integer codigoConvite;
    public Convidados(String nome, Integer codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    public String getNome(){
        return nome;
    }
    public Integer getCodigoConvite(){
        return codigoConvite;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidados convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString(){
        return "Nome do convidado: "+nome+
                ". Codigo do convite: "+codigoConvite;
    }

}
