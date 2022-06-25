package classes;

public class ListaTarefas {

    private int tamanhoLista;
    private String nomeLista;
    private Tarefa[] tarefas;

    public ListaTarefas(int tamanhoLista){//metodo construtor, nao é reslponsável por interação com usuário
        this.setTamanhoLista(tamanhoLista);
        this.setTarefas(new Tarefa[tamanhoLista]); //setando uma lista de tarefas por meio do parânetro que o contrutor recebe;
    }

    public boolean adicionarTarefa(Tarefa tarefa){
        if(tarefa.getOrdem() < 0 || tarefa.getOrdem()>=this.getTamanhoLista()){ //se a ordem é maior qu o tamanho da lizta nao da pra adicionar
            return false;
        }

        for (int i = 0; i < this.getTamanhoLista(); i++){ // verificandot toda lista e adicionando na proxima posição vazia
            if (this.getTarefas()[i] == null){
                this.getTarefas()[i] = tarefa;
                return true;
            } else if (this.getTarefas()[i].getOrdem() == tarefa.getOrdem()) { //se as duas tiverem a mesma ordem retorna falso
                break;
            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int ordem){
        for (Tarefa t : this.getTarefas()){
            if (t != null && t.getOrdem() == ordem){//se a ordem for igual a posição que estou buscando ele retorna
                return t; //só para o código quando achar, vulgo retornar o Return
            }
        }
        return null;
    }

    public boolean alterarOrdemTarefa(int antigaOrdem,int novaOrdem){
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem);
        Tarefa tarefaNova = buscarTarefa(novaOrdem);

        if (buscarTarefa(antigaOrdem) == null || buscarTarefa(novaOrdem) == null){
            return false;
        }
        tarefaAntiga.setOrdem(novaOrdem);
        tarefaNova.setOrdem(antigaOrdem);
        return true;
    }

    //GETERS AND SETTERS

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}
