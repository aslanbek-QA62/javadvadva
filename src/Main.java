public class Main {
    public static void main(String[] args) {

        int start = 100; //начальная сумма счета
        int plus = 1100; //сумма пополения

        int bonus; //сумма бонусов
        if (plus > 1000) {
            bonus = plus / 100;
        } else {
            bonus = 0;
        }

        int result = bonus + start + plus; //итоговая сумма

        System.out.println("Бонусы " + bonus);
        System.out.println("Итоговый счет " + result);
    }
}