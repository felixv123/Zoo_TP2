public enum Typeofenclosure {
    CONFINEMENTABARREAUX ("C'est un confinement à barreaux"),
    CONFINEMENTSANSBARREAUX ("C'est un confinement sans barreaux"),
    ENCLOSOUVERT ("C'est un enclos ouvert");
    String msg;

    Typeofenclosure(String typeofenclosure) {
        this.msg = typeofenclosure;
    }

    public String getMsg() {
        return msg;
    }
}
