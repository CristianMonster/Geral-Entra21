package Classes;

public enum PlayerOption {
    ONEMORE,
    STOP,
    DOUBLECARD,
    EXIT,
    ;
    private int value;

    private String description;

    //----------------------------Gatters and setters----------------------------

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
