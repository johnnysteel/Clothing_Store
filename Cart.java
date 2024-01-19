import java.util.ArrayList;
import java.util.List;

public class Cart {
    
    private List<Item> products;
    private CartState state;


    public Cart() {
        products = new ArrayList<>();
        state = new EmptyCartState(this); // Initialize the cart -> Empty 
    
    }

    public void setState(CartState state) {
        this.state = state;
    }

    public void addItem(Item product) {

        state.addItem(product);

    }

    public void removeItem(Item product){
        state.removeItem(product);
    }

    public void checkOut() {
        state.checkout();
    }

    public void cancel() {

        state.cancel();

    }

    public void displayCart() {
        state.displayCart();
    }

    public void addProduct(Item product) {
        products.add(product);
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public void removeProduct(Item product) {
        products.remove(product);
    }

    public void display() {
        if (products.isEmpty()) {
            System.out.println("Error: Shopping Cart is empty.");
        }
        else {
            System.out.println("Shopping Cart contains: ");
            for(Item product : products) {
                System.out.println(product.getName());
            }
        }

    }


}