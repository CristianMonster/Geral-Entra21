import java.util.Scanner;
public class logica_exercicio8 {
    /*Uma revendedora de carros usados paga a seus funcionários vendedores
    um salário fixo por mês, mais uma comissão também fixa para cada carro
    vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo
    que leia o número de carros por ele vendidos, o valor total de suas vendas, o
    salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário
    final do vendedor.*/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int carrosVendidos;
        int valorTotalVendas;
        int salarioFixo;
        int porVenda;
        System.out.print("Informe o total de carros vendidos: ");
        carrosVendidos = ler.nextInt();
        System.out.print("Informe o valor total de vendas R$: ");
        valorTotalVendas = ler.nextInt();
        System.out.print("Informe o salário fixo do funcioário R$: ");
        salarioFixo = ler.nextInt();
        System.out.print("Informe o valor recebido por carro vendido R$: ");
        porVenda = ler.nextInt();

        double salarioFinal = (salarioFixo + (carrosVendidos * porVenda) + (valorTotalVendas * 0.05));
        System.out.println("O salário final do vendedor é de R$: " + salarioFinal);
    }
}
