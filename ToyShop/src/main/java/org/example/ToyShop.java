package org.example;

import java.util.*;

public class ToyShop {
    private ArrayList<Toy> toys;

    private ArrayList<Toy> choiceToys = new ArrayList<>();

    public ToyShop() {
        toys = new ArrayList<Toy>();
    }

    public void put(Toy toyPut) {
        boolean flag = false;
        for (Toy toySell :
                toys) {
            if (toySell.getToyType() == toyPut.getToyType()) {
                toySell.setQuantity(toySell.getQuantity() + toyPut.getQuantity());
                flag = true;
            }
        }
        if (!flag) {
            toys.add(toyPut);
        }
    }


    public void lookToyShop() {
        for (Toy toy :
                toys) {
            System.out.println(toy.toString());
        }
    }

    public ArrayList<Toy> choiceToy(Toy choiseToy) {
        choiceToys.add(choiseToy);
        return choiceToys;
    }

    public void lookChoiceToys() {
        for (Toy toy :
                choiceToys) {
            System.out.println(toy.toString());
        }
    }

    public ArrayList<Toy> getChoiceToys() {
        return choiceToys;
    }


    public void lotteryToyShop() {
        int sumFrequency = 0;
        for (Toy toy : toys) {
            sumFrequency += toy.getFrequency();
        }
        int rd = new Random().nextInt(1, sumFrequency + 1);
        int start = 1;
        boolean flag = false;
        int winToy = 0;
        for (Toy toy :
                toys) {
            int count = 0;
            while (count < toy.getFrequency()) {
                if (start == rd && toy.getQuantity() > 0) {
                    for (Toy choiseToy :
                            choiceToys) {
                        if (toy.getToyType() == choiseToy.getToyType()) {
                            System.out.println("ID " + choiseToy.getId() + " win " + toy.getToyType().getTitle());
                            winToy = choiseToy.getId();
                            toy.setQuantity(toy.getQuantity() - 1);
                            FileWriterToy.writeToy(choiseToy.toString());
                        }
                    }
                    flag = true;
                }
                if (flag) break;
                count++;
                start++;

            }
            if (flag) break;
        }
        Iterator<Toy> toyIterator = choiceToys.iterator();
        while (toyIterator.hasNext()) {
            Toy nextToy = toyIterator.next();
            if (nextToy.getId() == winToy){
              toyIterator.remove();
            }
           }
    }
}
