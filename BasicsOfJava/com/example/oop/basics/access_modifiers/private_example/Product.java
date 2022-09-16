package BasicsOfJava.com.example.oop.basics.access_modifiers.private_example;

public class Product {
    private String name;

    public Product()
    {
        this.name = "unknown";
    }

    public Product(String name)
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
