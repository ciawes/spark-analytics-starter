package BasicsOfJava.data.string_class;

public class Funtions_substring {
    public static void main(String[] args) {

        String str = "Ola ma psa oraz kota";
        String frag1 = str.substring(7); // podajac numer indexu wyswietli nam sie wyraz tylko od tego indexu do konca wynik: "psa oraz kota"
        System.out.println(frag1);

        String frag2 = str.substring(7,10); // podajac numer indexu od ktorego chcemy wyswietlic wyraz + do ktorego indexu chcemy go wyswietlic + 1 wynik: "psa"
        System.out.println(frag2);
    }
}
