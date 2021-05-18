package JavaLesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please choose a number of formula (from 1 to 5): ");
        int result = Integer.parseInt(bufferedReader.readLine());

        int x = 10, y = 12, z = 3;
        var incrementXValue = x++;

        switch (result){
            case 1: System.out.println(x + (y - incrementXValue * z)); break;
            case 2: System.out.println(--x - y * 5); break;
            case 3: System.out.println(y / (x + 5 % z)); break; // Is always 0?
            case 4: System.out.println(incrementXValue + y * 5); break;
            case 5: System.out.println(y - incrementXValue * z); break;
            default:
                System.out.println("Please choose formula from 1 to 5.");
        }
    }
}
