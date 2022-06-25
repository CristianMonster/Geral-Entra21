import java.util.Scanner;
public class logica_exercicio21 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
        Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
        Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo',
        senão escrever a mensagem 'Saldo Negativo'.

         */
        Scanner ler = new Scanner(System.in);
        int numeroConta;
        double saldo;
        double debito;
        double credito;
        System.out.print("Informe o número da conta: ");
        numeroConta = ler.nextInt();
        System.out.print("Informe o saldo da conta R$: ");
        saldo = ler.nextDouble();
        System.out.print("Informe o debito R$: ");
        debito = ler.nextDouble();
        System.out.print("Informe o crédito R$: ");
        credito = ler.nextDouble();
        double saldoAtual = (saldo - debito + credito);
        System.out.printf("O seu saldo atual é de: %.2f\n", saldoAtual);

        if (saldoAtual >= 0){
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
