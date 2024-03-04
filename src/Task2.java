public class Task2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        int result = sum(a, b);
        System.out.println(result);

    }
    static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;

        }
        return sum;
    }
}
