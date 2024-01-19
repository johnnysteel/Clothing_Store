import java.util.Arrays;
import java.util.List;
public class MaterialDecorator extends ClothingDecorator {
    // The final material of the customized ClothingItem
    private String material;
    public MaterialDecorator(ClothingItem decoratedItem, String material) {
        // Calling the parent constructor
        super(decoratedItem);
        // Throw an exception if material is not in the list of validMaterials
        List<String> validMaterials = Arrays.asList("Cotton", "Leather", "Silk", "Wool");
        if (!validMaterials.contains(material)) {
            throw new IllegalArgumentException("Illegal material: " + material);
        }
        // If valid, assign this material to the MaterialDecorator
        this.material = material;
    }

    // Adds the material to the item description
    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + ", Material: " + material;
    }
    // Return the price of the ClothingItem based on its material
    @Override
    public double getPrice() {
        if (material.equals("Silk")) {
            return decoratedItem.getPrice() + 3.00;
        } else if (material.equals("Wool")) {
            return decoratedItem.getPrice() + 5.00;
        } else {
            return decoratedItem.getPrice();
        }
    }
}
