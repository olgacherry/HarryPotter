 public class Hogwarts {
   private String facultyName;
   private String name;
   private String surname;
   private int witchcraft;
   private int transgression;

   public Hogwarts(String facultyName, String name, String surname, int witchcraft, int transgression) {
      this.facultyName = facultyName;
      this.name = name;
      this.surname = surname;
      this.witchcraft = witchcraft;
      this.transgression = transgression;
   }

   public String getFacultyName() {
      return facultyName;
   }


   public String getName() {
      return name;
   }

   public String getSurname() {
      return surname;
   }

   public int getWitchcraft() {
      return witchcraft;

   }

   public int getTransgression() {
      return transgression;
   }


}