
public class InventoryItem {
	private String transactionType;
    private String inventoryNumber;
    private String productName;
    private String productCompany;
    private String itemCategory;
    private String itemType;
    private String size1;
    private String size2;
    private int priceOrig;
    private int priceDiscounted;
    private int quantityAvailable;
    private String seller;
    
    public InventoryItem() { //Default constructor
    	transactionType = null;
    	inventoryNumber = null;
    	productName = null;
    	productCompany = null;
    	itemCategory = null;
    	itemType = null;
    	size1 = null;
    	size2 = null;
    	priceOrig = 0;
    	priceDiscounted = 0;
    	quantityAvailable = 0;
    	seller = null;
	}
    
    public InventoryItem(String transactionType, String inventoryNumber, String productName, String productCompany, String itemCategory, 
    		String itemType, String size1, String size2, int priceOrig, int priceDiscounted, int quantityAvailable, String seller) {
    
    	this.transactionType = transactionType;
    	this.inventoryNumber = inventoryNumber;
    	this.productName = productName;
    	this.productCompany = productCompany;
    	this.itemCategory = itemCategory;
    	this.itemType = itemType;
    	this.size1 = size1;
    	this.size2 = size2;
    	this.priceOrig = priceOrig;
    	this.priceDiscounted = priceDiscounted;
    	this.quantityAvailable = quantityAvailable;
    	this.seller = seller;
    }
    
    //Getters and setters to work with those variables
    
    //Setters
	public void setTransactionType(String transactionType) { 
  		this.transactionType = transactionType; 
  	}
    
  	public void setInventoryNumber(String inventoryNumber) { 
  		this.inventoryNumber = inventoryNumber; 
  	}
  	
  	public void setProductName(String productName) { 
  		this.productName = productName; 
  	}
  	
  	public void setProductCompany(String productCompany) { 
  		this.productCompany = productCompany; 
  	}
  	
  	public void setItemCategory(String itemCategory) { 
  		this.itemCategory = itemCategory; 
  	}
  	
  	public void setItemType(String itemType) { 
  		this.itemType = itemType; 
  	}
  	
  	public void setSize1(String size1) { 
  		this.size1 = size1; 
  	}
  	
  	public void setSize2(String size2) { 
  		this.size2 = size2; 
  	}
  	
  	public void setpriceOrig(int priceOrig) { 
  		this.priceOrig = priceOrig; 
  	}
  	
  	public void setPriceDiscounted(int priceDiscounted) {
  		this.priceDiscounted = priceDiscounted; 
  	}
  	
  	public void setQuantityAvailable(int quantityAvailable) {
  		this.quantityAvailable = quantityAvailable; 
  	}
  	
  	public void setSeller(String seller) { 
  		this.seller = seller; 
  	}
  	
  	
  	//Getters
  	public String getTransactionType() { 
  		return this.transactionType; 
  	}
  	  	
  	public String getInventoryNumber() { 
  		return this.inventoryNumber; 
  	}
  	
  	public String getProductName() { 
  		return this.productName; 
  	}
  	
  	public String getProductCompany() { 
  		return this.productCompany; 
  	}
  	
  	public String getItemCategory() { 
  		return this.itemCategory; 
  	}
  	
  	public String getItemType() { 
  		return this.itemType; 
  	}
  	
  	public String getSize1() { 
  		return this.size1; 
  	}
  	
  	public String getSize2() { 
  		return this.size2; 
  	}
  	
  	public int getPriceOrig() {
  		return this.priceOrig; 
  	}
  	
	public int getPriceDiscounted() {
  		return this.priceDiscounted; 
  	}
	
	public int getQuantityAvailable() {
  		return this.quantityAvailable; 
  	}
  	
	public String getSeller() { 
  		return this.seller; 
  	}
	
    public String toString() {
        return transactionType + "|" + inventoryNumber + "|" + productName + "|" + productCompany + "|" + itemCategory + "|" + 
        itemType + "|" + size1 + "|" + size2 + "|" + priceOrig + "|" + priceDiscounted + "|" + quantityAvailable + "|" + seller;
    }

}
