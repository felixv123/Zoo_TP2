/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Comparator.comparing;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Animal//
        //Création d'objet selon les besoins
        Scanner sc = new Scanner(System.in);
        ArrayList< Animal > arrayOfAnimal = new ArrayList< Animal >();
        String exotic,domestic,species,animalname,gender,socialgroup,employee,wb;
        int fqpd,ad,dob;
        Animal animal1 = new Animal("Oui","Non","Singe","Biscuit le singe","2","Femelle","Enfant","Martin François","10/04/2020","10/04/2020", "Zoo de Gaspé");
        Animal animal2 = new Animal("Non","Oui","Chat","Félix le chat","2","Male","Adulte","Charlie Premier","05/08/2000","09/02/1996","SPCA de Montréal");
        Animal animal3 = new Animal("Oui","Non","Girafe","Melman la girafe","2","Male","Adulte","Martin François","05/09/2019","03/10/1998","Zoo dde New-York");
        Animal animal4 = new Animal("Oui","Non","Lion","Alex le lion","2","Male","Adulte","Martin François","05/09/2019","03/10/1998","Zoo dde New-York");
        Animal animal5 = new Animal("Non","Oui","Chien","Rintintin","2","Male","Enfant","Charlie Premier","25/12/2021","25/12/2021","Zoo de Gaspé");
        Animal animal6 = new Animal("Oui","Non","Hippopotame","Gloria","2","Femelle","Adulte","Martin François","30/06/2019","03/12/2000","Zoo dde New-York");
        Animal animal7 = new Animal("Non","Oui","Perroquet","Isis","2","Femelle","Enfant","Charlie Premier","04/05/2023","02/09/2022","SPCA de Québec");
        Animal animal8 = new Animal("Oui","Non","Marty","Zèbre","2","Male","Adulte","Martin François","05/09/2019","03/10/1998","Afrique");
        Animal animal9 = new Animal("Oui","Non","Pumbaa","Phacochère","2","Male","Adulte","Martin François","02/08/2019","01/01/1994","Afrique");
        Animal animal10 = new Animal("Oui","Non","Timon","Suricate","2","Male","Adulte","Martin François","02/08/2019","01/01/1994","Afrique");
        Animal animalajout = new Animal();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        //Création d'un tableau d'objets
        Animal listofAnimal[] ={ new Animal("Oui","Non","Singe","Bsicuit le singe","2","Femelle","Enfant","Martin François","10/04/2020","10/04/2020","Zoo de Gaspé"),
                    new Animal("Non","Oui","Chat","Félix le chat","2","Male","Adulte","Charlie Premier","05/08/2000","09/02/1996","SPCA de Montréal"),
                    new Animal("Oui","Non","Girafe","Melman la girafe","2","Male","Adulte","Martin François","05/09/2019","03/10/1998","Zoo de New-York"),
                    new Animal("Oui","Non","Lion","Alex le lion","2","Male","Adulte","Martin François","05/09/2019","03/10/1998","Zoo dde New-York"),
                    new Animal("Non","Oui","Chien","Rintintin","2","Male","Enfant","Charlie Premier","25/12/2021","25/12/2021","Zoo de Gaspé"),
                    new Animal("Oui","Non","Hippopotame","Gloria","2","Femelle","Adulte","Martin François","30/06/2019","03/12/2000","Zoo dde New-York"),
                    new Animal("Non","Oui","Perroquet","Isis","2","Femelle","Enfant","Charlie Premier","04/05/2023","02/09/2022","SPCA de Québec"),
                    new Animal("Oui","Non","Marty","Zèbre","2","Male","Adulte","Martin François","05/09/2019","03/10/1998","Afrique"),
                    new Animal("Oui","Non","Pumbaa","Phacochère","2","Male","Adulte","Martin François","02/08/2019","01/01/1994","Afrique"),
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");
        for (Animal myAnimal : listofAnimal ){
            System.out.println(myAnimal);}
        String loop = "YES";

        //Food//
        //Création d'objet selon les besoins
        Scanner sc = new Scanner(System.in);
        ArrayList< Food > arrayOfFood = new ArrayList< Food >();
        String stock,frequency,typeOffood;
        Food food1 = new Food("2 lbs","2","Omnivore");
        Food food2 = new Food("0.12 lbs","2","Omnivore");
        Food food3 = new Food("75 lbs","2","Herbivore");
        Food foodajout = new Food();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(food1);
        System.out.println(food2);
        System.out.println(food3);
        //Création d'un tableau d'objets
        Food listOfFood[] = { new Food("2 lbs","2","Omnivore"),
                    new Food("0.12 lbs","2","Omnivore"),
                    new Food("75 lbs","2","Herbivore")};
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");
        for (Food myFood : listOfFood ){
            System.out.println(myFood);}
        String loop = "YES";

        //Enclosure//
        //Création d'objet selon les besoins
        Scanner sc = new Scanner(System.in);
        ArrayList< Enclosure > arrayOfEnclosure = new ArrayList< Enclosure >();
        String zonename,typeofenclosure,sizeofemclosure,nbrofenclsoure;
        Enclosure enclosure1 = new Enclosure("Omnivores","Omni1","Confinements à barreaux","Moyenne");
        Enclosure enclosure2 = new Enclosure("Omnivores","Omni2","Confinements sans barreaux","Moyenne");
        Enclosure enclosure3 = new Enclosure("Herbivores","Herbi1","Confinemenr à barreaux et douves","Grande");
        Enclosure enclosureajout = new Enclosure();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(enclosure1);
        System.out.println(enclosure2);
        System.out.println(enclosure3);
        //Création d'un tableau d'objets
        Enclosure listOfEnclosure[] = { new Enclosure("Omnivores","Omni1","Confinements à barreaux","Moyenne"),
                        new Enclosure("Omnivores","Omni2","Confinements sans barreaux","Moyenne"),
                        new Enclosure("Herbivores","Herbi1","Confinemenr à barreaux et douves","Grande")};
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");
        for (Enclosure myEnclosure : listOfEnclosure ){
            System.out.println(myEnclosure);}
        String loop = "YES";

        //Employee//
        //Création d'objet selon les besoins
        Scanner sc = new Scanner(System.in);
        ArrayList< Employee > arrayOfEmployee = new ArrayList< Employee >();
        String typeofemployee,lastname,firstname;
        int nbrofbadge;
        Employee employee1 = new Employee("Nourrire","2569","François","Martin");
        Employee employee2 = new Employee("Nourrire","8594","Premier","Charlie");
        Employee employeeajout = new Employee();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(employee1);
        System.out.println(employee2);
        //Création d'un tableau d'objets
        Employee listOfEmployee[] = { new Employee("","","",""),
                        new Employee("","","","")};
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");
        for (Employee myEmployee : listOfEmployee ){
            System.out.println(myEmployee);}
        String loop = "YES";
    }
}*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        //Animal//
        //Création d'objet selon les besoins
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> arrayOfAnimal = new ArrayList<>();
        String exotic, domestic, species, animalnames, gender, socialgroup, employee, wb;
        int fqpds;
        String ad, dob;
        String loop = "YES";

        Animal animal1 = new Animal("Oui", "Non", "Singe", "Biscuit le singe", 2, "Femelle", "Enfant", "Martin François", "10/04/2020", "10/04/2020", "Zoo de Gaspé");
        Animal animal2 = new Animal("Non", "Oui", "Chat", "Félix le chat", 2, "Male", "Adulte", "Charlie Premier", "05/08/2000", "09/02/1996", "SPCA de Montréal");
        Animal animal3 = new Animal("Oui", "Non", "Girafe", "Melman la girafe", 2, "Male", "Adulte", "Martin François", "05/09/2019", "03/10/1998", "Zoo dde New-York");
        Animal animalajout = new Animal();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");


        //Food//
        //Création d'objet selon les besoins
        //Scanner sc = new Scanner(System.in);
        ArrayList<Food> arrayOfFood = new ArrayList<Food>();
        String stock, frequencys, typeOffood;
        //frequency = le nombre de portions par jour total pour tous les animaux
        Food food1 = new Food("550lbs", "2", "Omnivore");
        Food food2 = new Food("120lbs", "2", "Carnivore");
        Food food3 = new Food("300lbs", "2", "Herbivore");
        Food foodajout = new Food();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(food1);
        System.out.println(food2);
        System.out.println(food3);
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");
        //String loop = "YES";

        //Enclosure//
        //Création d'objet selon les besoins
        //Scanner sc = new Scanner(System.in);
        ArrayList<Enclosure> arrayOfEnclosure = new ArrayList<Enclosure>();
        String zonename, typeofenclosure, sizeofemclosure, nbrofenclsoure;
        Enclosure enclosure1 = new Enclosure("Omnivores", "Omni1", "Confinements à barreaux", "Moyenne");
        Enclosure enclosure2 = new Enclosure("Omnivores", "Omni2", "Confinements sans barreaux", "Moyenne");
        Enclosure enclosure3 = new Enclosure("Herbivores", "Herbi1", "Confinements à barreaux et douves", "Grande");
        Enclosure enclosureajout = new Enclosure();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(enclosure1);
        System.out.println(enclosure2);
        System.out.println(enclosure3);
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");
        //String loop = "YES";

        //Employee//
        //Création d'objet selon les besoins
        // Scanner sc = new Scanner(System.in);
        ArrayList<Employee> arrayOfEmployee = new ArrayList<Employee>();
        String typeofemployee, lastname, firstname;
        int nbrofbadges;
        Employee employee1 = new Employee("Nourrire", 2569, "François", "Martin");
        Employee employee2 = new Employee("Nourrire", 8594, "Premier", "Charlie");
        Employee employeeajout = new Employee();
        //Affichage des objets
        System.out.println("Affichage des objets");
        System.out.println(employee1);
        System.out.println(employee2);
        //Affichage du tableau d'objets
        System.out.println("\nAffichage du tableau d'objets");

        while (loop.equalsIgnoreCase("Yes")) {
            arrayOfAnimal.forEach((animalname) -> {
                System.out.println(animalname.getAnimalname());
            });
            arrayOfAnimal.forEach(System.out::println);
            try {
                File myObj = new File("Animal_list");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] split = data.split(",", 0);
                    int fqpd = Integer.parseInt(split[4]);
                    String specie = null;
                    if ((split[0].equalsIgnoreCase("Oui")) && (split[1].equalsIgnoreCase("Non"))) {
                        specie = String.valueOf(Exotic.valueOf(split[2].toUpperCase()));
                    } else specie = String.valueOf(Domestic.valueOf(split[2].toUpperCase()));
                  /*  if ((split[1] == "Oui") && (split[0] == "Non")) {
                        specie = String.valueOf(Domestic.valueOf(split[2].toUpperCase()));
                    } else specie = String.valueOf(Exotic.valueOf(split[2].toUpperCase()));*/
                    arrayOfAnimal.add(new Animal(split[0].toString(), split[1], specie, split[3], fqpd, split[5], split[6], split[7], split[8], split[9], split[10]));
                    //arrayOfAnimal.add(new Animal("Oui",split[1],specie,split[3],fqpd,split[5],split[6],split[7],split[8],split[9],split[10]));
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Une erreur est survenue: " + e);
                e.printStackTrace();
            }
            System.out.println("Après le transfert du fichier dans la liste:");
            arrayOfAnimal.forEach(System.out::println);
            arrayOfEmployee.forEach(nbrofbadge -> {
                System.out.println(nbrofbadge.getNbrofbadge());
            });
            arrayOfEmployee.forEach(System.out::println);
            try {
                File myObj = new File("Employee_list");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] split = data.split(",", 0);
                    int nbrofbadge = Integer.parseInt(split[1]);
                    arrayOfEmployee.add(new Employee(split[0], nbrofbadge, split[2], split[3]));
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Une erreur est survenue: " + e);
                e.printStackTrace();
            }
            arrayOfFood.forEach(frequency -> {
                System.out.println(frequency.getFrequency());
            });
            arrayOfFood.forEach(System.out::println);
            try {
                File myObj = new File("Food_list");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] split = data.split(",", 0);
                    arrayOfFood.add(new Food(split[0], split[1], split[2]));
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Une erreur est survenue: " + e);
                e.printStackTrace();
            }
            arrayOfEnclosure.forEach(nbrofenclosure -> {
                System.out.println(nbrofenclosure.getNbrofenclosure());
            });
            arrayOfFood.forEach(System.out::println);
            try {
                File myObj = new File("Enclosure_list");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] split = data.split(",", 0);
                    arrayOfEnclosure.add(new Enclosure(split[0], split[1], split[2], split[3]));
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Une erreur est survenue: " + e);
                e.printStackTrace();
            }
            System.out.println("Voulez-vous contiuer (YES or NO): ");
            loop= sc.next();
        }
    }

    public static int readInteger(String message, int min, int max ) {
        Scanner sc = new Scanner (System.in);
        System.out.println(message);
        while(true) {
            try {
                int result =Integer.parseInt(sc.nextLine());
                if (result >= min && result <= max) {
                    return result;
                } else {
                    throw new IllegalStateException("La valeur doit être comprise entre "
                            + min + "et " + max + ": " + result);
                }
            } catch (RuntimeException e) {
                System.err.println("Une erreur est survenue: " + e);
                System.out.print(message);
            }
        }
    }
    public static String YesNo (String message){
        Scanner sc = new Scanner (System.in);
        System.out.println(message);
        //String msgLoop = ("Voulez-vous continuer (YR+ES/NO)? ");
        //loop = MyUtils.YesNo(msgLoop);
        while(true) {
            try {
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("YES") || (answer.equalsIgnoreCase("NO")))
                    return answer.toUpperCase();
                else {
                    throw new IllegalStateException("La valeur entrée n'est pas YES ou NO");
                }
            } catch (RuntimeException e) {
                System.err.println("Une erreur est survenue: " + e);
                System.out.print(message);
            }
        }
    }
        //String loop = "YES";//sinon elle continue si c'est pas écris YES // on l'as déja fait dans car
        /**/

}