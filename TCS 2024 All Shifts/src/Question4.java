/*

You are provided with a list of sales entries, each entry containing three fields: the name of the item, the price per unit, and the number of units sold. An item can appear multiple times in the list with different units sold each time. Your task is to compute the total sales, the average sales per entry, and identify the best-selling item based on total revenue generated from that item.

Input Format:

You will be given a list of tuples, each tuple containing a string and two floats. The string represents the item name, the first float represents the price per unit, and the second float represents the number of units sold.

Output Format:

Print the total sales rounded to two decimal places.
Print the average sales per entry rounded to two decimal places.
Print the name of the best-selling item based on the total sales.
Constraints:

The list will have at least one entry.
The price per unit will be a positive decimal number.
The units sold will be a non-negative integer
Input:

[ (“Tomato”, 2.0, 3),(“Potato”, 1.5, 10), (“Tomato”, 2.0, 2),(“Carrot”, 1.0, 8),(“Potato”, 1.5, 5)]

Output:

Total Sales: $47.50

Average Sales: $9.50

Best Selling Item: Potato

Explanation:

The total sales are calculated as follows: (2.0×3)+(1.5×10)+(2.0×2)+(1.0×8)+ (1.5×5)=6+15+4+8+7.5

Total Sales: 6.0+15.0+4.0+8.0+7.5=40.5

Average Sales per Entry: 40.5/5=8.10

Best-Selling Item: Potato generates the highest revenue:
Potato = (1.5 × 10) + (1.5 × 5) = 15.0 + 7.5 = 22.50

*/


import java.util.*;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        int n = in.nextInt(); // Read number of entries

        for (int i = 0; i < n; i++)
        {
            String name = in.next();
            double price = in.nextDouble();
            double units = in.nextDouble(); // Ensure `units` is read as double
            items.add(new Item(name, price, units));
        }

        double totalSales = 0.0;
        double maxSales = 0.0;
        String bestItem = "";

        Map<String, Double> salesMap = new HashMap<>();

        // Compute total sales for each item
        for (Item item : items)
        {
            double revenue = item.price * item.units;
            salesMap.put(item.name, salesMap.getOrDefault(item.name, 0.0) + revenue);
        }

        // Compute total sales and determine the best-selling item
        for (Map.Entry<String, Double> entry : salesMap.entrySet())
        {
            totalSales += entry.getValue();
            if (entry.getValue() > maxSales)
            {
                bestItem = entry.getKey();
                maxSales = entry.getValue();
            }
        }

        // Compute the average sales per entry
        double avgSales = totalSales / items.size();

        // ✅ Ensure proper formatting
        System.out.printf("Total Sales: $%.2f%n", totalSales);
        System.out.printf("Average Sales: $%.2f%n", avgSales);
        System.out.println("Best Selling Item: " + bestItem);

        in.close();
    }

    static class Item
    {
        String name;
        double price;
        double units;

        Item(String name, double price, double units)
        {
            this.name = name;
            this.price = price;
            this.units = units;
        }
    }
}



/*

5
Tomato 2.0 3
Potato 1.5 10
Tomato 2.0 2
Carrot 1.0 8
Potato 1.5 5

*/