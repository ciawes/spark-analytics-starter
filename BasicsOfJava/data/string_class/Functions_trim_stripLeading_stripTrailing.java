package BasicsOfJava.data.string_class;

public class Functions_trim_stripLeading_stripTrailing {
    public static void main(String[] args) {

        String str = " \n \n  Hello World! \n ";
        String str2 = str.trim();  // usowane sa biale znaki z poczatku i konca wyrazu
        System.out.println("\"" + str2 + "\"");

        String str3 = str.stripLeading(); //usuwanie sa znaki tylko z poczatku wyrazu
        System.out.println("\"" + str3 + "\"");

        String str4 = str.stripTrailing();   // usuwane sa znaki tylko z konca wyrazu
        System.out.println("\"" + str4 + "\"");
    }
}
