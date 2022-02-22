public class PetrolPurchase {
    
    private String location;
    private String type;
    private int quantity;
    private double price;
    private double discount;
    
    // Constructor
    public PetrolPurchase(String location, String type, int quantity, int price, int discount){
        this.location=location;
        this.type=type;
        this.quantity = quantity;
        this.price=price;
        this.discount = discount;
    }
    //Getter and Setter methods for every instance variables
    public void setLocation(String location){
        this.location=location;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }
    public int getQuantity(){
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    //Invoice Method
    public double getPurchasePrice(int buyQuantity) {
        double retailPrice = (buyQuantity*this.price);
        double salePrice = retailPrice - (retailPrice*(discount/100));
        return salePrice;
    }
    
}
