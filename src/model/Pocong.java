package model;

public class Pocong extends Enemy{
    public void jump(){
        name = "Pocong";
        System.out.println("Pocong Lompat-lompat");
       
    }

    @Override
    public void attack(){
        //super(int hp);
        super.attack();
        System.out.println("Pocong terjatuh dan terluka hatinya");
        hp-=1;
    }

        //user define class
    
}
