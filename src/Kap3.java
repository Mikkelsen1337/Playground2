import java.util.Scanner;

public class Kap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Username: ");
        String username = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();
        System.out.println(username);
        System.out.println(password);
        if (username.equals("admin") && password.equals("1"))
        {
            System.out.print("Adgang givet");

        }
        else {
            System.out.println("Adgang nægtet");
        }
    }
}
