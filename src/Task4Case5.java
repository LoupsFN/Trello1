import java.util.Scanner;

public class Task4Case5 {
    public static void main(String[] args) {
        //Case5. Арифметические действия над числами пронумерованы следующим
        //образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. Дан
        //номер действия N (целое число в диапазоне 1–4) и вещественные числа A
        //и B (В не равно 0). Выполнить над числами указанное действие и вывести
        //результат.
        Scanner scan = new Scanner(System.in);
        System.out.println("1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление");
        System.out.print("Введіть число від 1-4 : ");
        String N = scan.next();
        System.out.print("Введіть перше число : ");
        double A = scan.nextDouble();
        System.out.print("Введіть друге число (окрім 0) : ");
        double B = scan.nextDouble();
        double result;

        switch (N) {
            case "1":
                result = A + B;
                System.out.println(result);
                break;

            case "2":
                result = A - B;
                System.out.println(result);
                break;

            case "3":
                result = A * B;
                System.out.println(result);
                break;

            case "4":
                result = A / B;
                System.out.println(result);
                break;
            default:
                System.out.println("Виникла помилка");


        }



    }
}
