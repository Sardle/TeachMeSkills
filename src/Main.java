import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        sum(scanner.nextInt());
    }

    public static void sum(int first) {
        switch (first) {
            case 1 -> System.out.println("Это еденица");
            case 2 -> System.out.println("Это двойка");
            case 3 -> System.out.println("Это тройка");
            default -> System.out.println("Я не знаю это число");
        }
    }
}