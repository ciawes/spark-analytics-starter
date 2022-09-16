package BasicsOfJava.com.example.oop.basics;

class DBConnection{

    private static DBConnection instance;

    private DBConnection(){   // Prywatny konstruktor, do ktorego ma tylko dostep ta klasa w ktorej sie znajduje
    }

    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }

    public void getFromDB(){
        System.out.println("Dane z bazy");
    }
}

public class SingletonExample {
    public static void main(String[] args) {

        DBConnection connection = DBConnection.getInstance();
        DBConnection connection1 = DBConnection.getInstance();

        connection1.getFromDB();

        System.out.println(connection == connection1);

    }
}
