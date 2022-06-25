import javax.swing.*;
import java.security.Key;
import java.sql.Array;
import java.util.*;

import classes.*;

public class Main {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        exe07();
    }

    //---------------------ARRAYLIST---------------------
    public static void ex01() {
        //pedir para o usuario informar n numeros inteiros até ele digitar 0
        //quando ele digitar 0, mostrar a lista dos números digitados por ele
        ArrayList<Integer> inteiros = new ArrayList<>(); //classe wrapper em arraylist, to declarando e especificando que é uma lista de inteiro
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = ler.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println(inteiros);
        System.out.println("Valores informados: ");
    }

    /*
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.get(0).get(1);
    * */
    public static void ex02() {
        //Pedir para o usuario informar valores inteiros até que seja informado 0
        //Quando for informado 0, mostrar os valores que o usuario digitou
        //motrar a soma dos números pares e dos numeros impares informados
        //nistrar a nédia de todos os valores
        ArrayList<Integer> array = new ArrayList<>();
        int pares = 0;
        int impar = 0;
        double total = 0;
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = ler.nextInt();
            array.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: " + array);

        for (Integer i : array) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impar += i;
            }
            total += i;
        }
        System.out.println("Soma dos números pares: " + pares);
        System.out.println("Soma dos números impares: " + impar);
        System.out.println("A soma total é de: " + total);
        System.out.println("A média dos números é de: " + (total / array.size()));


    }

    public static void exe03() {
        //Deixar o usuario digitar uma porrada de palavras, condição de parada SAIR
        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            System.out.print("Informe uma palvra: ");
            String palavra = ler.nextLine();
            if (palavra.equalsIgnoreCase("SAIR")) {
                break;
            }
            lista.add(palavra);
        }
        int numero = 0;
        while (true) {
            System.out.println("Informe um número maior do que 0");
            numero = ler.nextInt();
            if (numero > 0) {
                break;
            } else {
                System.out.println("Número Inváido");
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() < numero) {
                lista.remove(i);
                i--;
            }
        }
        System.out.println(lista);
    }

    //---------------------HASMAP---------------------

    public static void exe04() {
        //Mexendo com hashmap
        HashMap<String, Double> produtos = new HashMap<>();
        produtos.put("Banana", 2.0);
        produtos.put("Maça", 2.5);
        produtos.put("Manga", 4.0);
        produtos.put("Acabaxi", 5.0);

        for (String i : produtos.keySet()) {
            System.out.println(i + "=" + produtos.get(i));
        }
        // System.out.println(produtos);
    }

    public static void exe05() {
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;
        while (executa) {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar Produto");
            System.out.println("3 - Bucar todos os pedidos");
            System.out.println("4 - Remover algum produto");
            System.out.println("0 - Sair");
            int escolha = ler.nextInt();
            ler.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.print("Informe o nome do produto: ");
                    String key = ler.nextLine();
                    if (produtos.containsKey(key)) {
                        System.out.println("Produto já existente, deseja atualizar o valor? S/N");
                        if (ler.nextLine().equalsIgnoreCase("n")) {
                            continue;
                        }
                    }
                    System.out.print("Informe o valor do produto: ");
                    double valor = ler.nextInt();
                    ler.nextLine();
                    produtos.put(key.toLowerCase(Locale.ROOT), valor);
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    } else {
                        System.out.println("Informe o nome do produto");
                        String nome = ler.nextLine().toLowerCase();
                        if (produtos.containsKey(nome)) {
                            System.out.println(nome + ":" + produtos.get(nome));
                        } else {
                            System.out.println("Produto não encontrado");
                        }
                    }
                    break;
                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    } else {
                        for (String i : produtos.keySet()) {
                            System.out.println(i + "=" + produtos.get(i));
                        }
                    }
                    break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    } else {
                        System.out.print("Informe o produto a ser removido:");
                        String remover = ler.nextLine().toLowerCase();
                        if (produtos.containsKey(remover)) {
                            System.out.println("Produto " + remover + " removido");
                            produtos.remove(remover);
                        } else {
                            System.out.println("Produto não encontrado");
                        }
                    }
                    break;
                default:
                    System.out.println("Escolha inváldia");

            }
        }
    }

    public static void exe07() {
        HashMap<String, ArrayList<Carro>> teste = new HashMap<>();
        boolean executa = true;
        while (executa) {
            System.out.println("MENU");
            System.out.println("1 - Adicionar um carro a lista");
            System.out.println("2 - Verificar a lista de carros disponivels");
            System.out.println("3 - Vender um carro");
            System.out.println("0 - Sair do programa");
            System.out.print("Escolha uma opção: ");
            int escolha = ler.nextInt();
            ler.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;

                case 1:
                    Carro c = new Carro(); // cria o objeto da classe carro
                    System.out.print("Informe a marca do carro: ");
                    String marca = ler.nextLine().toLowerCase();
                    System.out.print("Informe o modelo do carro: ");
                    c.setModelo(ler.nextLine());
                    System.out.print("Informe o valor do carro: ");
                    c.setValorVenda(ler.nextDouble());
                    ler.nextLine();
                    if (!teste.containsKey(marca)) {//se nao existe a key marca, nao tem arraylist pro usuario informar o carro
                        teste.put(marca, new ArrayList<>());
                    }
                    teste.get(marca).add(c); // get retorna o objeto relacionado a CHAVE do hashmap, retorna o arraylist nesse caso e adicionar o carro a esse arraylist
                    System.out.println("Carro Adicionado ao Catálogo");
                    System.out.println();
                    break;

                case 2:
                    if (teste.isEmpty()) {
                        System.out.println("Não existem carros para à venda");
                    } else {
                        System.out.println("**Catálogo**");
                        for (String i : teste.keySet()) { //indo de marca em marca
                            System.out.print("---" + i.toUpperCase() + "---");
                            for (Carro car : teste.get(i)) { // pegando todos os valores da minha key "i"
                                System.out.print(car.getModelo() + ": R$" + car.getValorVenda() + ", ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    if (teste.isEmpty()) {
                        System.out.println("Não existem carros para à venda");
                    } else {
                        System.out.println("Informe a marca do carro que você deseja: ");
                        String marcaV = ler.nextLine();
                        if (!teste.containsKey(marcaV.toLowerCase())) {
                            System.out.println("Nao existem carros da marca " + marcaV + "!");
                        } else {
                            System.out.print("Informe o modelo do carro: ");
                            String modelo = ler.nextLine();
                            ArrayList<Carro> carrosMarca = teste.get(marcaV.toLowerCase());
                            boolean encontrado = false;
                            for (int i = 0; i < carrosMarca.size(); i++) {
                                Carro d = carrosMarca.get(i);
                                if (d.getModelo().equalsIgnoreCase(modelo)) { // se o modelo daquela posição for igual a qual o usuario digitou
                                    encontrado = true;
                                    System.out.println("Valor da venda: RS" + d.getValorVenda() + ". Deseja efetuar a venda?");
                                    if (ler.nextLine().equalsIgnoreCase("S")) {
                                        System.out.printf("Carro %s da marca %s vendido por R$%.2f!\n", d.getModelo(), marcaV, d.getValorVenda());
                                        carrosMarca.remove(i);
                                        if (carrosMarca.isEmpty()) {
                                            teste.remove(marcaV.toLowerCase());
                                        }
                                    }
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Carro de modelo '" + modelo + "' não encontrado na marca '" + marcaV + "'!");
                            }

                        }

                    }
            }
            System.out.println("");
        } // para esse exercicio eu poderia ter criado varias funções separadas e chamar no switch, ex case 1: mostrarListaCarros() - public statis void mostrarListaCarros(){}
    }
}