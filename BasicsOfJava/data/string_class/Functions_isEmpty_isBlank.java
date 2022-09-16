package BasicsOfJava.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String[] args) {

        String emptyStr = "";
        String blankStr = " \n     ";

        if (emptyStr.isEmpty()){
            // true
            System.out.println("emptyStr jest pusty - isEmpty()");
        }
        if (blankStr.isEmpty()){
            // true
            System.out.println("blankStr jest pusty - isEmpty()");
        } else {
            System.out.println("blankStr nie jest pusty - isEmpty()");
        }

        if (emptyStr.isBlank()){
            // true
            System.out.println("emptyStr ma 0 znakow lub same biale znaki(spacje) - isBlank");
        }

        if (blankStr.isBlank()){
            // true
            System.out.println("blankstr ma 0 znakow lub same biale znaki(spacje) - isBlank");
        }
    }
}
