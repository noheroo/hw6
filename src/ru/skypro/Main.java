package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task123();
        task4();
    }
    public static void task123(){
        int[] arr = generateRandomArray();

        int summary = 0;
        for (int i : arr) {
            summary += i;
        }
        System.out.println("Сумма трат за месяц равна " + summary + " рублей");

        int min=200_001;
        int max=0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей");
        System.out.println("Максимальная сумма трат за день составила "+max+" рублей");

        float summaryFloat=summary;                // Если не делать это переприсвоение, а использовать переменную summary,
        float mean = summaryFloat/arr.length; // то ответ округляется. Почему значение округляется, из-за того что summary int?
        System.out.println("Средняя сумма трат за месяц "+mean+" рублей");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i !=-1; i--) {
            System.out.print (reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

