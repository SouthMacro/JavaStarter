package JavaLesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume {
    public static void main(String[] args) throws IOException {
        final double PI = Math.PI;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input radius and height: ");

        double radius = Double.parseDouble(bufferedReader.readLine());
        double height = Double.parseDouble(bufferedReader.readLine());

        double resultOfVolume = PI * Math.pow(radius, 2) * height;
        double resultSurfaceArea = 2 * PI * radius * (radius + height);

        System.out.println("Volume is : " + resultOfVolume);
        System.out.println("Surface Area is : " + resultSurfaceArea);
    }
}
