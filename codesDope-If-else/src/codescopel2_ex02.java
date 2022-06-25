import java.util.Scanner;
public class codescopel2_ex02 {
    /*Peça ao usuário para inserir idade, sexo ( M ou F ), em seguida,
    usando as seguintes regras, imprima seu local de serviço.
    se a funcionária for do sexo feminino, ela trabalhará apenas em áreas urbanas.
    se o empregado for do sexo masculino e a idade estiver entre 20 e 40 anos, ele poderá trabalhar em qualquer lugar
    se o empregado for do sexo masculino e a idade estiver entre 40 e 60 anos, ele trabalhará apenas em áreas urbanas.
    E qualquer outra entrada de idade deve imprimir "ERRO" %d*/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        int idade = ler.nextInt();
        System.out.print("Informe o seu sexo, utilizando M para masculino e F para feminino: ");
        String sexo = ler.next();

        if (sexo.equals("F")) {
            System.out.println("Você, por ser mulher, só pode trabalhar apenas em áreas urbanas");
        } else if (sexo.equals("M") && idade >=20 && idade <= 40) {
            System.out.println("Você pode trabalhar em qualquer lugar");
        } else if (sexo.equals("M") && idade > 40 && idade <= 60) {
            System.out.println("Você, por conta da sua idade, só pode trabalhar em áreas urbanas");
        } else {
            System.out.println("ERRO!");
        }
    }
}
