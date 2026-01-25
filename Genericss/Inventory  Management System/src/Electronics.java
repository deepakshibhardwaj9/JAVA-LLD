public class Electronics extends Item
{
    private int WarrantyYears;
    public Electronics(int id, String name,int price,int quantity,int warrantyYears)
    {
        super(id,name,price,quantity);
        this.WarrantyYears = warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears)
    {
        WarrantyYears = warrantyYears;
    }

    public int getWarrantyYears()
    {
        return WarrantyYears;
    }
}
