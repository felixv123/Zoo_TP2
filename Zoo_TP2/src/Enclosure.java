public class Enclosure {
    private String zonename; //zonename; Nom de zone
    private String nbrofenclosure; //nbrofenclosure; Numéro d’enclos
    private String typeofenclosure; //typeofenclosure; type de d'enclos;Confinement à barreaux/ Confinement sans barreaux / Enclos ouvert (protégé par des douves)
    private String sizeofenclosure; //sizeofenclosure; Grandeur des cages(petite, moyenne, grande)
    public Enclosure () {}
    public Enclosure (String aZonename, String aNbrofenclosure, String aTypeofenclosure, String aSizeofenclosure){
        zonename = aZonename;
        nbrofenclosure = aNbrofenclosure;
        typeofenclosure = aTypeofenclosure;
        sizeofenclosure = aSizeofenclosure;}

    public void setZonename(String zonename) {this.zonename = zonename;}
    public String getZonename() {return zonename;}

    public void setNbrofenclosure(String nbrofenclosure) {this.nbrofenclosure = nbrofenclosure;}
    public String getNbrofenclosure() {return nbrofenclosure;}

    public void setTypeofenclosure(String typeofenclosure) {this.typeofenclosure = typeofenclosure;}
    public String getTypeofenclosure() {return typeofenclosure;}

    public void setSizeofenclosure(String sizeofenclosure) {this.sizeofenclosure = sizeofenclosure;}
    public String getSizeofenclosure() {return sizeofenclosure;}

    @Override
    public String toString(){
        String txt = "";
        txt += "Nom de zone: " + getZonename() + " ";//Herbivores, Carnivores ou Omnivores
        txt += "Numéro d’enclos: " + getNbrofenclosure() + " ";//Herbi, Carni1, etc.
        txt += "Type de d'enclos: " + getTypeofenclosure() + " ";//à barreaux ou sans, ou avec douves
        txt += "Grandeur des cages(petite, moyenne, grande): " + getSizeofenclosure() + " ";//petite, moyenne, grande
        return txt;

    }
}
