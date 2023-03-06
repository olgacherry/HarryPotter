
    public class Gryffindor extends Hogwarts {
        private int nobility;
        private int honor;
        private int bravery;


        public Gryffindor(String facultyName, String name, String surname, int witchcraft, int transgression, int nobility, int honor, int bravery) {
            super(facultyName, name, surname, witchcraft, transgression);
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        }


        public int getNobility() {
            return nobility;
        }

        public int getHonor() {
            return honor;
        }

        public int getBravery() {
            return bravery;
        }

        int calculateNobilityHonorBravery() {
            return nobility + honor + bravery;
        }

        public static void compareTwoGryffindorStudent() {
            Gryffindor gryffindor1 = new Gryffindor("Gryffindor", "Hermione", "Granger", 10, 10, 9, 9, 10);
            Gryffindor gryffindor2 = new Gryffindor("Gryffindor", "Ron", "Weasley", 7, 6, 7, 9, 5);
            if (gryffindor1.calculateNobilityHonorBravery() > gryffindor2.calculateNobilityHonorBravery()) {
                System.out.println("Hermione Granger лучший Гриффиндорец, чем Ron Weasley");
            } else {
                System.out.println("Ron Weasley лучший Гриффиндорец, чем Hermione Granger");
            }
        }

    }