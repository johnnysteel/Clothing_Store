import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryListTest {

    //unit test to add items to the inventory list 
    @Test
    public void testAddItem() {
        InventoryList inventoryList = InventoryList.getInstance();
        Item item = new Item("Shirt", 20.0);
        inventoryList.addItem(item);
        assertEquals(item, inventoryList.getItem("Shirt"));
    }


    //unit test to remove items from the inventory list 
    @Test
    public void testRemoveItem() {
        InventoryList inventoryList = InventoryList.getInstance();
        Item item = new Item("Shirt", 20.0);
        inventoryList.addItem(item);
        inventoryList.removeItem(item);
        assertNull(inventoryList.getItem("Shirt"));
    }

    
}
