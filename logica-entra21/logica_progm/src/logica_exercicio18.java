import java.util.Scanner;
public class logica_exercicio18 {
    /*
    A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas
    receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo
    que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
    que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
    (considere que o mês possua 4 semanas exatas de 5 dias úteis).
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horasTrabalhadasMes;
        double salarioPorHora;
        double salarioTotal;

        System.out.print("Informe a quantidade total de horas trabalhadas no mês: ");
        horasTrabalhadasMes = ler.nextInt();
        System.out.print("Informe o salário por hora do funcionário R$: ");
        salarioPorHora = ler.nextDouble();

        if (horasTrabalhadasMes > 160) {
            salarioTotal = (160 * salarioPorHora) + ((horasTrabalhadasMes - 160) * (salarioPorHora/2));
            System.out.println("O salário final é de R$: " + salarioTotal);
        } else {
            salarioTotal = (horasTrabalhadasMes * salarioPorHora);
            System.out.println("O salário final é de R$: " + salarioTotal);
        }
    }
}
