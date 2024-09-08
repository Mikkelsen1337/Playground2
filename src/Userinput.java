import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello" + name + "!");
        int length = name.length();
        System.out.println(length);
        
    }
}
