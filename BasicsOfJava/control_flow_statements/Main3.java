package BasicsOfJava.control_flow_statements;

public class Main3 {
    public static void main(String[] args) {

        /*
            Wykorzystaj instrukcje if, else if itd
            wraz z operatorami logicznymi czyli AND i OR
            do sprawdzenia pogody i decyzji czy warto pójść na spacer
            Potrzebujesz nastepujących zmiennych typu boolean: rainning, haveUmbrella
            Dodatkowo zapisz temperaturę jako int w zmiennej: temperature

            Wymagania:
            1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
            2. Jeśli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
            3. Jeśli nie pada i powyżej 12 stopni może wyjść
            4. W innych wypadkach zostaje w domu
         */

        boolean raining = false;
        boolean umbrella = false;
        int temperature = 14;



        // 1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
        if (temperature >= 40 || temperature <= -20)
        {
            System.out.println("Prosze zostan w domu");
        }
        // 2. Jeśli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
        else if ((temperature >= -10 && temperature <= 10) && raining  && umbrella){

            System.out.println("wypad z domu mimo ze pada");
        }
        // 3. Jeśli nie pada i powyżej 12 stopni może wyjść
        else if (!raining && temperature > 12) {

            System.out.println("nie pada ale jest przyjemnie");
        }
        // 4. W innych wypadkach zostaje w domu
        else {
            System.out.println("zostan w domu");
        }


    }
}
