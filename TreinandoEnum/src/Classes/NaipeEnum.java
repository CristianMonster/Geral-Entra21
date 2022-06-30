package Classes;

public enum NaipeEnum {
    PAUS("Paus"),
    ESPADAS("Espadas"),
    COPAS("Copas"),
    OURO("Ouro");

    public final String naipe;

    NaipeEnum(String naipe) {
        this.naipe = naipe;
    }

    //GATTER
    public String getNaipe() {
        return naipe;
    }
}

