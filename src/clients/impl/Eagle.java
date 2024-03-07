package clients.impl;
import clients.Animals;
import clients.Flyable;
import clients.Goable;
import clients.Owner;

import java.time.LocalDate;


public class Eagle extends Animals implements Flyable, Goable {
    public Eagle (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Орел ест");
    }

    @Override
    public double fly() {
        return 22;
    }

    @Override
    public double run() {
        return 2;
    }
}