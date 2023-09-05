package set.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;
    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, Integer codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }
    public Integer removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadoParaRemover = null;
        if(!convidadosSet.isEmpty()){
            for(Convidados c : convidadosSet){
                if(c.getCodigoConvite() == codigoConvite){
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        }
        return codigoConvite;
    }
    public Integer contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        if(!convidadosSet.isEmpty()){
            System.out.println(convidadosSet);
        }else{
            System.out.println("Sua lista de convidados está vazia!");
        }
    }
}
