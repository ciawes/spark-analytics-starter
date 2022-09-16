package BasicsOfJava.data.string_class;

public class BlankStringAndNull {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.length());
        s1 = s1.concat("Hello World");

        String s2 = null;
        //s2 = "test";           // mozna przyspisac wartosc do stringa z null
        System.out.println(s2.length());  // nie przypisanie a wyswietlenie dlugosci s2 wywali blad Exeption

        s2 = null;  // mozna ponownie przypisac null do s2, po czym zwalniamy pamiec i mozemy na nowo przypisac inna wartosc
    }
}
