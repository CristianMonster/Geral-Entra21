import java.util.Scanner;

public class logica_exercicio7 {
   /* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
    do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
    do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo
    de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double custoFabrica;

        System.out.print("Informe o valor do custo de fábrica em reais: ");
        custoFabrica = ler.nextDouble();

        double porcentagem = 1.73;
        double precoFinal = custoFabrica * porcentagem;
        System.out.println("O preço final é de R$: " + precoFinal);
    }
}
