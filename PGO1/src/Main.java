import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        System.out.println((input == 0) ? "The value equals 0" :
                "The number is " + ((input < 0) ? "negative" : "positive"));
    }
}