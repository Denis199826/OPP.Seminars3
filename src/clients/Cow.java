package clients;
import java.time.LocalDate;


public class Cow extends Animals{
    public Cow (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void fly(){
        System.out.println("Cows can't fly");
    }

}