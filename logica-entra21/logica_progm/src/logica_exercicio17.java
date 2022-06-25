import java.util.Scanner;
public class logica_exercicio17 {
    /*
    Ler a hora de início e a hora de fim de um jogo de Xadrez
    (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas,
    sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar
    em um dia e terminar no dia seguinte.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horaInicio;
        int horaFim;
        int tempoJogo;
        System.out.println("Informe a hora que o jogo iniciou: ");
        horaInicio = ler.nextInt();
        System.out.println("Informe a hora que o jogo terminou: ");
        horaFim = ler.nextInt();

        if (horaInicio > horaFim) {
            tempoJogo = horaInicio - horaFim;
            System.out.print("O total de horás jogadas foi de: " + tempoJogo + " horas");
        } else {
            tempoJogo = horaFim - horaInicio;
            System.out.print("O total de horás jogadas foi de: " + tempoJogo + " horas");
        }
    }
}
