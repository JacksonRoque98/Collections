package map.Ordenacao.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaDeEventos {
    private Map<LocalDate, Evento> eventoMap;

    AgendaDeEventos(){
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao){
        eventoMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: "+dataEvento+", Evento: "+evento.getNome()+", Atração: "+
                    evento.getDescricao());
        }
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            if(dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)){
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if(proximoEvento != null){
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        }else{
            System.out.println("Não há eventos futuros na agenda!");
        }
    }

}
