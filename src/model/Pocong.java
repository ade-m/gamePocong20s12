package model;

public class Pocong extends Lawan implements GauntletThanos,JubahIronman{
    public void jump(){
        name = "Pocong";
        System.out.println("Pocong Lompat-lompat");
       
    }

    @Override
    public void attack(){
        //super(int hp);
        //super.attack();
        System.out.println("Pocong terjatuh dan terluka hatinya");
        
        super.hp-=1;
    }

    @Override
    public void cetakNamaMusuh() {
        // TODO Auto-generated method stub
        System.out.println("ini Pocong");
    }

    @Override
    public void jarvis() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tembakLaser() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void terbang() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void snap() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pindahUniverse() {
        // TODO Auto-generated method stub
        
    }


        //user define class
    
}
