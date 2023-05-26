/*public class Animal {
    private String exotic; //exotic; Exotiques
    private String domestic; //domestic; Domestiques
    private String species; //species; Espèces (catégories)
    private String animalname; //animal name; Nom de l’animal (nouveau ou pas)
    private int fqpd; //fqpd = Food quantity per day; Quantité nourriture par jour
    private String gender; //gender; Genre de l’animal
    private String socialgroup; //socialgroup; Groupe social
    private String employee; //employee;Employé
    private int ad; //ad = arrival date; date d'arrivée de l'animal
    private int dob; //DOB = date of birth; date de naissance
    private String wb; //WB = where is birth; lieu de naissance

    public Animal() {
    }

    public Animal(String aExotic, String aDomestic, String aSpecies, String aAnimalname, int aFqpd, String aGender, String aSocialgroup, String aEmployee, int aAd, int aDob, String aWb) {
        exotic = aExotic;
        domestic = aDomestic;
        species = aSpecies;
        animalname = aAnimalname;
        fqpd = aFqpd;
        gender = aGender;
        socialgroup = aSocialgroup;
        employee = aEmployee;
        ad = aAd;
        dob = aDob;
        wb = aWb;}

    public void setExotic(String exotic) {this.exotic = exotic;}
    public String getExotic() {return exotic;}

    public void setDomestic(String domestic) {this.domestic = domestic;}
    public String getDomestic() {return domestic;}

    public void setSpecies(String species) {this.species = species;}
    public String getSpecies() {return species;}

    public void setAnimalname(String animalname) {this.animalname = animalname;}
    public String getAnimalname() {return animalname;}

    public void setFqpd(int fqpd) {this.fqpd = fqpd;}
    public int getFqpd() {return fqpd;}

    public void setGender(String gender) {this.gender = gender;}
    public String getGender() {return gender;}

    public void setSocialgroup(String socialgroup) {this.socialgroup = socialgroup;}
    public String getSocialgroup() {return socialgroup;}

    public void setEmployee(String employee) {this.employee = employee;}
    public String getEmployee() {return employee;}

    public void setAd(int ad) {this.ad = ad;}
    public int getAd() {return ad;}

    public void setDob(int dob) {this.dob = dob;}
    public int getDob() {return dob;}

    public void setWb(String wb) {this.wb = wb;}
    public String getWb() {return wb;}

    @Override
    public String toString() {
        String txt = "";
        txt += "C'est un animal exotique: " + getExotic();//catégorie d'animal
        txt += "C'est un animal domestique: " + getDomestic();//catégorie d'animal
        txt += "L'espèce de l'animal: " + getSpecies();//espèce d'animal
        txt += "Nom: " + getAnimalname();//nom d'animal
        txt += "Quantité de nourriture par jour: " + getFqpd();//la nourriture par jour
        txt += "Genre de l’animal: " + getGender();// male ou femelle
        txt += "Groupe social: " + getSocialgroup();//enfant ou adulte
        txt += "L'employé qui s'occupe de l'animal: " + getEmployee();//le nom de l'employé
        txt += "Date d'arrivée de l'animal: " + getAd();//date arrivé au zoo de la gaspésie
        txt += "Date de naissance: " + getDob();//date de naissance
        txt += "Lieu de naissance: " + getWb();//où est-il née
        return txt;
    }
}*/
/*public class Animal {
    private String exotic; //exotic; Exotiques
    private String domestic; //domestic; Domestiques
    private String species; //species; Espèces (catégories)
    private String animalname; //animal name; Nom de l’animal (nouveau ou pas)
    private int fqpd; //fqpd = Food quantity per day; Quantité nourriture par jour
    private String gender; //gender; Genre de l’animal
    private String socialgroup; //socialgroup; Groupe social
    private String employee; //employee;Employé
    private String ad; //ad = arrival date; date d'arrivée de l'animal
    private String dob; //DOB = date of birth; date de naissance
    private String wb; //WB = where is birth; lieu de naissance

    public Animal() {
    }

    public Animal(String aExotic, String aDomestic, String aSpecies, String aAnimalname, int aFqpd, String aGender, String aSocialgroup, String aEmployee, String aAd, String aDob, String aWb) {
        exotic = aExotic;
        domestic = aDomestic;
        species = aSpecies;
        animalname = aAnimalname;
        fqpd = aFqpd;
        gender = aGender;
        socialgroup = aSocialgroup;
        employee = aEmployee;
        ad = aAd;
        dob = aDob;
        wb = aWb;}

    public void setExotic(String exotic) {this.exotic = exotic;}
    public String getExotic() {return exotic;}

    public void setDomestic(String domestic) {this.domestic = domestic;}
    public String getDomestic() {return domestic;}

    public void setSpecies(String species) {this.species = species;}
    public String getSpecies() {return species;}

    public void setAnimalname(String animalname) {this.animalname = animalname;}
    public String getAnimalname() {return animalname;}

    public void setFqpd(int fqpd) {this.fqpd = fqpd;}
    public int getFqpd() {return fqpd;}

    public void setGender(String gender) {this.gender = gender;}
    public String getGender() {return gender;}

    public void setSocialgroup(String socialgroup) {this.socialgroup = socialgroup;}
    public String getSocialgroup() {return socialgroup;}

    public void setEmployee(String employee) {this.employee = employee;}
    public String getEmployee() {return employee;}

    public void setAd(String ad) {this.ad = ad;}
    public String getAd() {return ad;}

    public void setDob(String dob) {this.dob = dob;}
    public String getDob() {return dob;}

    public void setWb(String wb) {this.wb = wb;}
    public String getWb() {return wb;}

    @Override
    public String toString() {
        String txt = "";
        txt += "C'est un animal exotique: " + getExotic() + " "; //catégorie d'animal
        txt += "C'est un animal domestique: " + getDomestic() + " ";//catégorie d'animal
        txt += "L'espèce de l'animal: " + getSpecies() + " ";//espèce d'animal
        txt += "Nom: " + getAnimalname() + " ";//nom d'animal
        txt += "Quantité de nourriture par jour: " + getFqpd() + " ";//la nourriture par jour
        txt += "Genre de l’animal: " + getGender() + " ";// male ou femelle
        txt += "Groupe social: " + getSocialgroup() + " ";//enfant ou adulte
        txt += "L'employé qui s'occupe de l'animal: " + getEmployee() + " ";//le nom de l'employé
        txt += "Date d'arrivée de l'animal: " + getAd() + " ";//date arrivé au zoo de la gaspésie
        txt += "Date de naissance: " + getDob() + " ";//date de naissance
        txt += "Lieu de naissance: " + getWb() + " ";//où est-il née
        return txt;
    }
}*/
/*public class Animal {
    private String exotic; //exotic; Exotiques
    private String domestic; //domestic; Domestiques
    private String species; //species; Espèces (catégories)
    private String animalname; //animal name; Nom de l’animal (nouveau ou pas)
    private int fqpd; //fqpd = Food quantity per day; Quantité nourriture par jour
    private String gender; //gender; Genre de l’animal
    private String socialgroup; //socialgroup; Groupe social
    private String employee; //employee;Employé
    private int ad; //ad = arrival date; date d'arrivée de l'animal
    private int dob; //DOB = date of birth; date de naissance
    private String wb; //WB = where is birth; lieu de naissance

    public Animal() {
    }

    public Animal(String aExotic, String aDomestic, String aSpecies, String aAnimalname, int aFqpd, String aGender, String aSocialgroup, String aEmployee, int aAd, int aDob, String aWb) {
        exotic = aExotic;
        domestic = aDomestic;
        species = aSpecies;
        animalname = aAnimalname;
        fqpd = aFqpd;
        gender = aGender;
        socialgroup = aSocialgroup;
        employee = aEmployee;
        ad = aAd;
        dob = aDob;
        wb = aWb;}

    public void setExotic(String exotic) {this.exotic = exotic;}
    public String getExotic() {return exotic;}

    public void setDomestic(String domestic) {this.domestic = domestic;}
    public String getDomestic() {return domestic;}

    public void setSpecies(String species) {this.species = species;}
    public String getSpecies() {return species;}

    public void setAnimalname(String animalname) {this.animalname = animalname;}
    public String getAnimalname() {return animalname;}

    public void setFqpd(int fqpd) {this.fqpd = fqpd;}
    public int getFqpd() {return fqpd;}

    public void setGender(String gender) {this.gender = gender;}
    public String getGender() {return gender;}

    public void setSocialgroup(String socialgroup) {this.socialgroup = socialgroup;}
    public String getSocialgroup() {return socialgroup;}

    public void setEmployee(String employee) {this.employee = employee;}
    public String getEmployee() {return employee;}

    public void setAd(int ad) {this.ad = ad;}
    public int getAd() {return ad;}

    public void setDob(int dob) {this.dob = dob;}
    public int getDob() {return dob;}

    public void setWb(String wb) {this.wb = wb;}
    public String getWb() {return wb;}

    @Override
    public String toString() {
        String txt = "";
        txt += "C'est un animal exotique: " + getExotic();//catégorie d'animal
        txt += "C'est un animal domestique: " + getDomestic();//catégorie d'animal
        txt += "L'espèce de l'animal: " + getSpecies();//espèce d'animal
        txt += "Nom: " + getAnimalname();//nom d'animal
        txt += "Quantité de nourriture par jour: " + getFqpd();//la nourriture par jour
        txt += "Genre de l’animal: " + getGender();// male ou femelle
        txt += "Groupe social: " + getSocialgroup();//enfant ou adulte
        txt += "L'employé qui s'occupe de l'animal: " + getEmployee();//le nom de l'employé
        txt += "Date d'arrivée de l'animal: " + getAd();//date arrivé au zoo de la gaspésie
        txt += "Date de naissance: " + getDob();//date de naissance
        txt += "Lieu de naissance: " + getWb();//où est-il née
        return txt;
    }
}*/
public class Animal {
    private String exotic; //exotic; Exotiques
    private String domestic; //domestic; Domestiques
    private String species; //species; Espèces (catégories)
    private String animalname; //animal name; Nom de l’animal (nouveau ou pas)
    private int fqpd; //fqpd = Food quantity per day; Quantité nourriture par jour
    private String gender; //gender; Genre de l’animal
    private String socialgroup; //socialgroup; Groupe social
    private String employee; //employee;Employé
    private String ad; //ad = arrival date; date d'arrivée de l'animal
    private String dob; //DOB = date of birth; date de naissance
    private String wb; //WB = where is birth; lieu de naissance

