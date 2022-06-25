import classes.ChecklistItem;
import classes.ListaTarefas;
import classes.Tarefa;

import java.util.Scanner;

public class Main {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Informe a quantidade de tarefas da lista: ");
        ListaTarefas lt = new ListaTarefas(ler.nextInt());
        ler.nextLine();
        System.out.print("Informe um nome para a lista de tarefas: ");
        lt.setNomeLista(ler.nextLine());
        while (true){
            Tarefa t = criarTarefa();
            if (!lt.adicionarTarefa(t)){
                System.err.println("Impossivel adicinar tarefa!");
                break;
            }
            System.out.print("Deseja adicionar mais tarefas?: (S|N)");
            String add = ler.nextLine();
            if (add.equalsIgnoreCase("N")){
                break;
            }
        }
    }

    public static Tarefa criarTarefa(){
        Tarefa teste = new Tarefa();
        System.out.print("Iforme o nome da tarefa: ");
        teste.setNome(ler.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        teste.setDescricao(ler.nextLine());
        System.out.print("Ordem da tarefa: ");
        teste.setOrdem(ler.nextInt());
        ler.nextLine();
        System.out.print("Tarefa tem checklist? (S/N) ");
        String checklist = ler.nextLine();

        if (checklist.equalsIgnoreCase("S")){
            System.out.println("Informe o tamanho da lista");
            teste.criarChecklist(ler.nextInt());
            ler.nextLine();
            while (true){
                ChecklistItem item = new ChecklistItem();
                System.out.println("Informe um nome para o item: ");
                item.setNome(ler.nextLine());
                System.out.println("Informe uma descrição para o item: ");
                item.setDescricao(ler.nextLine());
                teste.adicionarChecklistItem(item);
                System.out.println("Deseja adicionar mais itens? (S/N)");
                String add = ler.nextLine();
                if (add.equalsIgnoreCase("N")){
                    break;
                }
            }
        }
        return teste;
    }
}
