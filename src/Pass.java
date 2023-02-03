public class Pass {
    public static void main(String[] args) {

        Passport person = new Passport();

        person.lastName="Ysmaiylov";
        person.firstName="Raiym";
        person.gender="Male";
        person.idNumber=1254188;
        person.personalNumber=619101118;

        person.identify();
        System.out.println("My last name is "+person.lastName+" and My first name is "+person.firstName);
        person.passportData();
        System.out.println("My gender is "+person.gender+" and year of birth "+person.date+" and my ID number is "+person.idNumber+" and my Personal Number is "+person.personalNumber);


    }
}
