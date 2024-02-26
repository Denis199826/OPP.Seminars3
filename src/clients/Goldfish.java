package clients;
import java.time.LocalDate;


public class Goldfish extends Animals{
    public Goldfish (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println("Goldfish can't fly");
    }
    public void toGo(){
        System.out.println("Goldfish can't walk");
    }

}