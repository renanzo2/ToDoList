package ucb.aplicativo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefas {
    private long id;
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime DataAgora;

    //construtor padrão
    public Tarefas(){
        this.DataAgora = LocalDateTime.now();
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

    //Declarando os Gets, e os Sets

    //ID
    public long getID(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    //Titúlo
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //Descrição
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    //Completa
    public boolean isCompleta(){
        return completa;
    }

    public void setCompleta(boolean completa){
        this.completa = completa;
    }

    //Data Agora
    public LocalDateTime getDataAgora(){
        return DataAgora;
    }

    public void setDataAgora(LocalDateTime dataCriacao){
        this.DataAgora = dataCriacao;
    }
}

