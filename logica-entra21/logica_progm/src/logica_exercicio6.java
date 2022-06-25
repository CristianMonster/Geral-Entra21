import java.util.Scanner;

public class logica_exercicio6 {
   /* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual
    de reajuste. Calcular e escrever o valor do novo salário.*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario;
        double reajuste;
        System.out.print("Informe o salário mensal do funcionário: ");
        salario = ler.nextDouble();
        System.out.print("Informe o reajuste em porcentagem - SOMENTE NÚMEROS: ");
        reajuste = ler.nextDouble();

        double salarioFinal = Math.round(salario * ((reajuste/100)+1));
        /*double reajuste = Math.round(salario * 1.1);*/
        System.out.println("O salário após o reajuste é de: " + salarioFinal + " reais");
    }
}
