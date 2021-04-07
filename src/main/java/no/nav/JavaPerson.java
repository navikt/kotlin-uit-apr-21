package no.nav;

public class JavaPerson {
   private final String name;
   private final JavaAddress address;

   public JavaPerson(String name, JavaAddress address) {
      this.name = name;
      this.address = address;
   }

   public String getName() {
      return name;
   }

   public JavaAddress getAddress() {
      return address;
   }

   @Override
   public String toString() {
      return "JavaPerson{" +
         "name='" + name + '\'' +
         ", address=" + address +
         '}';
   }
}
