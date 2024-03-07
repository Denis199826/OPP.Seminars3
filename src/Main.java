import clients.*;
import clients.impl.Dog;
import clients.impl.Eagle;
import clients.impl.Goldfish;
import clients.impl.Horse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dogg = new Dog("Fet", 20, LocalDate.now(), new Owner());
        Eagle eagle = new Eagle("Eagle", 20, LocalDate.now(), new Owner());
        Goldfish goldfish = new Goldfish("Gold", 20, LocalDate.now(), new Owner());
        Horse horse = new Horse("Horse", 20, LocalDate.now(), new Owner());

        //System.out.println(puzo);

        List<Animals> animals = new ArrayList<>();
        animals.add(dogg);
        animals.add(eagle);
        animals.add(goldfish);
        animals.add(horse);
        System.out.println(animals);
    }
}