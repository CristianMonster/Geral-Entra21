import java.util.Scanner;
public class logica_exercicio11 {
        /*Ler um valor e escrever a mensagem
        É MAIOR QUE 10! se o valor lido for maior
        que 10, caso contrário escrever NÃO É MAIOR QUE 10!*/
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int valor;

            System.out.println("Informe um valor:");
            valor = ler.nextInt();

            if (valor > 10) {
                System.out.println("É MAIOR QUE 10!");
            } else {
                System.out.println("É MENOR DO QUE 10");
            }
        }
}
