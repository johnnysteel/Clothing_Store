public class EmptyCartState implements CartState {
    
    private Cart cart;

    public EmptyCartState (Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItem(Item product) {
        cart.setState(new FullCartState(cart));
        cart.addProduct(product);
        System.out.println(product.getName() + " added successfully to the cart.");
    }

    @Override
    public void removeItem(Item product) {
        System.out.println("Cannot remove item. Cart is empty.");
    }

    @Override
    public void checkout() {
        System.out.println("Cannot checkout. Cart is empty.");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot cancel. Cart is already empty.");
    }

    @Override
    public void displayCart() {
        System.out.println("Your cart is empty.");
    }

}