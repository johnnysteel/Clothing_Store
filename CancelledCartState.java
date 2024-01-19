public class CancelledCartState implements CartState {
    private Cart cart;

    public CancelledCartState(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItem(Item product) {
        System.out.println("Error: Unable to add product...");
        System.out.println("Cart Cancelled...");
    }

    @Override
    public void removeItem(Item product) {
        System.out.println("Error: Unable to remove product...");
        System.out.println("Cart Cancelled...");
    }

    @Override
    public void checkout() {
        System.out.println("Error: Unable to checkout product...");
        System.out.println("Cart Cancelled...");
    }

    @Override
    public void cancel() {
        System.out.println("Error: Unable to complete task.");
        System.out.println("Cart has already been cancelled.");
    }

    @Override
    public void displayCart() {
        System.out.println("Error: Unable to display the task.");
        System.out.println("Cart has been cancelled.");
    }
}