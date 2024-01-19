public class FullCartState implements CartState {
    
    private Cart cart;

    public FullCartState(Cart cart){
        this.cart = cart;
    }

    @Override
    public void addItem(Item product) {
        cart.addProduct(product);
        System.out.println("Product " + product.getName() + " is added successfuly");
    }

    @Override
    public void removeItem(Item product) {

        cart.removeProduct(product);

        if (cart.isEmpty()) {
            cart.setState(new EmptyCartState(cart));
        }
        System.out.println(product.getName() + " has been removed from the cart successfuly.");


    }

    @Override
    public void checkout() {
        System.out.println("Cart has been checked out successfully");
        cart.setState(new CancelledCartState(cart));
        
    }


    @Override
    public void cancel() {
        cart.setState(new EmptyCartState(cart));
        System.out.println("Shopping cart is being cancelled...");
        
    }

    @Override
    public void displayCart() {
        cart.display();
    }

}