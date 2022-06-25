import java.util.Scanner;
public class codescopel2_ex01 {
    /* Escreva um programa para verificar se um ano é bissexto ou não.
       Se um ano é divisível por 4, então é bissexto, mas se o ano é centenário como 2000, 1900, 2100,
       então deve ser divisível por 400
       */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      System.out.print("Informe o ano: ");
      int ano = ler.nextInt();

      if (ano % 400 == 0) {
          System.out.println("O ano é centenário e bissexto");
      } else if (ano % 4 == 0) {
          System.out.println("O ano é bissexto");
      } else {
          System.out.println("O ano nao é bissexto e nem centenário");
      }
    }
}
