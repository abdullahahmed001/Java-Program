import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
         //TODO: Ask the user for their name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // greet the user
        greetUser(name);

        int result = addTwo(5, 2);
        System.out.println("The sum is: " + result);
    }

    public static void greetUser(String name)
    {
        System.out.println("Hello, " + name + "!");
    }

    public static int addTwo(int a, int b)
    {
        return a + b;
    }

}