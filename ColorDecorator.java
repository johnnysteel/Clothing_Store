import java.util.Arrays;
import java.util.List;
public class ColorDecorator extends ClothingDecorator {
    // The final color of the customized ClothingItem
    private String color;
    public ColorDecorator(ClothingItem decoratedItem, String color) {
        // Calling the parent constructor
        super(decoratedItem);
        // Throw an exception if color is not in the list of validColors
        List<String> validColors = Arrays.asList("Red", "Blue", "Purple", "Black", "Green");
        if (!validColors.contains(color)) {
            throw new IllegalArgumentException("Illegal color: " + color);
        }
        // If valid, assign this color to the ColorDecorator
        this.color = color;
    }

    // Adds the color to the item description
    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + ", Color: " + color;
    }
    // Return the price of the ClothingItem based on its color
    @Override
    public double getPrice() {
        if (color.equals("Red")) {
            return decoratedItem.getPrice() + 2.00;
        } else if (color.equals("Blue")) {
            return decoratedItem.getPrice() + 3.00;
        } else {
            return decoratedItem.getPrice();
        }
    }
}
