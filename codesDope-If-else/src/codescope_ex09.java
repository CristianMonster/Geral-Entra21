import java.util.Objects;
import java.util.Scanner;
public class codescope_ex09 {
    //Modifique a pergunta acima para permitir que o aluno se sente se tiver uma causa médica.
    //Pergunte ao usuário se ele tem causa médica ou não ( 'S' ou 'N') e imprima de acordo.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o numero de aulas realizadas pelo aluno: ");
        int aulasRealizadas =  ler.nextInt();
        System.out.print("Informe o numero de aulas atendidas: ");
        int aulasAtendidas = ler.nextInt();
        int frequencia = (aulasRealizadas * 100)/aulasAtendidas;
        System.out.print("Informe se você tem clausula médica usando S para sim, e N para não: ");
        String clausula = ler.next();
        if (frequencia >= 75) {
            System.out.println("Você teve: " + frequencia + "% de frequência, esta apto à fazer o exame.");
        } else if (clausula.equals("S")){
            System.out.println("Você teve: " + frequencia + "% de frequência, não estaria apto à fazer o exame, mas como vocè tem clausula médica está liberado.");
        } else {
            System.out.println("Você teve: " + frequencia + "% de frequência, não esta apto à fazer o exame e não tem clausula médica.");
        }
    }
}