    public Animal() {
    }

    public Animal(String aExotic, String aDomestic, String aSpecies, String aAnimalname, int aFqpd, String aGender, String aSocialgroup, String aEmployee, String aAd, String aDob, String aWb) {
        exotic = aExotic;
        domestic = aDomestic;
        species = aSpecies;
        animalname = aAnimalname;
        fqpd = aFqpd;
        gender = aGender;
        socialgroup = aSocialgroup;
        employee = aEmployee;
        ad = aAd;
        dob = aDob;
        wb = aWb;}

    public void setExotic(String exotic) {this.exotic = exotic;}
    public String getExotic() {return exotic;}

    public void setDomestic(String domestic) {this.domestic = domestic;}
    public String getDomestic() {return domestic;}

    public void setSpecies(String species) {this.species = species;}
    public String getSpecies() {return species;}

    public void setAnimalname(String animalname) {this.animalname = animalname;}
    public String getAnimalname() {return animalname;}

    public void setFqpd(int fqpd) {this.fqpd = fqpd;}
    public int getFqpd() {return fqpd;}

    public void setGender(String gender) {this.gender = gender;}
    public String getGender() {return gender;}

    public void setSocialgroup(String socialgroup) {this.socialgroup = socialgroup;}
    public String getSocialgroup() {return socialgroup;}

