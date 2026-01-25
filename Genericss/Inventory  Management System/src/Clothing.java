public class Clothing extends Item
{
    private String brand;
    Clothing(int id, String name,int price,int quantity, String brand)
    {
        super(id,name,price,quantity);
        this.brand = brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }
}
