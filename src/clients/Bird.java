package clients;
import java.time.LocalDate;


public class Bird extends Animals{
    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void swim(){
        System.out.println("Birds can't swim");
    }

}