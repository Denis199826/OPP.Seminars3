package clients;
import java.time.LocalDate;


public class Eagle extends Animals{
    public Eagle (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void swim(){
        System.out.println("Eagles can't swim");
    }

}