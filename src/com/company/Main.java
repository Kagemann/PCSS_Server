package com.company;

public class Main {

    public static void main(String[] args) {
        DevelopmentCard developmentCard = new DevelopmentCard();
        developmentCard.add(4,0,3);
        System.out.println(developmentCard.getUnplayed());
        System.out.println(developmentCard.getTotal());



    }
}
