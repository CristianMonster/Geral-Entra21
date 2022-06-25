import java.util.Scanner;
public class logica_exercicio4 {
    //Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
    //meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
    //Considerar ano com 365 dias e mês com 30 dias.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idadeAno;
        int idadeMes;
        int idadeDia;
        System.out.print("Informe quantos anos vividos: ");
        idadeAno = ler.nextInt();
        System.out.print("Informe quantos mêses vividos: ");
        idadeMes = ler.nextInt();
        System.out.print("Informe quantos dias vividos: ");
        idadeDia = ler.nextInt();

        int idadeTotalemDias = (idadeAno * 365) + (idadeMes * 30) + idadeDia;
        System.out.println("A sua idade total em dias é " + idadeTotalemDias);
    }
}
