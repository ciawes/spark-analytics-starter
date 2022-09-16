package BasicsOfJava.com.example.oop.basics.inheritance.example2_shop;

/*
   klasa Shop
   klasa Product (zmienne: price, name, manufacturer, productionYear)
   klasa Mouse extends Procuct (zmienne: numButtons = 3)
      klasa VerticalMouse extends Mouse (zmienne: -)
   klasa Monitor extends Product (zmienne: resolution = 1000)
   klasa Keyboard extends Product (zmienne numKeys = 104)
   klasa Computer extends Product (zmienne: mouse, monitor, keyboard)

   Dodajemy pusty konstruktor do kazdej klasy, ustwwiamy dla nich pola danych klasy
   Tworzymy egzemplarz klas w metodzie main
   Kazda klasa w osobnym pliku java
 */

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();

        System.out.println(computer.monitor.price + "zl");
        System.out.println(computer.price + "zl");
        System.out.println(computer.keyboard.price + "zl");



    }
}
