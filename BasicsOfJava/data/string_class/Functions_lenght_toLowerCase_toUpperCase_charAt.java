package BasicsOfJava.data.string_class;

public class Functions_lenght_toLowerCase_toUpperCase_charAt {
    public static void main(String[] args) {


        String str = "Ola ma kota";
        System.out.println("ilosc znakow: " + str.length());

        char sign = str.charAt(5);
        System.out.println("Znak pod indeksem 1: " + sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

    }
}
