package com.company.es1;

public class HeroIsDeadException extends RuntimeException{
    public HeroIsDeadException(String string){
        super(string);
    }
}