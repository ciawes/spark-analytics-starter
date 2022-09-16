package BasicsOfJava.data.string_class;

public class StringBasicExam {
    public static void main(String[] args) {

        String s1 = "Hello World!";
        String s2 = new String("String passed to constructor");

        String s3 = "test ".repeat(5);
        System.out.println(s3);

        String s4 = String.join("-", "1", "2", "3");
        System.out.println(s4);

        char arr[] = {'O', 'L', 'A'};
        System.out.println(arr);
    }
}
