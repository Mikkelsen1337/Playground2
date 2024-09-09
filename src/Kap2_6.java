import java.util.Scanner;

public class Kap2_6 {
    public static void main(String[] args){

        // Timer til sekunder
        Scanner input = new Scanner(System.in);
        System.out.println("Antal timer");
        int timer = input.nextInt();
        int minutter = timer * 60;

        System.out.print(timer + " Timer er lig med " + minutter + " Minutter");

    }
}
