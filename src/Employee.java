/*public class Employee {
    private String typeofemployee; //typeofemployee; Type d’employé;Nourrisseur/ Gardien (entretien)
    private int nbrofbadge; //nbrofbadge; No badge de l’employé
    private String lastname; //lastname; Nom de l'employé
    private String firstname; //firstname; Prénom de l'employé

    public Employee () {}
    public Employee (String aTypeofemployee, int aNbrofbadge, String aLastname, String aFirstname){
        typeofemployee = aTypeofemployee;
        nbrofbadge = aNbrofbadge;
        lastname = aLastname;
        firstname = aFirstname;}

    public void setTypeofemployee(String typeofemployee) {this.typeofemployee = typeofemployee;}
    public String getTypeofemployee() {return typeofemployee;}

    public void setNbrofbadge(int nbrofbadge) {this.nbrofbadge = nbrofbadge;}
    public int getNbrofbadge() {return nbrofbadge;}

    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getLastname() {return lastname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getFirstname() {return firstname;}

    @Override
    public String toString(){
        String txt = "";
        txt += "Type d’employé: " + getTypeofemployee() + " ";//Vétérinaire ou nourrisseur
        txt += "No badge de l’employé: " + getNbrofbadge() + " ";//No badge de l’employé aléatoire
        txt += "Nom de l'employé: " + getLastname() + " ";//Nom de famille
        txt += "Prénom de l'employé: " + getFirstname() + " ";//Prénom
        return txt;
    }
}*/
public class Employee {
    private String typeofemployee; //typeofemployee; Type d’employé;Nourrisseur/ Gardien (entretien)
    private int nbrofbadge; //nbrofbadge; No badge de l’employé
    private String lastname; //lastname; Nom de l'employé
    private String firstname; //firstname; Prénom de l'employé

    public Employee () {}
    public Employee (String aTypeofemployee, int aNbrofbadge, String aLastname, String aFirstname){
        typeofemployee = aTypeofemployee;
        nbrofbadge = aNbrofbadge;
        lastname = aLastname;
        firstname = aFirstname;}

    public void setTypeofemployee(String typeofemployee) {this.typeofemployee = typeofemployee;}
    public String getTypeofemployee() {return typeofemployee;}

    public void setNbrofbadge(int nbrofbadge) {this.nbrofbadge = nbrofbadge;}
    public int getNbrofbadge() {return nbrofbadge;}

    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getLastname() {return lastname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getFirstname() {return firstname;}

    @Override
    public String toString(){
        String txt = "";
        txt += "Type d’employé: " + getTypeofemployee() + " ";//Vétérinaire ou nourrisseur
        txt += "No badge de l’employé: " + getNbrofbadge() + " ";//No badge de l’employé aléatoire
        txt += "Nom de l'employé: " + getLastname() + " ";//Nom de famille
        txt += "Prénom de l'employé: " + getFirstname() + " ";//Prénom
        return txt;
    }
}