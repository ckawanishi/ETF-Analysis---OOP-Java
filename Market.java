import java.util.ArrayList;
import java.util.List;

public class Market {

    private Stock[] stocks; 

    public Market() {
    this.stocks = new Stock[10];
}    

    public Stock getStock(int index) { 
        return new Stock(this.stocks[index]); // copy
}

    public void setStock(int index, Stock stock) {
        this.stocks[index] = new Stock(stock); // copy
}

    public String toString() {
        String temp = "";
        for (Stock stock : stocks) {
            temp += stock.toString() + "\n";
        }
        return temp;
    }    
}
