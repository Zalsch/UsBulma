public class Main {
    static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * power(x, y - 1);
    }

    public static void main(String[] args) {
        System.out.println("The result is: " + power(2, 3));
    }
}