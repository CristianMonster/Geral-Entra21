import classes.ETipoLanche;
import classes.cliente.Cliente;
import classes.lanches.*;
import classes.ETipoLanche;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.print("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true) {
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche? (S/N)");
            if (in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente: " + cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche() {
        Lanche lanche = null;
        ETipoLanche opcao = escolherOpcao();
        switch (opcao) {
            case X_SALADA -> lanche = new XSalada();
            case X_BURGUER -> lanche = new XBurguer();
            case MISTO_QUENTE -> lanche = new MistoQuente();
            case HOT_DOG -> lanche = new HotDog();
            case MINI_PIZZA -> lanche = new MiniPizza();
            case PIZZA -> lanche = new Pizza();
            default -> System.err.println("Escolha uma opção válida!");
        }
        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) " + lanche.getTipo() + ": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }

    public static ETipoLanche escolherOpcao() {
        ETipoLanche opcao = null;
        while (opcao == null) {
            try {
                System.out.println("--- MENU ---");
                for (ETipoLanche lanche : ETipoLanche.values()) {
                    System.out.println("[" + lanche.getValorOpcao() + "] - " + lanche.getDescricao());
                }
                opcao = ETipoLanche.getByValorOpcao(in.nextInt());
            } catch (Exception e) {
                System.err.println("Selecione uma opção válida!");
            } finally {
                in.nextLine();
            }
        }
        return opcao;
    }
}

