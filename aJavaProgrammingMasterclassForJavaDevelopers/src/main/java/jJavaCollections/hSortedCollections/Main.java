package jJavaCollections.hSortedCollections;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");

        sellItems(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItems(timsBasket, "car", 1);
        System.out.println(timsBasket);

        if(sellItems(timsBasket, "car", 1) != 1)
            System.out.println("There are no more cars in stock");

        sellItems(timsBasket, "spanner", 5);
//        System.out.println(timsBasket);

        sellItems(timsBasket, "juice", 4);
        sellItems(timsBasket, "cup", 12);
        sellItems(timsBasket, "bread", 1);
//        System.out.println(timsBasket);

//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItems(basket,"cup", 100);
        sellItems(basket, "juice", 5);
        removeItems(basket, "cup", 1);
        System.out.println(basket);

        removeItems(timsBasket, "car", 1);
        removeItems(timsBasket, "cup", 9);
        removeItems(timsBasket, "car", 1);
        System.out.println("cars removed: " + removeItems(timsBasket, "car", 1));

        System.out.println(timsBasket);

        removeItems(timsBasket, "bread", 1);
        removeItems(timsBasket, "cup", 3);
        removeItems(timsBasket, "juice", 4);
        removeItems(timsBasket, "cup", 3);
        System.out.println(timsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);
//        for(Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkOut(timsBasket);
        System.out.println(timsBasket);
    }

    public static int sellItems(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItems(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void checkOut(Basket basket) {
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
