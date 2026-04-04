import java.util.Scanner;

public class FinancialClass {

    static Market market = new Market(); // New object of the Market class has been created - New object of type Market. 

    public static void main(String[] args) {
        Stock[] stocks = new Stock[] { // Object of type Stock.
            new Stock("Microsoft", "Buy", 552.35), // Object of type Stock
            new Stock("Apple", "Hold", 231.52), // ...
            new Stock("Nvidia", "Strong Buy", 250.36),
            new Stock("Amazon", "Buy", 185.00),
            new Stock("Meta Platforms", "Strong Buy", 756.13),
            new Stock("Broadcom", "Buy", 249.25),
            new Stock("Alphabet Class A", "Buy", 180.00),
            new Stock("Palantir", "Buy", 230.00),
            new Stock("Tesla", "Hold", 420.00),
            new Stock("Costco", "Buy", 1080.40)
        }; 
    
    for (int i = 0; i < stocks.length; i++) {
        market.setStock(i, stocks[i]);
    }    
    
    printStock();
    userInput();
    
    }
    
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
        while (status.equals("continue")) {
            System.out.println("\nPlease choose an integer between 0 - 9: ");
            int choice = scanner.nextInt();
            Stock stock = market.getStock(choice);
            System.out.print("Set a new ranking for " + stock.getName() + ": ");
            String ranking = scanner.next();
            stock.setRank(ranking);
            market.setStock(choice, stock);
            printStock();
            System.out.println("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static void printStock() {
        System.out.println("***PORTFOLIO ANALYSIS***");
        System.out.println(market);
    }
}
