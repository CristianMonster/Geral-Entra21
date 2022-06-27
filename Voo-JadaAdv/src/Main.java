import classes.*;
public class Main  {
    public static void main(String[] args) {
        executaVoo();
    }

    public static void executaOnibus(){
        Onibus teste = new Onibus(5);
        teste.getAssento("12").ocupar();
        teste.mostrarAssentos();
    }

    public static void executaVoo(){
        Aviao teste = new Aviao(4, 2);
        teste.mostrarAssentos();
    }
}
