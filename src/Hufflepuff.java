public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String facultyName, String name, String surname, int witchcraft, int transgression, int diligence, int honesty, int loyalty) {
        super(facultyName, name, surname, witchcraft, transgression);
        this.diligence = diligence;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }
   int calculateDiligenceHonestyLoyalty(){
        return diligence+honesty+loyalty;
   }
    public static void compareTwoHufflepuffStudent() {
    }
}

