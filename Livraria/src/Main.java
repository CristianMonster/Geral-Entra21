import classes.EMenu;
import classes.EMenuItem;
import classes.Loja;
import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Loja locadora = new Loja();
        boolean loop = true;
        while (loop) {
            EMenu opcao = escolherOpcao();
            switch (opcao) {
                case SAIR -> loop = false;
                case ADICIONAR_ITEM -> adicionarItem(locadora);
                case BUSCAR_ITEM -> buscarItemETratarRetorno(locadora);
                case REMOVER_ITEM -> removerItem(locadora);
                case MOSTRAR_ITEM -> mostarItens(locadora);
                case ADICIONAR_ESTANTE -> adicionarEstante(locadora);
            }
        }
        System.out.println("Programa finalizado!");
    }

    public static EMenu escolherOpcao() {
        EMenu escolha = null;
        while (escolha == null) {
            System.out.println("Selecione uma opção");
            for (EMenu e : EMenu.values()) {
                System.out.printf("[%d] - %s\n", e.getValorOpcao(), e.getDescricao());
            }
            escolha = EMenu.getByValorOpcao(in.nextInt());
            in.nextLine();
            if (escolha == null) {
                System.out.println("Opção Inválida!");
            }
        }
        return escolha;
    }

    // Adicionar item na estante
    public static void adicionarItem(Loja e) {
        if (e.getEstante().isEmpty()) {
            System.out.println("Não há nenhuma estante na sua locadora!\n");
        } else {
            System.out.print("Informe a estante em que você deseja adcionar o item: ");
            String genero = in.nextLine().toLowerCase();
            if (!e.getEstante().containsKey(genero)) {
                System.out.println("Nenhuma estante com esse gênero encontrada!\n");
            } else {
                Estante estante = e.getEstante().get(genero);
                if (estante.estanteCheia()) {
                    System.err.println("Sua estante está cheia! Não é possível adicionar mais itens!");
                } else {
                    Item i = null;
                    int escolha = -1;
                    while (escolha < 0 || escolha > 1) {
                        System.out.print("Informe o item que deseja adicionar (0 - Livro / 1 - DVD): ");
                        escolha = in.nextInt();
                        if (escolha < 0 || escolha > 1) {
                            System.err.println("Selecione uma opção válida");
                        }
                    }
                    in.nextLine();
                    if (escolha == 0) {
                        i = new Livro();
                    } else {
                        i = new DVD();
                    }
                    System.out.print("Informe o título: ");
                    i.setTitulo(in.nextLine());
                    System.out.print("Informe o gênero: ");
                    i.setGenero(in.nextLine());
                    System.out.print("informe o valor: R$");
                    i.setValor(in.nextDouble());
                    in.nextLine();
                    i.montarDetalhes(in);
                    if (!estante.adicionarItem(i)) {
                        System.err.println("Não foi possível adicionar o item na estante!");
                    } else {
                        System.out.println("Item adicionado com sucesso!");
                    }
                }
            }
        }
    }

    public static void buscarItemETratarRetorno(Loja e) {
        System.out.print("Informe o título para busca: ");
        String escolha = in.nextLine();
        for (String s : e.getEstante().keySet()) { // esta passando por todas as estantes
            Estante estante = e.getEstante().get(s);
            Item i = estante.buscarItem(escolha);
            if (i == null) {
                System.err.println("O título buscado não existe na estante!");
            } else {
                System.out.println("Item encontrado na estante: " + e.getEstante().keySet());
                EMenuItem escolhaC = null;
                while (escolhaC == null) {
                    System.out.println("Selecione uma Opção");
                    for (EMenuItem item : EMenuItem.values()) {
                        System.out.printf("[%d] - %s\n", item.getValorOpcao(), item.getDescricao());
                    }
                    escolhaC = EMenuItem.getByValorOpcao(in.nextInt());
                    if (escolha == null) {
                        System.err.println("Selecione uma opção válida");
                    }
                }
                in.nextLine();
                switch (escolhaC) {
                    case VOLTAR -> System.out.println("Retornando...");
                    case VER_AVALIACAO -> mostarAvaliacoes(i);
                    case AVALIAR_ITEM -> i.avaliar();
                    case MOSTRAR_DETALHES -> {
                        System.out.println("Título: " + i.getTitulo());
                        System.out.println("Gênero: " + i.getTitulo());
                        i.mostrarDetalhes();
                        System.out.printf("Valor: R$%.2f", i.getValor());
                    }
                    default -> System.out.println("Não implementado!");
                }
            }
        }
    }

    public static void mostarAvaliacoes(Item i) {
        i.getAvaliacoes().forEach(a -> {
            System.out.println("Autor: " + a.getNome());
            System.out.println("avaliação: " + a.getRating());
            System.out.println("Comentário: ");
            System.out.println(a.getFeedback());
            System.out.println("--------------------");
        });
        System.out.println("Classificação final: " + i.getTotalRating());
    }

    public static void removerItem(Loja e) {
        if (e.getEstante().isEmpty()) {
            System.out.println("Não existem estantes na sua loja!");
        } else {
            System.out.println("Qual estante você deseja remover o item?");
            String genero = in.nextLine();
            if (!e.getEstante().containsKey(genero)) {
                System.out.println("Nenhuma estante com esse gênero encontrada!");
            } else {
                Estante estante = e.getEstante().get(genero);
                if (estante.quantidadeItens() == 0) {
                    System.err.println("Não é possível remover itens de uma estante vazia!");
                } else {
                    int posicao;
                    do {
                        System.out.print("Informe a posição do item para remover: ");
                        posicao = in.nextInt();
                        if (posicao < 0 || posicao > estante.quantidadeItens()) {
                            System.err.println("Selecione uma opção válida!");
                        }
                    } while (posicao < 0 || posicao > estante.quantidadeItens());

                    in.nextLine();
                    Item i = estante.removerItem(posicao);
                    System.out.println("Item " + i.getTitulo() + " removido!");
                }
            }
        }
    }

    public static void mostarItens(Loja e) {
        if (e.getEstante().isEmpty()) {
            System.out.println("Não existem estantes na sua loja!");
        } else {
            for (String s : e.getEstante().keySet()) {
                System.out.println("Estante: " + s.toUpperCase());
                Estante estante = e.getEstante().get(s);
                if (estante.quantidadeItens() == 0) {
                    System.out.println("Estante vazia!\n");
                } else {
                    for (int i = 0; i < estante.getItens().size(); i++) {
                        Item item = estante.getItens().get(i);
                        System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                    }
                }
            }
        }
    }

    public static void adicionarEstante(Loja e) {
        System.out.println("Informe o Gênero da sua estante: ");
        String genero = in.nextLine().toLowerCase();
        if (e.getEstante().containsKey(genero)) { // pegando o haskmap e olhando a key dele
            System.out.println("Estante com esse gênero ja adicionada!");
        } else {
            System.out.println("Informe a capacidade maxima da sua estante: ");
            e.getEstante().put(genero, new Estante(in.nextInt()));
            in.nextLine();
        }
    }
}
