package com.company.es1;


public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        Hero joker = new Hero("Arthur Fleck");
        Hero batman = new Hero("Batman");

        System.out.println(joker.getStrength());
        System.out.println(batman.getStrength());

        for(int i=0;i<3;i++){
            batman.goOnAQuest();
        }

        System.out.println(batman.getStrength()); //4


        try{
            batman.attackHero(joker);
        }
        catch (HeroIsDeadException e){
            System.out.println("Specific reason: "+ e.getMessage());
        }
    }
}