import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Leva", 200, LocalDate.now(), new Owner());
        Bird bird = new Bird("Bird", 20, LocalDate.now(), new Owner());
        Cow cow = new Cow("Cow", 20, LocalDate.now(), new Owner());
        Crucian crucian = new Crucian("Crus", 20, LocalDate.now(), new Owner());
        Dog dogg = new Dog("Fet", 20, LocalDate.now(), new Owner());
        Eagle eagle = new Eagle("Eagle", 20, LocalDate.now(), new Owner());
        Goldfish goldfish = new Goldfish("Gold", 20, LocalDate.now(), new Owner());
        Horse horse = new Horse("Horse", 20, LocalDate.now(), new Owner());

        //System.out.println(puzo);

        List<Animals> animals = new ArrayList<>();
        animals.add(leva);
        animals.add(dogg);
        animals.add(bird);
        animals.add(cow);
        animals.add(crucian);
        animals.add(eagle);
        animals.add(goldfish);
        animals.add(horse);
        //System.out.println(animals);
        dogg.fly();


    }
}