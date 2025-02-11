public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int reverse = 0;
        int rem;

        while (n != 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}