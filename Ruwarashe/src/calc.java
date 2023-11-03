import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class calc {
    public static void main(String[] args) throws IOException {

        float firstNumberBeilecki, secondNumberBeilecki, sum, subtraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" the program creates sum, difference, product and quotient for the two numbers,");
        System.out.println("Enter the first number (and press Enter): ");
        firstNumberBeilecki = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press Enter): ");
        secondNumberBeilecki = Float.parseFloat(br.readLine());


        sum = firstNumberBeilecki + secondNumberBeilecki;
        subtraction = firstNumberBeilecki - secondNumberBeilecki;
        product = firstNumberBeilecki * secondNumberBeilecki;
        quotient = firstNumberBeilecki / secondNumberBeilecki;
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(product);
        System.out.println(quotient);
    }
}
