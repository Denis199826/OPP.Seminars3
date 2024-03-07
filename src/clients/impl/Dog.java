package clients.impl;
import clients.Animals;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;


public class Dog extends Animals implements Swimable, Goable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public double run() {
        return 20;
    }

    @Override
    public double swim() {
        return 3;
    }
}
