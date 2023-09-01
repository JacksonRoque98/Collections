package set.Ordenacao.GerenciamentoAluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciamentoAluno {
    Set<Aluno> alunosSet;

    public GerenciamentoAluno(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Aluno a : alunosSet){
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        }else{
            throw new RuntimeException("O conjunto está vazio.");
        }
        if(alunoParaRemover == null){
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunoPorNome(){
        Set<Aluno> AlunoPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()){
            System.out.println(AlunoPorNome);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunoPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if(!alunosSet.isEmpty()){
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }
}
