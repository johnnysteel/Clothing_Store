public class Pants implements ClothingItem {
    // Implements the getPrice and getDescription methods
    @Override
    public double getPrice() {
        return 19.99;
    }
    @Override
    public String getDescription() {
        return "A Pair of Pants";
    }
}
