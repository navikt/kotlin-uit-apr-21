package no.nav;

public class Main {

   public static void main(String[] args) {
      KotlinPerson kotlinPerson = new KotlinPerson("Max Mekker", new KotlinAddress("gata", 42));
      JavaPerson javaPerson =
         new JavaPerson("Leonora Dorothea Dahl", new JavaAddress("stirn", 55));
      System.out.println(kotlinPerson);
      System.out.println(javaPerson);
   }

}
