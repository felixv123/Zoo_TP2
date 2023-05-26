public enum Domestic {
    CHEVAL ("C'est un cheval"),
    LAPIN ("C'est un lapin"),
    CHIEN ("C'est un chien"),
    COCHON ("C'est un "),
    //Lapin ("C'est un lapin"),
    HAMSTER ("C'est un hamster"),
    //Hamster ("C'est un hamster"),
    //Cheval ("C'est un  cheval"),
    GRENOUILLE ("C'est une grenouille"),
    TORTUE ("C'est une tortue");

    String msg;

    Domestic(String domestic) {
        this.msg = domestic;
    }

    public String getMsg() {
        return msg;
    }
}
