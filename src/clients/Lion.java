package clients;
import java.time.LocalDate;


public class Lion extends Animals{
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println("Lion can't fly");
    }
}
