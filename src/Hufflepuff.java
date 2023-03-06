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
        Hufflepuff hufflepuff1 = new Hufflepuff("Hufflepuff", "Zacharias", "Smith", 7, 9, 4, 7, 6);
        Hufflepuff hufflepuff2 = new Hufflepuff("Hufflepuff", "Cedric", "Diggory", 5, 9, 7, 5, 8);
        if(hufflepuff1.calculateDiligenceHonestyLoyalty()>hufflepuff2.calculateDiligenceHonestyLoyalty()){
            System.out.println("Zacharias Smith лучший Пуффендуец, чем Cedric Diggory");
        }else {
            System.out.println("Cedric Diggory лучший Пуффендуец, чем Zacharias Smith");
        }
    }
}

