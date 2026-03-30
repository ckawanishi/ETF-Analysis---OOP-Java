public class Stock {
    private String name;
    private String rank;
    private double priceTarget;   

public Stock(String name, String rank, double priceTarget) {
    this.name = name;
    this.rank = rank;
    this.priceTarget = priceTarget;
}

public Stock(Stock source) {
    this.name = source.name;
    this.rank = source.rank;
    this.priceTarget = source.priceTarget;
}

public String getName() {
    return name;
}

public String getRank() {
    return rank;
}

public double getPriceTarget() {
    return priceTarget;
}

public void setName(String name) {
    this.name = name;
}

public void setRank(String rank) {
    this.rank = rank;
}

public void setPriceTarget(double priceTarget) {
    this.priceTarget = priceTarget;
}

public String toString() {
    return "\n" + "Asset Name: " + this.name + "\n" + "Price Target: " + this.priceTarget + "\t\t" + "Ranking: " + this.rank;
}

}

