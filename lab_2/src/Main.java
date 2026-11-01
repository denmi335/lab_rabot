public class Main {

    public static void main(String[] args) {
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Первые 20 чисел Фибоначчи:");
        System.out.println();

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println("F[" + (i + 1) + "] = " + fibonacci[i]);
        }

        System.out.println();
        System.out.println("Массив в строку:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i]);
            if (i < fibonacci.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("Разработчик: [Якунин Алескандр]");
        System.out.println("Дата получения задания: 29.09.2026");
    }
}
