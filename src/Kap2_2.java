import java.util.Scanner;

public class Kap2_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hvad er dit navn?");
        String name = input.nextLine();
        System.out.println("Hej! " + name);
        System.out.println("Hvor gammel er du?");
        String alder = input.nextLine();
        System.out.println("Du er " + alder + "År gammel! " + input);
        System.out.println("Hvad er dit yndlings Hexa tal?");
        String hexa = input.nextLine();
        System.out.println("Fedt! Dit yndlingstal er " + hexa );

    }
}
