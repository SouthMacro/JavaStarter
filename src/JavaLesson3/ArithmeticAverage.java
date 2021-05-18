package JavaLesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input three numbers: ");

        double firstValue = Double.parseDouble(bufferedReader.readLine());
        double secondValue = Double.parseDouble(bufferedReader.readLine());
        double thirdValue = Double.parseDouble(bufferedReader.readLine());

        double result = (firstValue + secondValue + thirdValue) / 3;

        System.out.println(result);
    }
}
