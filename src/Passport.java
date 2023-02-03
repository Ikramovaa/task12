import java.time.LocalDate;

public class Passport {
      String lastName;
      String firstName;
      String gender;
    String citizenship;
      LocalDate date=LocalDate.of(1971,03,05);
     static long idNumber;
     static long personalNumber;
    static void identify(){
        System.out.println("What is your First name and Last name?");
    }
    static void passportData(){
        System.out.println("Please ,show your passport information");
    }

}
