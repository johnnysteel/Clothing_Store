public abstract class ClothingDecorator implements ClothingItem {
    // The ClothingItem which is being customized
    public ClothingItem decoratedItem;

    // Constructor
    public ClothingDecorator(ClothingItem decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    // gets the price of the customized ClothingItem
    @Override
    public double getPrice() {
        return decoratedItem.getPrice();
    }

    // gets the description of the customized ClothingItem
    @Override
    public String getDescription() {
        return decoratedItem.getDescription();
    }
}
