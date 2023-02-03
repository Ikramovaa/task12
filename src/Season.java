import java.util.Scanner;

public class Season {
    String winter;
    String spring;
    String summer;
    String autumn;
static void season1(){
    System.out.println("Give number");
    Scanner scanner=new Scanner(System.in);
    int sc= scanner.nextInt();

    if ( sc<=2) {
        System.out.println("winter");
    } else if (sc==12) {
        System.out.println("winter");

    } else if (sc<=5) {
        System.out.println("spring");
    } else if (sc<=8) {
        System.out.println("summer");}
    else if (sc<=11) {
        System.out.println("autumn");

    }

}
}
