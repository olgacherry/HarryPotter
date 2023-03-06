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
        Ravenclaw ravenclaw1 = new Ravenclaw("Ravenclaw", "Cho", "Chang", 7, 4, 8, 9, 6, 7);
        Ravenclaw ravenclaw2 = new Ravenclaw("Ravenclaw", "Marcus", "Belby", 5, 3, 7, 9, 6, 5);
        if(ravenclaw1.calculateMindWisdomWitCreation()>ravenclaw2.calculateMindWisdomWitCreation()){
            System.out.println("Cho Chang лучший Когтевранец, чем Marcus Belby");
        }else{
            System.out.println("Marcus Belby лучший Когтевранец, чем Cho Chang");
        }
    }
}