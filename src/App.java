import model.Burung;
import model.Enemy;
import model.Lawan;
import model.Pocong;
import model.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
        Pocong mumun = new Pocong();
        Zombie x = new Zombie();
        Burung merpati = new Burung();
        Enemy musuh;// = new Pocong();
        //Enemy[] enemies = {new Pocong(),new Zombie(),new Pocong(),new Burung()};
        mumun.attack();
        x.attack();
        merpati.attack();

        mumun.jump();
        x.walk();
        merpati.fly();

        merpati.jump();
        //pilihan
        int pilihan = (int)(Math.round((Math.random()*10))%3);
        System.out.println( pilihan);
        musuh = getEnemies(pilihan);
        //musuh = getEnemies(5);
        musuh.attack();
       
        Enemy AE = new Enemy();
        Lawan AEX = new Pocong();
        Pocong a = (Pocong)AEX;
        a.tembakLaser();
    }
    public static Enemy getEnemies(int pilihan){
        if(pilihan==1) return new Zombie();
        else if(pilihan==2) return new Zombie();
        else return new Burung();
    }
}
