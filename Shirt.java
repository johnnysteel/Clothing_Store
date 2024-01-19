public class Shirt implements ClothingItem {
    // Implements the getPrice and getDescription methods
    @Override
    public double getPrice() {
        return 9.99;
    }
    @Override
    public String getDescription() {
        return "Regular Shirt";
    }
}
