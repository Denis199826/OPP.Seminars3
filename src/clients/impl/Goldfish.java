package clients.impl;
import clients.Animals;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;


public class Goldfish extends Animals implements Swimable {
    public Goldfish (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Золотая рыбка ест");
    }


    @Override
    public double swim() {
        return 30;
    }
}