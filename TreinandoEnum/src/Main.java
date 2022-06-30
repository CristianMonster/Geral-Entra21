import Classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> bar = new ArrayList<>();

        for (NaipeEnum naipe : NaipeEnum.values()) {
            for(ValorCartaEnum valor : ValorCartaEnum.values()){
                Carta c = new Carta();
                c.setNaipe(naipe);
                c.setValorcarta(valor);
                bar.add(c);
            }
        }
        for (Carta c : bar){
            System.out.println(c.getValorcarta().getDescricao() + " de " +c.getNaipe().getNaipe());
        }
    }
}
