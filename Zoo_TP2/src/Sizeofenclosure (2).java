public enum Sizeofenclosure {
    PETITE ("C'est une petite enclos"),
    MOYENNE ("C'est une moyenne enclos"),
    GRANDE ("C'est une grande enclos");

    String msg;

    Sizeofenclosure(String sizeofenclosure) {
        this.msg = sizeofenclosure;
    }

    public String getMsg() {
        return msg;
    }
}
