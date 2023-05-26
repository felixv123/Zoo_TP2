/*public enum Exotic {
    Panda ("C'est un panda"),
    Paresseux ("C'est un paresseux"),
    Elephant ("C'est un éléphant"),
    Hippopotame ("C'est un hippopotame"),
    Lion ("C'est un lion"),
    Lionne ("C'est un lionne"),
    Zebre ("C'est un zèbre"),
    Kangourou ("C'est un kangourou"),
    Tigre ("C'est un tigre");
    String msg;

    Exotic(String exotic) {
        this.msg = exotic;
    }

    public String getMsg() {
        return msg;
    }
}*/
public enum Exotic {
    PANDA ("C'est un panda"),
    PARESSEUX ("C'est un paresseux"),
    ÉLÉPHANT ("C'est un éléphant"),
    HIPPOPOTAME ("C'est un hippopotame"),
    LION ("C'est un lion"),
    LIONNE ("C'est un lionne"),
    ZÈBRE ("C'est un zèbre"),
    KANGOUROU ("C'est un kangourou"),
    //ZÈBRE ("C'est un zèbre"),
    TIGRE ("C'est un tigre");
    String msg;

    Exotic(String exotic) {
        this.msg = exotic;
    }

    public String getMsg() {
        return msg;
    }
}