public class Main {
    public static void main(String[] args) {
        Car car =new Car();
       Car.brand="Tesla";
      Car.year=2023;
      Car.colour="bLACK";


        System.out.println("my first car "+Car.brand+" year is "+Car.year+" and colour is "+Car.colour);
        Car.gaz();
        Car.tormoz();
    }
}