    public void setEmployee(String employee) {this.employee = employee;}
    public String getEmployee() {return employee;}

    public void setAd(String ad) {this.ad = ad;}
    public String getAd() {return ad;}

    public void setDob(String dob) {this.dob = dob;}
    public String getDob() {return dob;}

    public void setWb(String wb) {this.wb = wb;}
    public String getWb() {return wb;}

    @Override
    public String toString() {
        String txt = "";
        txt += "C'est un animal exotique: " + getExotic() + " "; //catégorie d'animal
        txt += "C'est un animal domestique: " + getDomestic() + " ";//catégorie d'animal
        txt += "L'espèce de l'animal: " + getSpecies() + " ";//espèce d'animal
        txt += "Nom: " + getAnimalname() + " ";//nom d'animal
        txt += "Quantité de nourriture par jour: " + getFqpd() + " ";//la nourriture par jour
        txt += "Genre de l’animal: " + getGender() + " ";// male ou femelle
        txt += "Groupe social: " + getSocialgroup() + " ";//enfant ou adulte
        txt += "L'employé qui s'occupe de l'animal: " + getEmployee() + " ";//le nom de l'employé
        txt += "Date d'arrivée de l'animal: " + getAd() + " ";//date arrivé au zoo de la gaspésie
        txt += "Date de naissance: " + getDob() + " ";//date de naissance
        txt += "Lieu de naissance: " + getWb() + " ";//où est-il née
        return txt;
    }
}