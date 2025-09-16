package ucb.aplicativo.cli;

import java.util.List;
import java.util.Scanner;
import ucb.aplicativo.control.TarefaServices;
import ucb.aplicativo.model.Tarefas;

public class Main {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        TarefaServices servico = new TarefaServices();

        while (true) {
            System.out.println("\n ========= GERENCIADOR DE TAREFAS ==========");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Atualizar Tarefas");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Pesquisar Tarefa");
            System.out.println("6. Tarefas Concluidas");
            System.out.println("7. Sair");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> {
                    String continuar;
                    do {
                        System.out.println("Título: ");
                        String titulo = entrada.nextLine();
                        System.out.println("Descrição: ");
                        String descricao = entrada.nextLine();
                        Tarefas nova = servico.criarTarefa(titulo, descricao);
                        System.out.println("Tarefa criada com sucesso: " + nova.getTitulo());
                        System.out.println("Deseja criar outra tarefa? (s/n)");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));

                }
                case 2 -> {
                    List<Tarefas> tarefas = servico.ListarTarefas();
                    System.out.println("Tarefas:");
                    for (Tarefas tarefa : tarefas) {
                        System.out.println("ID: " + tarefa.getID() + " - Título: " + tarefa.getTitulo());
                    }
                }
                case 3 -> {
                    String continuar;
                    do {
                        System.out.println("ID da Tarefa que deseja atualizar: ");
                        long id = entrada.nextLong();
                        entrada.nextLine();
                        System.out.println("Novo Título: ");
                        String titulo = entrada.nextLine();
                        System.out.println("Nova Descrição: ");
                        String descricao = entrada.nextLine();
                        System.out.println("Caso a tarefa tenha sido concluída digite 1, caso contrário, digite 0");
                        int concluida = entrada.nextInt();
                        entrada.nextLine();
                        servico.atualizarTarefa(id, titulo, descricao, concluida);
                        System.out.println("Tarefa atualizada com sucesso");
                        System.out.println("Deseja atualizar outra tarefa? (s/n)");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                }
                case 4 -> {
                    String continuar;
                    do {
                        System.out.println("ID da Tarefa que deseja remover: ");
                        long id = entrada.nextLong();
                        entrada.nextLine();
                        servico.removerTarefa(id);
                        System.out.println("Tarefa removida com sucesso");
                        System.out.println("Deseja remover outra tarefa? (s/n)");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                }
                case 5 -> {
                    String continuar;
                    do {
                        System.out.println("Pesquisar por ID: ");
                        long pesquisa = entrada.nextLong();
                        entrada.nextLine();
                        Tarefas tarefaPesquisada = servico.pesquisarTarefa(pesquisa);
                        if (tarefaPesquisada == null){
                            System.out.println("Nenhuma tarefa encontrada com este ID.");
                        } else {
                            System.out.println("Tarefa encontrada:");
                            System.out.println("ID: " + tarefaPesquisada.getID() + " - Título: " + tarefaPesquisada.getTitulo() + " - Descrição: " + tarefaPesquisada.getDescricao());
                        }
                        System.out.println("Deseja realizar outra pesquisa? (s/n)");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                }
                case 6 -> {
                    List<Tarefas> tarefas = servico.listarTarefasConcluidas();
                    System.out.println("Tarefas Concluidas:");
                    for (Tarefas tarefa : tarefas) {
                        System.out.println("ID: " + tarefa.getID() + " - Título: " + tarefa.getTitulo());
                    }
                }
                case 7 -> {
                    System.out.println("Tem certeza que deseja sair? (s/n)");
                    String confirmacao = entrada.nextLine();
                    if (confirmacao.equalsIgnoreCase("s")) {
                        System.out.println("Saindo...");
                        entrada.close();
                        return;
                    }
                }
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
