import java.util.Scanner;
public class codescope_ex02 {
    public static void main(String[] args) {
    //Pegue dois valores int do usuário e imprima o maior entre eles.
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        double a = ler.nextDouble();
        System.out.print("Informe o segundo valor: ");
        double b = ler.nextDouble();

        if (a > b) {
            System.out.println("O primeiro valor é maior: " + a);
        } else {
            System.out.println("O segundo valor é maior: " + b);
        }
    }
}
