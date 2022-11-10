public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Число " + i);
        }

        for (int b = 10; b >= 0; b--) {
            System.out.println("Число " + b);
        }

        for (int c = 2; c < 17; c = c + 2) {
            System.out.println("Число " + c);
        }
        for (int d = 10; d >= -10; d--) {
            System.out.println("Число " + d);
        }

        for (int y = 1904; y <= 2096; y += 4) {
            System.out.println(y + " год является высокосным");

        }
        for (int g = 7; g <= 98; g += 7) {
            System.out.println("Число " + g);
        }

        for (int f = 1; f <= 512; f *= 2) {
            System.out.println("Число " + f);
        }
        int deposit = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++) {
            total = total + deposit;
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей");
        }



    }
}
