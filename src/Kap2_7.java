import java.util.Scanner;

public class Kap2_7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hvad er din højde? ");
    double height = input.nextDouble();

    System.out.println("Hvad er din vægt? ");
    double weight = input.nextDouble();

    System.out.println("Din højde er " + height + "Meter" + " Og din vægt er " + weight + "Kg");



    double bmi = (weight) / (height*2);

        System.out.println("Dit BMI tal er " + bmi);

    if (bmi >30) {
            System.out.println("Du er for fed");
        }
    else if (bmi <20) {
            System.out.println("Du ligner et stankelben");
    }
    else if (bmi >=21 && bmi<=29) {
            System.out.println("Du har en sund BMI");
        }
    }
}
