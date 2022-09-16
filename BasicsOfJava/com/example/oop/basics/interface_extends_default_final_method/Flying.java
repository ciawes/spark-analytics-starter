package BasicsOfJava.com.example.oop.basics.interface_extends_default_final_method;

public interface Flying {

    public static final float DEFAULT_WINGSPAN = 0.7f;

    public void fly();

    public default void flyHigher()
    {
        System.out.println("Flying higher ");
    }

    public default float getWingspan()
    {
        return Flying.DEFAULT_WINGSPAN;
    }

    public static int getDefaultNumWings()
    {
        return 2;
    }


}
