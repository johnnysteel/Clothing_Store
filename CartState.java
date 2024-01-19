public interface CartState {
    
    void addItem(Item product); // Add Product to Shopping cart.
    void removeItem(Item product); // Remove the selected product from shopping cart.
    void checkout(); // Check out all the product in the shopping cart.
    void cancel(); // Cancel the current cart. -> Null
    void displayCart(); // Display all the product in the current cart.


}