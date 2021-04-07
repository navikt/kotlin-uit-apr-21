package no.nav;

public class JavaAddress {
   private final String street;
   private final int houseNumber;

   public JavaAddress(String street, int houseNumber) {
      this.street = street;
      this.houseNumber = houseNumber;
   }

   public String getStreet() {
      return street;
   }

   public int getHouseNumber() {
      return houseNumber;
   }

   @Override
   public String toString() {
      return "JavaAddress{" +
         "street='" + street + '\'' +
         ", houseNumber=" + houseNumber +
         '}';
   }
}
