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
        System.out.println();
        Gryffindor.compareTwoGryffindorStudent();
        System.out.println();
        Hufflepuff.compareTwoHufflepuffStudent();
        System.out.println();
        Ravenclaw.compareTwoRavenclawStudent();
        System.out.println();
        Slytherin.compareTwoSlytherinStudent();

    }

    }



    






