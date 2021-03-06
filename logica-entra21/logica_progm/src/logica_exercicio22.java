import java.util.Scanner;
public class logica_exercicio22 {
    /*
    Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em
    estoque de um produto. Calcular e escrever a quantidade média
    ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
    quantidade média, escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double quantidadeAtualEstoque;
        double quantidadeMaximaEstoque;
        double quantidadeMinimaEstoque;
        System.out.print("Informe a quantidade atual do estoque: ");
        quantidadeAtualEstoque = ler.nextDouble();
        System.out.print("Informe a quantidade máxima do estoque: ");
        quantidadeMaximaEstoque = ler.nextDouble();
        System.out.print("Informe a quantidade mínima do estoque: ");
        quantidadeMinimaEstoque = ler.nextDouble();

        double quantidadeMedia = ((quantidadeMaximaEstoque + quantidadeMinimaEstoque)/2);

        if (quantidadeAtualEstoque >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
