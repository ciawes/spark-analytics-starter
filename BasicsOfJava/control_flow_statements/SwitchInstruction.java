package BasicsOfJava.control_flow_statements;

public class SwitchInstruction {

    enum CarVariant {SEDAN, COMBO, SPORT}

    public static void main(String[] args) {
        int num = 10;
        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println(" ok");
                break;

            case 2:
                System.out.println(2);
                System.out.println(" ok");
                break;

            case 3:
                System.out.println(3);
                System.out.println(" ok");
            case 4:
                System.out.println(4);
                System.out.println(" ok");
                break;

            default:
                System.out.println("default: " + num);
        }

        String str = "Ania";

         switch (str) {
            case "horacy":
                System.out.println("horacy");
                System.out.println(" ok");
                break;

            case "Ania":
                System.out.println("Ania");
                System.out.println(" ok");
                break;

            case "grzegorz":
                System.out.println("grzegorz");
                System.out.println(" ok");
            case "jozek":
                System.out.println("jozek");
                System.out.println(" ok");
                break;

            default:
                System.out.println("default: " + str);
        }

        CarVariant car = CarVariant.COMBO;
         switch (car){
             case COMBO:
                 System.out.println(CarVariant.COMBO);
                 break;
             case SEDAN:
                 System.out.println(CarVariant.SEDAN);
                 break;
             default:
                 System.out.println("wyswietli " + car);


         }

        }






    }











