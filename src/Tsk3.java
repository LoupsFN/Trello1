import java.util.Arrays;

public class Tsk3 {
    //Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
    //
    //1.4, . . . , 2 кг конфет.
    public static void main(String[] args) {
        double price;
        double[] arr = new double[5];

    }
    public static double[] price(double price) {
        double[] list = new double[5];
        int j = 2;
        for (double i = 1.2; i < 2; i+=0.2) {
            list[j] = price * i;
            j++;
        }
        return list;
    }
}
