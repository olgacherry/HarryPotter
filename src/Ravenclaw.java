public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String facultyName, String name, String surname, int witchcraft, int transgression, int mind, int wisdom, int wit, int creation) {
        super(facultyName, name, surname, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
    int calculateMindWisdomWitCreation(){
        return mind+wisdom+wit+creation;
    }
    public static void compareTwoRavenclawStudent() {
    }
}