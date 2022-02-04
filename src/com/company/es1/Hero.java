package com.company.es1;

public class Hero {
    private String name;
    private byte lifePoints;
    private int strength =1;

    public Hero (String name){
        this.name=name;
        this.lifePoints=1;
    }

    public Hero () {

    }

    public void attackHero(Hero enemy){
        if (this.strength > enemy.strength){
            enemy.lifePoints--;
            if(enemy.getLifePoints()==0){
                throw new HeroIsDeadException(enemy.getName() + " hero has been dead");
            }
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void goOnAQuest(){
        this.strength+=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(byte lifePoints) {
        this.lifePoints = lifePoints;
    }
}