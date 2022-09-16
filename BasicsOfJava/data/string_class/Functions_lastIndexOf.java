package BasicsOfJava.data.string_class;

public class Functions_lastIndexOf {
    public static void main(String[] args) {

        String str = "Raz dwa trzy cztery. Raz dwa.";
        int index = str.lastIndexOf("Raz");
        System.out.println("Ostatnie wystapienie 'Raz': " + index);
        String fragment = str.substring(index);
        System.out.println("Fragment: " + fragment);

        index = str.indexOf("Raz");
        System.out.println("Pierwsze wystapienie 'Raz': " + index);
    }
}
