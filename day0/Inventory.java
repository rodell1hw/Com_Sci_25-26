public class Inventory {
    private String itemName;
    private int quantity;
    private int price;

    Inventory(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.price = (int) price;
        this.quantity = quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = (int) price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + (double) (price);
    }

    public boolean equals(Inventory other) {
        if (this.price == other.price && this.quantity == other.quantity && this.itemName.equals(other.itemName)) {
            return true;
        } else {
            return false;
        }
    }

    public void raisePrice(double percentage) {
        double dPrice = (double) price;
        dPrice = dPrice + dPrice * ( percentage / 100);
    }
}
