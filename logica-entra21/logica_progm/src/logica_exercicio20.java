import java.util.Scanner;
public class logica_exercicio20 {
    /*
    Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
    Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00 mais 5% sobre
    o que ultrapassar este valor, calcular e escrever o seu salário total
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario;
        double valorVenda;
        double salarioFinal;
        System.out.print("Informe o salarário R$: ");
        salario = ler.nextDouble();
        System.out.print("Informe o valor das vendas R$: ");
        valorVenda  = ler.nextDouble();

        if (valorVenda > 1500 ) {
            salarioFinal = salario + (1500 * 0.03) + ((valorVenda - 1500) * 0.05);
            System.out.printf("O salário total é de: %.2f reais.\n", salarioFinal);
        } else {
            salarioFinal = salario + (valorVenda * 0.03);
            System.out.printf("O salário total é de: %.2f reais.\n", salarioFinal);
        }

    }
}
