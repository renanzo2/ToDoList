package ucb.aplicativo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Tarefas {
    private long id;
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataAgora;

    //construtor padrão
    public Tarefas(){
        this.dataAgora = LocalDateTime.now();
        this.completa = false;
    }

    //construtor com titulo
    public Tarefas(String titulo){
        this();
        this.titulo = titulo;
    }

    //construtor com titulo e descrição
    public Tarefas(String titulo, String descricao){
        this(titulo);
        this.descricao = descricao;
    }

    //construtor completo
    public Tarefas(long id, String titulo, String descricao, boolean completa){
        this(titulo, descricao);
        this.id = id;
        this.completa = completa;
    }


}
