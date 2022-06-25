import java.util.Scanner;
public class codescope_ex06 {
    public static void main(String[] args) {
        //Tome a entrada de idade de 3 pessoas pelo usuário e determine o mais velho e o mais novo entre eles.
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a primeira idade: ");
        int idade1 = ler.nextInt();
        System.out.print("Informe a segunda idade: ");
        int idade2 = ler.nextInt();
        System.out.print("Informe a terceira idade: ");
        int idade3 = ler.nextInt();

        if (idade1 > idade2 && idade2 > idade3) {
            System.out.println("A pessoa mais velha tem: " + idade1 + " anos, e a mais nova: " + idade3 + " anos");
        } else if (idade1 > idade3 && idade3 > idade2) {
            System.out.println("A pessoa mais velha tem: " + idade1 + " anos, e a mais nova: " + idade2 + " anos");
        } else if (idade2 > idade1 && idade1 > idade3) {
            System.out.println("A pessoa mais velha tem: " + idade2 + " anos, e a mais nova: " + idade3 + " anos");
        } else if (idade2 > idade3 && idade3 > idade1) {
            System.out.println("A pessoa mais velha tem: " + idade2 + " anos, e a mais nova: " + idade1 + " anos");
        } else if (idade3 > idade2 && idade2 > idade1) {
            System.out.println("A pessoa mais velha tem: " + idade3 + " anos, e a mais nova: " + idade1 + " anos");
        } else if (idade3 > idade1 && idade1 > idade2){
            System.out.println("A pessoa mais velha tem: " + idade3 + " anos, e a mais nova: " + idade2 + " anos");
        }
    }
}
