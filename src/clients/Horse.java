package clients;
import java.time.LocalDate;


public class Horse extends Animals{
    public Horse (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println("Horse can't fly");
    }
}