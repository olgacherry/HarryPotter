
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
        }

    }