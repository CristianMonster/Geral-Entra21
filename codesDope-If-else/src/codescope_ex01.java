import java.util.Scanner;
public class codescope_ex01 {
    // Pegue os valores de comprimento e largura de um retângulo do usuário e verifique se ele é quadrado ou não.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a largura: ");
        int largura = ler.nextInt();
        System.out.print("Informe o comprimento: ");
        int comprimento = ler.nextInt();
        if (comprimento == largura) {
            System.out.println("É um quadrado!");
        } else {
            System.out.println("É um retângulo!");
        }
    }
}
