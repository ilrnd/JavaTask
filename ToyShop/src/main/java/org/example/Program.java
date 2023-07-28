package org.example;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();
        Toy constructorSell1 = new ToySell(ToyType.CONSTRUCTOR, 10);
        toyShop.put(constructorSell1);
        Toy dollSell1 = new ToySell(ToyType.DOLL, 20);
        toyShop.put(dollSell1);
        dollSell1.setFrequency(6); // change frequency
        Toy dollSell2 = new ToySell(ToyType.DOLL, 3);
        toyShop.put(dollSell2);
        Toy robotSell1 = new ToySell(ToyType.ROBOT, 10);
        toyShop.put(robotSell1);
        System.out.println("###### Toy shop #######");
        toyShop.lookToyShop();

        System.out.println("###### Waiting list #######");

        Toy constructorToyBuy1 = new ToyBuy(ToyType.CONSTRUCTOR);
        Toy dollToyBuy1 = new ToyBuy(ToyType.DOLL);
        Toy robotToyBuy1 = new ToyBuy(ToyType.ROBOT);
        toyShop.choiceToy(constructorToyBuy1);
        toyShop.choiceToy(dollToyBuy1);
        toyShop.choiceToy(robotToyBuy1);
        toyShop.lookChoiceToys();
        Scanner sc = new Scanner(System.in);

            System.out.println("###### Lottery #######");
            toyShop.lotteryToyShop();
            System.out.println("###### NEW Waiting list  #######");
            toyShop.lookChoiceToys();
            System.out.println("###### NEW toyshop #######");
            toyShop.lookToyShop();



    }
}