import java.util.ArrayList;
import java.util.List;

public class InventoryList {
    private static InventoryList instance = null;
    private List<Item> itemList;

    private InventoryList() {
        itemList = new ArrayList<>();
    }

    public static InventoryList getInstance() {
        if (instance == null) {
            instance = new InventoryList();
        }
        return instance;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public Item getItem(String itemName) {
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(Item item) {
        for (int i = 0; i < itemList.size(); i++) {
            Item currentItem = itemList.get(i);
            if (currentItem.getName().equals(item.getName())) {
                itemList.set(i, item);
                break;
            }
        }
    }
}

