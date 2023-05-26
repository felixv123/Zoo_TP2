public class Food {
    private String stock; //stock; Stock (lbs, balles, boisseaux)
    private String frequency; //frequency; Fréquence des rations
    private String typeOffood; //typeOfood; Type d’aliment
    public Food () {}
    public Food (String aStock, String aFrequency, String aTypeOffood) {
        stock = aStock;
        frequency = aFrequency;
        typeOffood = aTypeOffood;}

    public void setStock(String stock) {this.stock = stock;}
    public String getStock() {return stock;}

    public void setFrequency(String frequency) {this.frequency = frequency;}
    public String getFrequency() {return frequency;}

    public void setTypeOffood(String typeOffood) {this.typeOffood = typeOffood;}
    public String getTypeOffood() {return typeOffood;}

    @Override
    public String toString(){
        String txt = "";
        txt += "Stock (lbs, balles, boisseaux): " + getStock() + " ";//quantité back store
        txt += "Fréquence des rations: " + getFrequency() + " ";//le nombre de portions par jour total pour tous les animaux
        txt += "Type d’aliment: " + getTypeOffood() + " ";//omnivore,carnivore ou herbivore
        return txt;
    }
}
