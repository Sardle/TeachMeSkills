import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        System.out.print("Enter the first number: ");
        int first = checkNum("first");
        System.out.print("Enter the second number ");
        int second = checkNum("second");
        System.out.print("Chosen action (+) (-) (*) (/): ");
        String action = checkAction();
        switch (action) {
            case "+" -> plus(first, second);
            case "-" -> minus(first, second);
            case "*" -> multiply(first, second);
            case "/" -> div(first, second);
        }
    }

    public static int checkNum(String firstOrSecond) {
        String check = null;
        while (check == null) {
            check = scanner.nextLine();
            if (!check.matches("\\d+")) {
                System.out.println("Invalid input");
                System.out.print("Enter the " + firstOrSecond +" number: ");
                check = null;
            }
        }
        return Integer.parseInt(check);
    }

    public static String checkAction() {
        String action = null;
        while (action == null) {
            action = scanner.nextLine();
            if (!action.matches("[+\\-*/]")) {
                System.out.println("Invalid action");
                System.out.print("Chosen action (+) (-) (*) (/): ");
                action = null;
            }
        }
        return action;
    }

    public static void plus(int first, int second) {
        System.out.printf("%d + %d = %d", first, second, (first + second));
    }

    public static void minus(int first, int second) {
        System.out.printf("%d - %d = %d", first, second, (first - second));
    }

    public static void multiply(int first, int second) {
        System.out.printf("%d * %d = %d", first, second, (first * second));
    }

    public static void div(int first, int second) {
        System.out.println(first + " / " + second + " = " + ((double) first / (double) second));
    }
}
