public class FurnitureServiceImpl implements IFurniture{

    @Override
    public double calculateDiscountedPrice(Furniture furniture) {
        double discountPercent=0;
        if(furniture.getFurnitureType()==FurnitureType.HOME){
           discountPercent=5;
        }
        if(furniture.getFurnitureType()==FurnitureType.OFFICE){
            discountPercent=10;
        }
        if(furniture.getFurnitureType()==FurnitureType.GARDEN){
             discountPercent=2.5;
        }
        double discountedPrice= furniture.getPrice()-(discountPercent* furniture.getPrice()/100);
        return discountedPrice;
    }

    public Sofa createSofa(FurnitureType furnitureType,String color, double price){
        Sofa sofa=new Sofa(furnitureType,color,price);
        double discountedPrice=calculateDiscountedPrice(sofa);
        sofa.setDiscountedPrice(discountedPrice);
        return sofa;

    }
}
