package BasicsOfJava.com.example.oop.basics.inner_class;

public class SomeExample {
    private class PrivClass {
        public void printInfo() {
            System.out.println("Message from inner class");
        }
    }
               //  Metody odwolujace sie do wewnetrznej klasy robimy poza ta klasa

    public class PubClass {
        public void printInfo() {
            System.out.println("PubClass!! ");
        }
    }
    public void run() {
        PrivClass privClass = new PrivClass();
        privClass.printInfo();

        class InnerClass {
            public void printInfo() {
                System.out.println("InnerClass!!!");
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.printInfo();

    }

}
