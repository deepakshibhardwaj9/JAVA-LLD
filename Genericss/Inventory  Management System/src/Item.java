public class Item implements Comparable<Item>
{
    private int id;
    private String name;
    private int price;
    private int quantity;

    Item(int id, String name,int price,int quantity)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() throws InvalidQuantityException
    {
        if(quantity<100 || quantity>2000)
        {
            throw  new InvalidQuantityException("Quantity for item you added is not valid...");
        }
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString()
    {
        return "Item: { Id : " +this.id +" , Name : " +this.name +" Price : " +price +" Quantity : " +this.quantity +" }" ;
    }

    @Override
    public int compareTo(Item item)
    {
        return this.price - item.price;
    }



}
