package JavaLesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        final double PI = Math.PI;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input radius: ");

        double radius = Double.parseDouble(bufferedReader.readLine());

        double result = PI * Math.pow(radius, 2);

        System.out.println(result);
    }
}
