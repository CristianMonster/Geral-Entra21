package Classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {
        for (NaipeEnum naipe : NaipeEnum.values()) {
            int valorCarta = 1;
            for(ValorCartaEnum valor : ValorCartaEnum.values()){
                Carta c = new Carta();
                c.setNaipe(naipe);
                c.setValorcarta(valor);
                c.setValorReal(valorCarta);
                cartas.add(c);
                valorCarta++;
            }
        }
        shuffle();
    }

    //----------------------------Gatters and setters----------------------------
    public void shuffle(){
        Collections.shuffle(this.cartas); //vai embaralhar as cartas
    }

    public Carta getFromTop(){
        return this.cartas.remove(0);
    }

    public Carta getFromBottom(){
        return this.cartas.remove(this.cartas.size()-1);
    }

    public Carta searchCard(NaipeEnum naipe, ValorCartaEnum valor){
        return this.cartas.stream().filter(
                carta -> naipe.equals(carta.getNaipe()) && valor.equals(carta.getValorcarta())
        ).findFirst().orElse(null); // ta filtrando e retornando o primeiro ou null
        /*for (Carta c: cartas){
            if (c.getNaipe().equals(naipe) && c.getValorcarta() == valor){
                return c;
            }
        }
        return null;*/
    }

    public Carta searchCard(NaipeEnum naipe, int valorReal){
        return this.cartas.stream().filter(carta -> naipe.equals(carta.getNaipe()) && valorReal == (carta.getValorReal())).findFirst().orElse(null); // ta filtrando e retornando o primeiro ou null
    } //com colletions sempre vamos utilizar esse stram

    //getter and setter

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
