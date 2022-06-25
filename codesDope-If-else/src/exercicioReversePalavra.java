import java.util.Scanner;
public class exercicioReversePalavra {
    public static void main(String[] args) {
        exe02();
    }

    public static void exe02(){
        Scanner lew = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String palavra = lew.nextLine();

        String reverse = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverse += palavra.charAt(i);
        }

        //reverse = new StringBuilder(palavra).reverse().toString();

        if (reverse.equals(palavra)) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Nao é palídramo");
        }
    }
}