package BasicsOfJava.com.example.oop.basics.methods;

class Radio{
    int productionYear;
    int volume;
    String station; // aktualna stacja radiowa

    Radio(){
        this.productionYear = 2000;
        volume = 100;     // to samo co this.volume
    }

    Radio(int productionYear){
        this();  // wywolanie konstruktora bezargumentowego
        this.productionYear = productionYear;

    }

    public void changeStation(String newStation){
        this.changeStation("Rock");
    }
    public Radio getRadio(){
        return this;
    }
    public  void printRadioInfo(Radio radio){
        System.out.println("Radio production year: " + radio.productionYear);
    }
}

public class ThisUsage {
    public static void main(String[] args) {

        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);

        newRadio.printRadioInfo(newRadio);
    }
}
