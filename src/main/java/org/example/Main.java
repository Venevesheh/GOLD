package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Gold gold = new Gold("Ring", 1,3_000_000,200_000,
        100_000, 30_000,20_000,
        100_000,70_000);


Gold gold2 = new Gold("barg", 1.6,2_900_000,
        250_000,80_000,100_000,
        20_000, 290_000,0);

gold2.setRawGoldSalePrice(3_100_000);
gold2.setInterest(25);



        System.out.println(gold2.toString());
        System.out.println();
        System.out.println(" : سود خالص  " +(gold2.getFinalSalePrice()-gold2.getTotalPrice()));
        System.out.println(" : هزینه خالص تولید  " + gold2.getWholeMakePrice());

/*
 gold.setRawGoldSalePrice(3_200_000);
gold.setInterest(30);

        System.out.println(gold.toString());
        System.out.println(gold.toStringAll());

        System.out.println("total price: "+gold.getTotalPrice());
        System.out.println(gold.getFinalSalePrice());

 */
    }
}