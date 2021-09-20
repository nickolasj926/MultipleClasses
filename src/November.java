import java.util.Scanner;
public class November {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        december decemberObject = new december();

        System.out.println("Enter your birth month here:");
        String name = input.nextLine();

        decemberObject.simpleMessage(name);

    }
}
