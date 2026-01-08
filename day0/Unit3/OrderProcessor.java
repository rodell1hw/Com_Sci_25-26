package Unit3;

//I broke a lot of the code into different smaller methods 
// so there wasn't a bunch of things happening in one big method.

// get total
public class OrderProcessor {
    public static double calculateTotal(double price, int quantity) {
        // Calculate item total
        double itemTotal = price * quantity;
        return itemTotal;
    }

    public static int expensiveItemsProcessor(Item item, int premiumCount, String[] expensiveItemsTemp) {
        if (item.getPrice() > 50.0) {
            expensiveItemsTemp[premiumCount] = item.getName();
            premiumCount += 1;
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        } else {
            System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
        }
        return premiumCount;
    }

    public static String[] trimExpensives(int premiumCount, String[] expensiveItemsTemp) {
        String[] newArray = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            newArray[i] = expensiveItemsTemp[i];
        }
        return newArray;
    }

    // new method to calc tax
    public static double calculateTax(double subtotal, double taxRate) {
        double tax = 0;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
        } else {
            tax = 0;
        }
        return tax;
    }

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        // caclculate totals
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();

            // add calculated total (new method) to running total
            subtotal += calculateTotal(price, quantity);

            // Check if expensive using new method
            premiumCount = expensiveItemsProcessor(item, premiumCount, expensiveItemsTemp);

        }

        // Trim premium items to exact size using new method
        String[] expensiveItems = trimExpensives(premiumCount, expensiveItemsTemp);

        // Calculate tax and total
        double tax = calculateTax(subtotal, taxRate);
        double total;

        // calculate total by adding tax using method
        total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }
}