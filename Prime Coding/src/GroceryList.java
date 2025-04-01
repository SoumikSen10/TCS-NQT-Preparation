/*

You are given a grocery list which consists of three parameters
Item, quantity, price

Your task is to find
--> Higher selling item
--> Total selling item (upto 2 decimal points)
--> Average selling item (upto 2 decimal points)

I/P : 3
      apple, 1.0, 5
      orange, 10.0, 5
      apple, 10.0, 5

O/P : apple
      105.0
      35.0

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Order> groceryList = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            String item = in.next();
            double quantity = in.nextDouble();
            double price = in.nextDouble();

            groceryList.add(new Order(item,quantity,price));
        }

        String hSaleItem = "";
        double totalSale = 0.0, avgSale = 0.0, currSale=0.0;

        for(Order order : groceryList)
        {
            totalSale = totalSale + (order.price * order.quantity);

            if(order.price * order.quantity >= currSale)
            {
                currSale = order.price * order.quantity;
                hSaleItem = order.item;
            }
        }

        avgSale = totalSale / groceryList.size();

        System.out.println(hSaleItem);
        System.out.println(totalSale);
        System.out.print(avgSale);

    }
}

class Order
{
    String item;
    double quantity;
    double price;

    Order(String item, double quantity, double price)
    {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }
}
