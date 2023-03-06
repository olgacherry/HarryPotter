public class Slytherin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String facultyName, String name, String surname, int witchcraft, int transgression, int cunning, int resoluteness, int ambition, int resourcefulness, int lustForPower) {
        super(facultyName, name, surname, witchcraft, transgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower(){
    return lustForPower;
    }
    int calculateCunningResolutenessAmbitionResourcefulnessLustForPower(){
        return cunning+resoluteness+ambition+resourcefulness+lustForPower;
    }
    public static void compareTwoSlytherinStudent() {
        Slytherin slytherin1 = new Slytherin("Slytherin", "Draco", "Malfoy", 6, 7, 6, 9, 8, 9, 9);
        Slytherin slytherin2 = new Slytherin("Slytherin", "Graham", "Montague", 9, 6, 9, 7, 9, 7, 9);
        if (slytherin1.calculateCunningResolutenessAmbitionResourcefulnessLustForPower() > slytherin2.calculateCunningResolutenessAmbitionResourcefulnessLustForPower()) {
            System.out.println("Draco Malfoy лучший Слизеринец, чем Graham Montague");
        } else {
            System.out.println("Graham Montague лучший Слизеринец, чем Draco Malfoy");
        }

    }
}