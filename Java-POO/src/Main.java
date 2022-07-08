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
        while (lanche == null) {
            ETipoLanche opcao = null;
            switch (opcao){
                case X_SALADA -> lanche = new XSalada();
                case X_BURGUER -> lanche = new XBurguer();
                case MISTO_QUENTE -> lanche = new MistoQuente();
                case HOT_DOG -> lanche = new HotDog();
                case MINI_PIZZA -> lanche = new MiniPizza();
                case PIZZA -> lanche = new Pizza();
                default -> System.err.println("Escolha uma opção válida!");
            }
            System.out.println("-MENU: Escolha uma opção-"); // fazer o mesmo metodo escolher pção do da livraria

            int escolha = 0;
            try {
                escolha = in.nextInt();
            } catch (Exception e) {
                System.out.println("Escolha um Lanche Válido!");
            }
            in.nextLine();
            switch (escolha) {
                case 1 -> lanche = new XSalada();
                case 2 -> lanche = new XBurguer();
                case 3 -> lanche = new MistoQuente();
                case 4 -> lanche = new HotDog();
                case 5 -> lanche = new MiniPizza();
                case 6 -> lanche = new Pizza();
                default -> System.err.println("Escolha uma opção válida!");
            }
        }
        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) " + lanche.getTipo() + ": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }
}

