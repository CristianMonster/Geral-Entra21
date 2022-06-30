package Classes;

import java.util.ArrayList;

public class Carta {
    NaipeEnum naipe;
    ValorCartaEnum valorcarta;

    @Override
    public String toString() {
        return super.toString();
    }

    //GATTER AND SETTER
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
}
