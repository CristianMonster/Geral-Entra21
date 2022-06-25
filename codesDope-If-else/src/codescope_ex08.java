import java.util.Scanner;
public class codescope_ex08 {
    public static void main(String[] args) {
        //O aluno não poderá fazer o exame se sua frequência for inferior a 75%.
        //Pegue a seguinte entrada do usuário
        //Número de aulas realizadas
        //Número de aulas atendidas.
        //E imprima a
        //porcentagem da aula frequentada
        //.O aluno pode ou não fazer o exame.
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o numero de aulas realizadas pelo aluno: ");
        double aulasRealizadas =  ler.nextInt();
        System.out.print("Informe o numero de aulas atendidas: ");
        double aulasAtendidas = ler.nextInt();
        double frequencia = (aulasRealizadas * 100)/aulasAtendidas;
        if (frequencia >= 75) {
            System.out.printf("Você teve: %.2f %% de frequência, esta apto à fazer o exame.", frequencia);
        } else {
            System.out.printf("Você teve: %.2f %% de frequência, não esta apto à fazer o exame.", frequencia);
        }
    }
}
