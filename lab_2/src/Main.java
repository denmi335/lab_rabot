import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            showMenu();
            System.out.print("\nВыберите задание (1-3): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    task1Fibonacci();
                    break;
                case "2":
                    task2Matrix();
                    break;
                case "3":
                    System.out.println("\nДо свидания!");
                    running = false;
                    break;
                default:
                    System.out.println("\nНеверный выбор! Попробуйте снова.");
            }

            if (running) {
                System.out.print("\nНажмите Enter для возврата в меню...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    static void showMenu() {
        System.out.println("\nМЕНЮ ВЫБОРА");
        System.out.println("1. Первые 20 чисел Фибоначчи");
        System.out.println("2. Поиск седловых точек матрицы");
        System.out.println("3. Выйти");
    }

    static void task1Fibonacci() {
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("\nПервые 20 чисел Фибоначчи:\n");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println("F[" + (i + 1) + "] = " + fibonacci[i]);
        }

        System.out.println("\nМассив в строку:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i]);
            if (i < fibonacci.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\nРазработчик: Якунин Александр");
        System.out.println("Дата получения задания: 29.09.2026");
    }

    static void task2Matrix() {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Матрица 1 - Седловых точек: " + SaddlePoints.countSaddlePoints(matrix1));

        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Матрица 2 - Седловых точек: " + SaddlePoints.countSaddlePoints(matrix2));

        int[][] matrix3 = {
                {9, 8, 7},
                {5, 3, 2},
                {6, 6, 7}
        };
        System.out.println("Матрица 3 - Седловых точек: " + SaddlePoints.countSaddlePoints(matrix3));
    }
}
