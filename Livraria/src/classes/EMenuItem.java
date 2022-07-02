package classes;

public enum EMenuItem {
    VOLTAR(0 , "Voltar"),
    VER_AVALIACAO(1, "Ver Avaliacoes"),
    AVALIAR_ITEM(2, "Avaliar"),
    MOSTRAR_DETALHES(3, "Mostrar Detalhes");

    private int valorOpcao;
    private String descricao;

    EMenuItem(int valorOpcao, String descricao){
        this.valorOpcao = valorOpcao;
        this.descricao = descricao;
    }

    public static EMenuItem getByValorOpcao(int valorOpcao){
        for(EMenuItem e : EMenuItem.values()){
            if (e.getValorOpcao() == valorOpcao){
                return e;
            }
        }
        return null;
    }

    //GETTERS AND SETTERS

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
