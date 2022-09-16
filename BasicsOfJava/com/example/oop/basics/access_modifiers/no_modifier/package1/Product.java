package BasicsOfJava.com.example.oop.basics.access_modifiers.no_modifier.package1;

public class Product {

     String name;   // nie jest okreslony modyfikator, wiec ale tez jest samo w sobie mody. jako protected
                    // z wyjatkiem przy rozszwrzaniu nie bedziemy miec dostepu do tej zmiennej bez modyfikatora
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
