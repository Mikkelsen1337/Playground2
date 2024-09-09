import java.util.Scanner;

public class Kap2_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hvad er Radiussen af din cirkel? ");
        String radius = input.nextLine();
        System.out.println("Perfekt! Dit areal er " + (radius) + (Math.PI*2));
        System.out.println("Din omkreds er " + (radius) + (2*Math.PI*2));

    }
}
