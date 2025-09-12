package ucb.aplicativo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Tarefas {
    private long ID;
    private String Titulo;
    private String Descricao;
    private boolean Completa;
    private LocalDateTime DataAgora;

    //construtor padrão
    public Tarefas(){
        this.DataAgora = LocalDateTime.now();
        this.Completa = false;
    }

    //construtor com titulo
    public Tarefas(String Titulo){
        this();
        this.Titulo = Titulo;
    }

    //construtor com titulo e descrição
    public Tarefas(String Titulo, String Descricao){
        this(Titulo);
        this.Descricao = Descricao;
    }

    //construtor completo
    public Tarefas(long ID, String Titulo, String Descricao, boolean Completa){
        this(Titulo, Descricao);
        this.ID = ID;
        this.Completa = Completa;
    }

    //Declarando os Gets, e os Sets


    //ID
    public long getID(){
        return ID;
    }

    public void setID(long ID){
        this.ID = ID;
    }

    //Titúlo
    public String getTitulo(){
        return Titulo;
    }

    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }

    //Descrição
    public String getDescricao(){
        return Descricao;
    }

    public void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }

    //Completa
    public boolean isCompleta(){
        return Completa;
    }

    public void setCompleta(boolean Completa){
        this.Completa = Completa;
    }

    //Data Agora
    public LocalDateTime getDataAgora(){
        return DataAgora;
    }

    public void setDataAgora(LocalDateTime DataAgora){
        this.DataAgora = DataAgora;
    }

}
