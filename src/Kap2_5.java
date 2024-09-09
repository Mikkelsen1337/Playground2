import java.util.Scanner;

public class Kap2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Beder brugeren om længden af kvadratet
        System.out.println("Hvad er længden på en side? ");

        // Læser input som en double (for at håndtere decimaler)
        double length = input.nextDouble();

        // Beregner arealet (kvadratets areal = side * side)
        double area = length * length;

        double omkreds = length * 4;

        // Udskriver resultatet
        System.out.println("Arealet af din kvadrat er " + area);
        System.out.println("Omkredsen af din kvadrat er " + omkreds);
    }
}
