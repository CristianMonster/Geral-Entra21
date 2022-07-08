package classes;

public enum ETipoLanche {
    X_SALADA(1, "X-Salada"),
    X_BURGUER(2, "X-Burguer"),
    MISTO_QUENTE(3, "Misto Quente"),
    HOT_DOG(4, "Hot Dog"),
    MINI_PIZZA(5, "Mini Pizza"),
    PIZZA(6, "Pizza");

    private int valorOpcao;
    private String descricao;

    ETipoLanche(int valorOpcao, String descricao){
        this.valorOpcao = valorOpcao;
        this.descricao = descricao;
    }

    public static ETipoLanche getByValorOpcao(int escolha){
        for (ETipoLanche e : ETipoLanche.values()){
            if (e.getValorOpcao() == escolha){
                return e;
            }
        }
        return null;
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
