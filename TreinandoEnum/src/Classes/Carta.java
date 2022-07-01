package Classes;

import java.util.ArrayList;

public class Carta {
    NaipeEnum naipe;
    ValorCartaEnum valorcarta;
    private int valorReal = Integer.valueOf(valorcarta.getDescricao());

    @Override
    public String toString() {
        return super.toString();
    }

    //----------------------------Getters and setters----------------------------
    public NaipeEnum getNaipe() {
        return naipe;
    }

    public void setNaipe(NaipeEnum naipe) {
        this.naipe = naipe;
    }

    public ValorCartaEnum getValorcarta() {
        return valorcarta;
    }

    public void setValorcarta(ValorCartaEnum valorcarta) {
        this.valorcarta = valorcarta;
    }

    public int getValorReal() {
        return valorReal;
    }

    public void setValorReal(int valorReal) {
        this.valorReal = valorReal;
    }
}
