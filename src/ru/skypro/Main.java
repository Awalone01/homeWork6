package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] moneyEveryDay = new int[30];
        double[] doubles = new double[moneyEveryDay.length];
        int sum = 0;
        double sum2 = 0;
        for (int i = 0; i < moneyEveryDay.length; i++) {
            moneyEveryDay[i] = (int)(Math.random() * 100_000) + 100_000;
            sum += moneyEveryDay[i];
            System.out.print(moneyEveryDay[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");

        int maxMoney = -1;
        int minMoney = 250_000;
        for (int value : moneyEveryDay) {
            if (maxMoney < value) {
                maxMoney = value;
            } else if (minMoney > value) {
                minMoney = value;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей. " +
                "Максимальная сумма трат за день составила " + maxMoney +  " рублей");


        for (int k = 0; k < moneyEveryDay.length; k++) {
            doubles[k] = moneyEveryDay[k];
            sum2 += doubles[k];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum2 / 30 + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(reverseFullName[i]);
            } else {
                System.out.println(reverseFullName[i]);
            }
        }






    }
}
