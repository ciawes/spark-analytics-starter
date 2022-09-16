package BasicsOfJava.data.string_class;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Ola ma kota.").append(123);
        builder.append(" Kolejny text");

        builder.insert(0, "Kasia ma psa. ");

        System.out.println(builder.toString());  //  Kasia ma psa. Ola ma kota.123 Kolejny text

        builder.replace(0, 5, "Julia");
        System.out.println(builder.toString());  //  Julia ma psa. Ola ma kota.123 Kolejny text

        builder.insert(12, " oraz kota");
        System.out.println(builder.toString());  //  Julia ma psa oraz kota. Ola ma kota.123 Kolejny text

        int index = builder.indexOf("123");
        builder.delete(index,builder.length());
        System.out.println(builder.toString());  //  Julia ma psa oraz kota. Ola ma kota.

    }
}
