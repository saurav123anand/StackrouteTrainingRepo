public class Furniture {
    private FurnitureType furnitureType;
    private String color;
    private double price;
    private double discountedPrice;

    public Furniture(FurnitureType furnitureType, String color, double price) {
        this.furnitureType = furnitureType;
        this.color = color;
        this.price = price;
    }

    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
