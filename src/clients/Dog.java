package clients;
import java.time.LocalDate;


public class Dog extends Animals{
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println("Dogs can't fly");
    }
}
