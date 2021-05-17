package JavaLesson2;

public class Task3 {
    public static void main(String[] args) {
        String firstLine = "\nмоя строка 1";
        String secondLise = "\tмоя строка 2";
        // String thirdLine = "\aмоя строка 3"; // throws Exception "java: illegal escape character"

        System.out.println(firstLine + secondLise);
    }
}
