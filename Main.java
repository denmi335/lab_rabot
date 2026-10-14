import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("  ЛАБОРАТОРНАЯ РАБОТА №1 ПО РПЯВУ");
        System.out.println();

        while (running) {
            showMenu();

            System.out.print("\nВыберите задание (1-6): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    task1FizzBuzz();
                    break;
                case "2":
                    task2ReverseString(scanner);
                    break;
                case "3":
                    task3Fibonacci(scanner);
                    break;
                case "4":
                    task4Factorial(scanner);
                    break;
                case "5":
                    task5Variant15(scanner);
                    break;
                case "6":
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
        System.out.println("1. FizzBuzz (1-500)");
        System.out.println("2. Вывод строки в обратном порядке");
        System.out.println("3. Числа Фибоначчи");
        System.out.println("4. Факториал числа");
        System.out.println("5. Индивидуальное задание (вар. 15)");
        System.out.println("6. Выход");
    }

    static void task1FizzBuzz() {
        System.out.println("\n--- ЗАДАНИЕ 1: FizzBuzz (1-500) ---\n");

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Задание 2: Вывод строки в обратном порядке
     * Каждое слово переворачивается, порядок слов тоже обратный
     */
    static void task2ReverseString(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 2: Вывод в обратном порядке ---\n");

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder reversedWord = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord.append(words[i].charAt(j));
            }

            result.append(reversedWord);
            if (i > 0) {
                result.append(" ");
            }
        }

        System.out.println("\nРезультат: " + result.toString());
    }

    static void task3Fibonacci(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 3: Числа Фибоначчи ---\n");

        System.out.print("Сколько чисел Фибоначчи вывести? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        if (n <= 0) {
            System.out.println("Ошибка: число должно быть положительным!");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            long prev2 = 1;
            long prev1 = 1;

            System.out.print(prev2 + " " + prev1);

            for (int i = 3; i <= n; i++) {
                long current = prev1 + prev2;
                System.out.print(" " + current);

                prev2 = prev1;
                prev1 = current;
            }
            System.out.println();
        }
    }

    static void task4Factorial(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 4: Факториал числа ---\n");

        System.out.print("Введите целое неотрицательное число: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        if (n < 0) {
            System.out.println("Ошибка: факториал отрицательного числа не определён!");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
    }

    static void task5Variant15(Scanner scanner) {
        System.out.println("\n--- ИНДИВИДУАЛЬНОЕ ЗАДАНИЕ (Вариант 15) ---\n");

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число (c): ");
        int c = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        System.out.println("\nИсходные значения: a = " + a + ", b = " + b + ", c = " + c);

        if (a < b && b < c) {
            System.out.println("Числа упорядочены по возрастанию -> удваиваем");
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            System.out.println("Числа НЕ упорядочены по возрастанию -> меняем знак");
            a = -a;
            b = -b;
            c = -c;
        }

        System.out.println("Новые значения:    a = " + a + ", b = " + b + ", c = " + c);
    }
}
