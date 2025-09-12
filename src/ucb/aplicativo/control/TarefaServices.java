package ucb.aplicativo.control;

import ucb.aplicativo.model.Tarefas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TarefaServices {
    private List<Tarefas> tarefas = new ArrayList<>();
    private Long contadorID = 1L;

    public Tarefas criarTarefas(String titulo, String Descricao){
        Tarefas novaTarefa = new Tarefas(contadorID++, titulo, Descricao, false);
        tarefas.add(novaTarefa);
        return novaTarefa;
    }

    public List<Tarefas> ListarTarefas(){
        return tarefas;
    }

    public void atualizarTarefa( long atualizacaoID, String novoTitulo, String novaDescricao){

        Tarefas tarefaParaAtualizar = null;

        for (Tarefas tarefa : tarefas){
            if (tarefa.getID() == atualizacaoID){
                tarefaParaAtualizar = tarefa;
                break;
            }
        }
        if (tarefaParaAtualizar != null){

            tarefaParaAtualizar.setTitulo(novoTitulo);
            tarefaParaAtualizar.setDescricao(novaDescricao);
            System.out.println("Tarefa atualizado com sucesso!");
        }else{
            System.out.println("Erro ao atualizar tarefa!");
        }
    }

}
