public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Факультет " + gryffindor.getFacultyName()
                    + "; Имя " + gryffindor.getName()
                    + "; Фамилия " + gryffindor.getSurname()
                    + "; Умение колдовать  " + gryffindor.getWitchcraft()
                    + "; Расстояние трансгресии " + gryffindor.getTransgression()
                    + "; Благородство " + gryffindor.getNobility()
                    + "; Честь " + gryffindor.getHonor()
                    + "; Храбрость " + gryffindor.getBravery());
        }
    }
    public void print(Hufflepuff[]hufflepuffs){
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Факультет " + hufflepuff.getFacultyName()
                    + "; Имя " + hufflepuff.getName()
                    + "; Фамилия " + hufflepuff.getSurname()
                    + "; Умение колдовать  " + hufflepuff.getWitchcraft()
                    + "; Расстояние трансгресии " + hufflepuff.getTransgression()
                    + "; Трудолюбие " + hufflepuff.getDiligence()
                    + "; Честность " + hufflepuff.getHonesty()
                    + "; Верность " + hufflepuff.getLoyalty());
        }
    }
    public void print(Ravenclaw[]ravenclaws){
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
        System.out.println("Факультет " + ravenclaw.getFacultyName()
                + "; Имя " + ravenclaw.getName()
                + "; Фамилия " + ravenclaw.getSurname()
                + "; Умение колдовать  " + ravenclaw.getWitchcraft()
                + "; Расстояние трансгресии " + ravenclaw.getTransgression()
                + "; Ум " + ravenclaw.getMind()
                + "; Мудрость " + ravenclaw.getWisdom()
                + "; Остроумие " + ravenclaw.getWit()
                + "; Творчество "+ ravenclaw.getCreation());
    }
    }
    public void print(Slytherin[]slytherins){
        for (int i =0; i<slytherins.length; i++){
            Slytherin slytherin = slytherins[i];
            System.out.println("Факультет " + slytherin.getFacultyName()
                    + "; Имя " + slytherin.getName()
                    + "; Фамилия " + slytherin.getSurname()
                    + "; Умение колдовать  " + slytherin.getWitchcraft()
                    + "; Расстояние трансгресии " + slytherin.getTransgression()
                    + "; Хитрость " + slytherin.getCunning()
                    + "; Решительность " + slytherin.getResoluteness()
                    + "; Амбициозность " + slytherin.getAmbition()
                    + "; Находчивость "+ slytherin.getResourcefulness()
                    + "; Жажда власти "+ slytherin.getLustForPower());

        }


        }

}





