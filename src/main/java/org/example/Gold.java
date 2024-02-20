package org.example;

public class Gold {
    private String name;
    private double goldWeight;
    private double rawGoldBuyPrice;
    private double stonePrice;
    private double packagePrice;
    private double mekhrajPrice;
    private double abkariPrice;
    private double makePrice;
    private double unPredictedPrice;


    //constructor
    public Gold(String name, double goldWeight, double rawGoldBuyPrice, double stonePrice,
                double packagePrice, double mekhrajPrice, double abkariPrice,
                double makePrice, double unPredictedPrice) {
        this.name = name;
        this.goldWeight = goldWeight;
        this.rawGoldBuyPrice = rawGoldBuyPrice;
        this.stonePrice = stonePrice;
        this.packagePrice = packagePrice;
        this.mekhrajPrice = mekhrajPrice;
        this.abkariPrice = abkariPrice;
        this.makePrice = makePrice;
        this.unPredictedPrice = unPredictedPrice;
    }
    //calculate other properties
    private double totalPrice;
    public double getTotalPrice() {
        return (goldWeight* rawGoldBuyPrice)+stonePrice+packagePrice+mekhrajPrice+abkariPrice+makePrice+unPredictedPrice;
    }
    public double getWholeMakePrice(){
        return packagePrice+mekhrajPrice+abkariPrice+makePrice+unPredictedPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    private double interest;
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest/100;
    }

    public double getFinalSalePrice() {
        return (goldWeight*rawGoldSalePrice*getInterest())+(goldWeight*rawGoldSalePrice)+((stonePrice*2)+(mekhrajPrice*1.5));
    }

    public void setFinalSalePrice(double finalSalePrice) {
        this.finalSalePrice = finalSalePrice;
    }

    private double finalSalePrice;

    public double getRawGoldSalePrice() {
        return rawGoldSalePrice;
    }

    public void setRawGoldSalePrice(double rawGoldSalePrice) {
        this.rawGoldSalePrice = rawGoldSalePrice;
    }

    private double rawGoldSalePrice;

    public Gold(double interest, double rawGoldSalePrice) {
        this.interest = interest;
        this.rawGoldSalePrice = rawGoldSalePrice;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "\nname= '" + name + '\'' +
                ", \ngoldWeight= " + goldWeight +
                ", \ntotalPrice= " + getTotalPrice() +
                ", \ninterest= " + interest +
                ", \nfinalSalePrice= " + getFinalSalePrice() +
                '}';
    }


    public String toStringAll() {
        return "Gold{" +
                "name='" + name + '\'' +
                ", goldWeight=" + goldWeight +
                ", rawGoldBuyPrice=" + rawGoldBuyPrice +
                ", stonePrice=" + stonePrice +
                ", packagePrice=" + packagePrice +
                ", mekhrajPrice=" + mekhrajPrice +
                ", abkariPrice=" + abkariPrice +
                ", makePrice=" + makePrice +
                ", unPredictedPrice=" + unPredictedPrice +
                ", totalPrice=" + totalPrice +
                ", interest=" + interest +
                ", finalSalePrice=" + finalSalePrice +
                ", rawGoldSalePrice=" + rawGoldSalePrice +
                '}';
    }
}
