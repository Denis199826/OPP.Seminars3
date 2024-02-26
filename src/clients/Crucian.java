package clients;
import java.time.LocalDate;


public class Crucian extends Animals{
    public Crucian (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println("Crucian can't fly");
    }
    public void toGo(){
        System.out.println("Crucian can't walk");
    }
}