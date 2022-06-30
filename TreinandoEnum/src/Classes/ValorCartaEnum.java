package Classes;

public enum ValorCartaEnum {
    UM("A"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    ONZE("J"),
    DOZE("Q"),
    TREZE("K");

    private final String descricao;

    ValorCartaEnum(String descricao) {
        this.descricao = descricao;
    }

    //GATTER
    public String getDescricao() {
        return descricao;
    }
}
