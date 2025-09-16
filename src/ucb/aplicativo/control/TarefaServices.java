package ucb.aplicativo.control;

import ucb.aplicativo.model.Tarefas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TarefaServices {
    //Inicialização da lista de tarefas
    private List<Tarefas> tarefas = new ArrayList<>();
    //Incrementador de ID
    private long contadorID = 1L;

    //Método criar tarefas
    public Tarefas criarTarefas(String titulo, String Descricao) {
        Tarefas novaTarefa = new Tarefas(contadorID++, titulo, Descricao, false);
        tarefas.add(novaTarefa);
        return novaTarefa;
    }

    //Método para listagem de tarefas
    public List<Tarefas> ListarTarefas() {
        return tarefas;
    }

    //Método para autalização de tarefas
    public boolean atualizarTarefa(long atualizacaoID, String novoTitulo, String novaDescricao, int concluida) {

        for (Tarefas tarefa : tarefas) {
            if (tarefa.getID() == atualizacaoID) {
                tarefa.setTitulo(novoTitulo);
                tarefa.setDescricao(novaDescricao);
                if (concluida == 1) {
                    tarefa.setCompleta(true);
                }
                return true;
            }
        }
        return false;
    }

    //Métodos para remoção de tarefas
    public void removerTarefa(long removerID) {
        for (int i = tarefas.size() - 1; i >= 0; i--) {
            if (removerID == tarefas.get(i).getID()) {
                tarefas.remove(tarefas.get(i));
            }
        }
    }

    //Método para pesquisa de tarefas cadastradas
    public Tarefas pesquisarTarefa(long pesquisa) {
        for (Tarefas tarefa : tarefas) {
            if (tarefa.getID() == pesquisa) {
                return tarefa;
            }
        }
        return null;
    }

    // Método para listagem de tarefas setadas como concluídas
    public List<Tarefas> listarTarefasConcluidas() {
        List<Tarefas> TarefasConcluidas = new ArrayList<>();
        for (Tarefas tarefa : tarefas) {
            if (tarefa.isCompleta()) {
                TarefasConcluidas.add(tarefa);
            }
        }
        return TarefasConcluidas;
    }


}

