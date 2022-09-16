public class Main4 {
    public static void main(String[] args) {
        /*
            Ocena punktowa potencjalnych kierowców.
            Stwórz prosta ocenę kierowcy zaczynając od początkowych zmiennych:
            points = 0 (int), driverLicense (boolean), experienceYears (int),
            drunkDriving (boolean), causedAccident (boolean), overSpeeding (boolean),
            Zastosuj instrukcje if do sprawdzadzania warunków i dodawania czy odejmowania punktów.

            1. Kierowca startuje z ilością 0 punktów, Dostaje +20 jeśli ma prawo jazdy
            2. -100 punktów jeśli jeździł pod wpływem albo spowodował wypadek
            3. -10 jeśli przekraczał prędkość
            4. Jeśli ma przynajmniej 10 lat doświdczenia +20 punktów
            5. Jeśli ma więcej niż 60 lat doświadczenia -20 punktów
         */

        int points = 0;
        boolean driverLicense = true;
        int experienceYears = 62;
        boolean drunkDriving = true;
        boolean causeAccident = true;
        boolean overSpeeding = true;

        //   1. Kierowca startuje z ilością 0 punktów, Dostaje +20 jeśli ma prawo jazdy
        if (driverLicense == true)
          {
              points += 20;
          } else if (driverLicense == false) {
            points = 0;
        }
        //   2. -100 punktów jeśli jeździł pod wpływem albo spowodował wypadek
        if ((drunkDriving || causeAccident) && driverLicense == true)
          {
              points -= 100;
          }

        //   3. -10 jeśli przekraczał prędkość
        if (overSpeeding == true)
        {
            points -= 10;
        }

        //   4. Jeśli ma przynajmniej 10 lat doświdczenia +20 punktów
        if (experienceYears >= 10 )
        {
            points += 20;
        }

        else if (experienceYears <= 9 && driverLicense == false)
        {
            points = 0;
        }
        //   5. Jeśli ma więcej niż 60 lat doświadczenia -20 punktów
        if (experienceYears >= 60){
            points -= 20;
        }

        System.out.println(points);
    }
}
