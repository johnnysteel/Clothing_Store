import java.util.Arrays;
import java.util.List;
public class SizeDecorator extends ClothingDecorator {
    // The final size of the customized ClothingItem
    private String size;
    public SizeDecorator(ClothingItem decoratedItem, String size) {
        // Calling the parent constructor
        super(decoratedItem);
        // Throw an exception if size is not in the list of validSizes
        List<String> validSizes = Arrays.asList("Small", "Medium", "Large");
        if (!validSizes.contains(size)) {
            throw new IllegalArgumentException("Illegal size: " + size);
        }
        // If valid, assign this size to the SizeDecorator
        this.size = size;
    }

    // Adds the size to the item description
    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + ", Size: " + size;
    }
    // Return the price of the ClothingItem based on its size
    @Override
    public double getPrice() {
        if (size.equals("Medium")) {
            return decoratedItem.getPrice() + 2.00;
        } else if (size.equals("Large")) {
            return decoratedItem.getPrice() + 4.50;
        } else {
            return decoratedItem.getPrice();
        }
    }
}
