import java.util.Scanner;

public class codescope_ex04 {
    public static void main(String[] args) {
        //Uma empresa decidiu dar bonificação de 5% ao funcionário se o seu tempo de serviço for superior a 5 anos.
        //Pergunte ao usuário seu salário e ano de serviço e imprima o valor líquido do bônus.
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o seu salário R$: ");
        double salario = ler.nextDouble();
        System.out.print("Informe o seu tempo de serviço em anos,: ");
        double tempoServico = ler.nextDouble();

        if (tempoServico > 5) {
            double salarioBonificado = salario * 1.05;
            double valorBonificacao = salarioBonificado - salario;
            System.out.println("Parabéns, você recebeu uma bonificação no valor de R$: " + valorBonificacao);
        } else {
            System.out.println("Você ainda não está a mais de 5 anos na empresa, ainda não tens direito a bonificação ;/");
        }
    }
}
