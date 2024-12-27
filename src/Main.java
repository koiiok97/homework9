public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] payments = {32222, 12033, 28421, 32000, 18000};
        int sum = 0;
        for (int pay : payments) {
            sum += pay;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("\nЗадание 2");
        int max = payments[0], min = payments[0];
        for (int pay : payments) {
            if (pay >= max) {
                max = pay;
            }
            if (pay <= min) {
                min = pay;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("\nЗадание 3");
        float mid = (float) sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");

        System.out.println("\nЗадание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0, j = reverseFullName.length - 1; i <= j; i++, j--) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }
        System.out.println(reverseFullName);
    }
}