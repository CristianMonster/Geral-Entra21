package classes;
import java.util.UUID;

public class Tarefa {

    private String uuid; //public void setuui(String uui) public String getuui()
    private String nome; // public void setnome(String nome) public String getnome()
    private String descricao; //public void setDescricao(String descricao) pubblic String getDescricao()
    private boolean completa; // public void setCompleta(boolean completa) public boolean iscompleta
    private int ordem; // public void setOrdem(int ordem) public int getOrdem()
    private ChecklistItem[] checklist; // public void setChecklist(ChecklistItem[] checklist) public ChecklistItem[] getChecklist
    //esse Checklist[] é referencia a relação de agregação da tarefa para com o checklist
    public Tarefa(){
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar(){
        this.setCompleta(true);
        for (ChecklistItem item : checklist){
            if(item != null){
                item.completar();
            }
        }
    }

    public boolean temChecklist(){
        return this.getChecklist() != null;
    }

    public void criarChecklist(int tamanho){
        this.setChecklist(new ChecklistItem[tamanho]);
    }

    public boolean adicionarChecklistItem(ChecklistItem item){
        for (int i = 0; i < this.getChecklist().length; i++){ // verificandot toda lista e adicionando na proxima posição vazia
            if (this.getChecklist()[i] == null){
                this.getChecklist()[i] = item;
                return true;
            }
        }
        return false;
    }

    //------GATTERS AND SETTERS------

    public void setUuid(String uuid){
        this.uuid = uuid;
    }

    public String getUuid(){
        return this.uuid;
    }

    //-----------------------------
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    //----------------------------
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
    //---------------------------
    public void setCompleta(boolean completa){
        this.completa = completa;
    }

    public boolean isCompleta(){
        return this.completa;
    }
    //-----------------------------
    public void setOrdem(int ordem){
        this.ordem = ordem;
    }

    public int getOrdem(){
        return this.ordem;
    }

    //-------------------------------------------
    public ChecklistItem[] getChecklist() {
        return checklist;
    }

    public void setChecklist(ChecklistItem[] checklist) {
        this.checklist = checklist;
    }
}
