import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ціну за 1 кг: ");
        double price = scan.nextDouble();
        for (double i = 1.2; i < 2.0; i += 0.2) {
            double Cost = price * i;
            System.out.printf("За %.1f кг, до сплати %.2f" + " грн" + "%n", i, Cost);
        }
    }
}
