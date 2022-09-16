package BasicsOfJava.control_flow_statements;

public class CodeBlock {
    public static void main(String[] args) {

        int b = 12;
        int num = 100;
        {
            //long num = 1000;// zmienna num nie moze byc zadeklarowana drugi raz bo juz zadeklarowana zostala przed blokiem kodu
            num = 1000; // ale mozemy przypisac jej nowa wartosc!!!
            int a = 5;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("num: " + num);
            // System.out.println("c: " + c); // zmienna c nie moze byc wyswietlona poniewaz zmienna jest poza blokiem kodu
            // gdyby zmienna c byla przez blokiem kodu wtedy mozna ja wyswietlic
        }

        int c = 80;
        int a = 24; // nie ma konfliktu nazwy zmiennej bo znajduje sie ona w bloku

                                //         zagniezdzony Blok Kodu

                                   {                                                          //
                                       int value = 9;                                         //
                                              {                                               //
                                                  int test = 8;                               //  mamy dostep do kazdej zmiennej w zagniezdzonym bloku
                                                  {                                           //  poniewaz wszystkie zmienne i bloki zawieraja sie
                                                      System.out.println("value: " + value);  //  w jednym glownym bloku.
                                                      System.out.println("test: " + test);    //  oraz mamy dostep do kazdej zmiennej ktora
                                                      System.out.println("zmienna c: " + c);  //  zadeklarowana jest przed blokiem kodu.
                                                  }                                           //
                                              }                                               //
                                   }                                                          //
    }



    }

