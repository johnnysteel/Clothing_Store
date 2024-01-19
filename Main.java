public class Main {

    public static void main(String[] args) {
        // Decorates a Shirt object with color, size, and material
        ClothingItem shirt = new Shirt();
        shirt = new ColorDecorator(shirt, "Red");
        shirt = new SizeDecorator(shirt, "Medium");
        shirt = new MaterialDecorator(shirt, "Silk");

        // Print out the description and price of the shirt
        System.out.println("Item Description: " + shirt.getDescription());
        System.out.println("Price: $" + (String.format("%.2f", shirt.getPrice())));

        // Decorates a Pants object with color, size, and material
        ClothingItem pants = new Pants();
        pants = new ColorDecorator(pants, "Blue");
        pants = new SizeDecorator(pants, "Large");
        pants = new MaterialDecorator(pants, "Wool");

        // Print out the description and price of the pants
        System.out.println("Item Description: " + pants.getDescription());
        System.out.println("Price: $" + (String.format("%.2f", pants.getPrice())));

        // Decorates an accessory with color, size, and material
        ClothingItem accessory = new Accessories();
        accessory = new ColorDecorator(accessory, "Black");
        accessory = new SizeDecorator(accessory, "Large");
        accessory = new MaterialDecorator(accessory, "Leather");

        // Print out the description and price of the accessory
        System.out.println("Item Description: " + accessory.getDescription());
        System.out.println("Price: $" + (String.format("%.2f", accessory.getPrice())));

        InStock inStock = new InStock();
        inStock.addListener(new Website());
        inStock.addItem(new Item ("Black Denim Jeans", 34.99));
        inStock.removeItem(new Item ("Red Fur Coat", 121.00));
        inStock.sale(20);
        inStock.addListener(new Email());
        inStock.sale(50);

        Item item = new Item("T-Shirt", 12.33);
        Item item2 = new Item("Short", 13.1);
        Item item3 = new Item("Hat", 100.2);

        Cart cart = new Cart();
        cart.addItem(item);
        cart.addItem(item2);
        
        cart.removeItem(item2);
        cart.addItem(item3);
        cart.displayCart();
    }
}
