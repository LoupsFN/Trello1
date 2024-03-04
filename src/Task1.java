import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Input an integer number: ");
            n = scan.nextInt();
            try {

            }catch (InputMismatchException ex) {
                scan.next();
            }

        } while (CheckingInputCondition(n));

        int[] array = new int[n];
        int j = 0;
        System.out.println("Initial sequence : ");
        for (int i = 0; i <= n; i++) {
            if((i > 0) && (i % 2 != 0)) {
                array[j] = i;
                i++;
            }
            System.out.print(i);
            
        }
        System.out.println("Requested array : ");
                showArray(array);

                scan.close();


    }

    private static void showArray(int[] array) {
        for (int elem : array) {
            System.out.println(elem + " ");
        }
    }

    private static boolean CheckingInputCondition(int n) {
        if (n <= 0) {
            System.out.println("""
                    Input must be > 0 and integer!
                    Try to input again please!
                    """);
            return true;

        }
        return false;
    }
}
