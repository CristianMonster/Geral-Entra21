import java.util.Scanner;
public class logica_exercicio14 {
    /*
    Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
    poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoAtual;
        int anoNascimento;

        System.out.println("Informe o ano atual: ");
        anoAtual = ler.nextInt();
        System.out.println("Informe o ano do seu nascimento: ");
        anoNascimento = ler.nextInt();

        int idadePessoa = anoAtual - anoNascimento;

        if (idadePessoa >=16) {
            System.out.println("Você já pode votar!");
        } else {
            System.out.println("Você ainda é muito novo para votar, vá aproveitar a vida!");
        }
    }
}
