 public class Hogwarts {
    private String facultyName;
    private String name;
    private String surname;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String facultyName, String name, String surname, int witchcraft, int transgression) {
       this.facultyName = facultyName;
       this.name = name;
       this.surname = surname;
       this.witchcraft = witchcraft;
       this.transgression = transgression;
    }



    public String getFacultyName() {
       return facultyName;
    }

    public String getName() {
       return name;
    }

    public String getSurname() {
       return surname;
    }

    public int getWitchcraft() {
       return witchcraft;
    }

    public int getTransgression() {
       return transgression;
    }

    int calculateWitchcraftAndTransgetion() {
       return witchcraft + transgression;
    }
    public static void compareTwoHogwartsStudent() {
        Hogwarts hogwarts1 = new Hogwarts("Gryffindor", "Harry", "Potter", 10, 9);
        Hogwarts hogwarts2 = new Hogwarts("Slytherin", "Gregory", "Goyle", 7, 4);
        if (hogwarts1.calculateWitchcraftAndTransgetion() > hogwarts2.calculateWitchcraftAndTransgetion()) {
            System.out.println("Harry Potter лучше, чем Gregory Goyle");
        } else {
            System.out.println("Gregory Goyle лучше, чем Harry Potter");
        }
    }


 }