import java.util.HashMap;
import java.util.Map.Entry;

public class InventoryCommands {

    private HashMap<String, InventoryItem> inventoryMap;
    
    public InventoryCommands() {
        this.inventoryMap = new HashMap<>();
    }
    
	
	// ADD/DELETE/MODIFY/SEARCH/PRINT methods
	
    // Method to add an item to the inventory
    public void add(InventoryItem item) {
        inventoryMap.put(item.getInventoryNumber(), item);
    }

    // Method to delete an item from the inventory
    public void delete(String inventoryNumber) {
        inventoryMap.remove(inventoryNumber);
    }

    // Method to modify an item in the inventory
    public void modify(String inventoryNumber, InventoryItem newItem) {
    	
    	if (inventoryMap.containsKey(inventoryNumber)) {
    		inventoryMap.put(inventoryNumber, newItem);
    	}
    	
    	else {
    		System.out.println("Inventory Number not found: " + inventoryNumber);
    	}
    }

  
    // Method to search for an item in the inventory
    public InventoryItem search(String inventoryNumber) {
    	if (inventoryMap.containsKey(inventoryNumber)) {
    		return inventoryMap.get(inventoryNumber);
    	}
		return null; 	
    }
    
	
    //Method to print the item in the inventory
    public void print(InventoryItem printItem) {
        
        for (Entry<String, InventoryItem> entry : inventoryMap.entrySet()) {
            InventoryItem item = entry.getValue();
            if (item.equals(printItem)) {
                System.out.println(item.toString());
                break;
            }   
    
        }
        
    }
}
