public class Main {


    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Gryffindor", "Harry", "Potter", 10, 9, 7, 10, 7),
                new Gryffindor("Gryffindor", "Hermione", "Granger", 10, 10, 9, 9, 10),
                new Gryffindor("Gryffindor", "Ron", "Weasley", 7, 6, 7, 9, 5),

        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Hufflepuff", "Zacharias", "Smith", 7, 9, 4, 7, 6),
                new Hufflepuff("Hufflepuff", "Cedric", "Diggory", 5, 9, 7, 5, 8),
                new Hufflepuff("Hufflepuff", "Justin", "Finch-Fletchley", 6, 7, 8, 5, 6),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Ravenclaw", "Cho", "Chang", 7, 4, 8, 9, 6, 7),
                new Ravenclaw("Ravenclaw", "Padma", "Patil", 4, 6, 7, 5, 9, 7),
                new Ravenclaw("Ravenclaw", "Marcus", "Belby", 5, 3, 7, 9, 6, 5),
        };

        Slytherin[] slytherins = {
                new Slytherin("Slytherin", "Draco", "Malfoy", 6, 7, 6, 9, 8, 9, 9),
                new Slytherin("Slytherin", "Graham", "Montague", 9, 6, 9, 7, 9, 7, 9),
                new Slytherin("Slytherin", "Gregory", "Goyle", 7, 4, 8, 6, 9, 7, 7),

        };

        PrintService printService = new PrintService();
        System.out.println();
        printService.print(gryffindors);
        System.out.println();
        printService.print(hufflepuffs);
        System.out.println();
        printService.print(ravenclaws);
        System.out.println();
        printService.print(slytherins);
        System.out.println();


        Hogwarts.compareTwoHogwartsStudent();
        Hogwarts hogwarts1 = new Hogwarts("Gryffindor", "Harry", "Potter", 10, 9);
        Hogwarts hogwarts2 = new Hogwarts("Slytherin", "Gregory", "Goyle", 7, 4);
        if (hogwarts1.calculateWitchcraftAndTransgetion() > hogwarts2.calculateWitchcraftAndTransgetion()) {
            System.out.println("Harry Potter лучше, чем Gregory Goyle");
        } else {
            System.out.println("Gregory Goyle лучше, чем Harry Potter");
        }
        System.out.println();
        Gryffindor.compareTwoGryffindorStudent();
        Gryffindor gryffindor1 = new Gryffindor("Gryffindor", "Hermione", "Granger", 10, 10, 9, 9, 10);
        Gryffindor gryffindor2 = new Gryffindor("Gryffindor", "Ron", "Weasley", 7, 6, 7, 9, 5);
        if (gryffindor1.calculateNobilityHonorBravery() > gryffindor2.calculateNobilityHonorBravery()) {
            System.out.println("Hermione Granger лучший Гриффиндорец, чем Ron Weasley");
        } else {
            System.out.println("Ron Weasley лучший Гриффиндорец, чем Hermione Granger");
        }
        System.out.println();

        Hufflepuff.compareTwoHufflepuffStudent();
        Hufflepuff hufflepuff1 = new Hufflepuff("Hufflepuff", "Zacharias", "Smith", 7, 9, 4, 7, 6);
        Hufflepuff hufflepuff2 = new Hufflepuff("Hufflepuff", "Cedric", "Diggory", 5, 9, 7, 5, 8);
        if(hufflepuff1.calculateDiligenceHonestyLoyalty()>hufflepuff2.calculateDiligenceHonestyLoyalty()){
            System.out.println("Zacharias Smith лучший Пуффендуец, чем Cedric Diggory");
        }else {
            System.out.println("Cedric Diggory лучший Пуффендуец, чем Zacharias Smith");
        }
        System.out.println();
        Ravenclaw.compareTwoRavenclawStudent();
        Ravenclaw ravenclaw1 = new Ravenclaw("Ravenclaw", "Cho", "Chang", 7, 4, 8, 9, 6, 7);
        Ravenclaw ravenclaw2 = new Ravenclaw("Ravenclaw", "Marcus", "Belby", 5, 3, 7, 9, 6, 5);
        if(ravenclaw1.calculateMindWisdomWitCreation()>ravenclaw2.calculateMindWisdomWitCreation()){
            System.out.println("Cho Chang лучший Когтевранец, чем Marcus Belby");
        }else{
            System.out.println("Marcus Belby лучший Когтевранец, чем Cho Chang");
        }
        System.out.println();
        Slytherin.compareTwoSlytherinStudent();
        Slytherin slytherin1 = new Slytherin("Slytherin", "Draco", "Malfoy", 6, 7, 6, 9, 8, 9, 9);
        Slytherin slytherin2 = new Slytherin("Slytherin", "Graham", "Montague", 9, 6, 9, 7, 9, 7, 9);
        if (slytherin1.calculateCunningResolutenessAmbitionResourcefulnessLustForPower() > slytherin2.calculateCunningResolutenessAmbitionResourcefulnessLustForPower()) {
            System.out.println("Draco Malfoy лучший Слизеринец, чем Graham Montague");
        } else {
            System.out.println("Graham Montague лучший Слизеринец, чем Draco Malfoy");
        }

    }

    }



    






