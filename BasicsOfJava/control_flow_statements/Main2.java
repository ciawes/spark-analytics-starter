package BasicsOfJava.control_flow_statements;

public class Main2 {
    public static void main(String[] args) {
        int personAge = 18;
        int personWeight = 55;

        if (personAge >= 18 && personWeight >= 50)
           {
            System.out.println("Super spelniasz kazdy z warunkow do oddania krwi");

           }
        else if (personAge < 18 && personWeight < 50 ) {
            //System.out.println("nie spelniasz kategori wiekowej, wymagane 18 lat");
            System.out.println("nie spelniasz zadnego warunku do oddania krwi");

            }
        else if (personAge < 18){
            System.out.println("nie spelniasz kategori wiekowej ktora wymaga min 18 lat");

        }
        else {
            System.out.println("nie spelniasz kategori wagowej ");
        }
    }
}
