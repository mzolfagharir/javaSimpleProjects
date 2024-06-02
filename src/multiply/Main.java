package multiply;
public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            for (int mul = 1; mul <= 1000; mul++) {
                System.out.printf("%d X %d = %d \n", number, mul, number * mul);
            }

        }
    }
}