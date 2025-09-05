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

    //Declarando os Gets, e os Sets


    //ID
    public long getid(){
        return id;
    }

    public void setid(long id){
        this.id = id;
    }

    //Titúlo
    public String gettitulo(){
        return titulo;
    }

    public void settitulo(String titulo){
        this.titulo = titulo;
    }

    //Descrição
    public String getdescricao(){
        return descricao;
    }

    public void setdescricao(String descricao){
        this.descricao = descricao;
    }

    //Completa
    public boolean iscompleta(){
        return completa;
    }

    public void setcompleta(boolean completa){
        this.completa = completa;
    }

    //Data Agora
    public LocalDateTime getdataAgora(){
        return dataAgora;
    }

    public void setdataAgora(LocalDateTime dataAgora){
        this.dataAgora = dataAgora;
    }


}
