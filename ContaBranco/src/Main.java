import classes.ContaBanco;
public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.estadoAtual();
        p1.abrirConta("CC");

    }
}
