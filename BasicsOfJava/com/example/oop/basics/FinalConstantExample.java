package BasicsOfJava.com.example.oop.basics;

class PointWithConstants {  //  KLASA
    int x, y;               //
    final int width = 12;   //  ARGUMENTY KLASY
    final  int height;      //

    PointWithConstants(){   //  KONSTRUKTOR
        height = 20;  // PRZYPISANIE WARTOSCI DO height
    }

    PointWithConstants(int posX, int posY){
        this();  // POBIERA WARTOSCI (int x,y i final int width, final height) Z POPRZEDNIEGO KONSTRUKTORA
        x = posX;  // tutaj znajduje sie wartosc ze zmiennej height = 20
        y = posY;
    }

    public void changePosition(int newX, final int newY){
        newX = 3033;  // ZMIANA WARTOSCI ARGUMENTU, KTOREJ JUZ NIE ZMIENIMY POZNIEJ W PROGRAMIE Z 20 na 3033
        x = newX; // 3033
        y = newY;
    }
}

public class FinalConstantExample {
    public static void main(String[] args) {

        PointWithConstants point = new PointWithConstants(33,44); // przypisanie nowych wartosci newX i newY
        point.changePosition(20,66);  // kolejne przypisanie nowych wartosci newX i newY
        System.out.println("x: " + point.x + " y: " + point.y); // wynik:  x: 3033  y: 66 poniewaz x jest stala niezmienna
    }
}
