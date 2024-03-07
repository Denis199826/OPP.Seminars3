package clients.impl;
import clients.Animals;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;


public class Horse extends Animals implements Goable, Swimable {
    public Horse (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public double run() {
        return 40;
    }

    @Override
    public double swim() {
        return 3;
    }
}