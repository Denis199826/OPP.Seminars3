package clients;
import java.time.LocalDate;

public class Animals {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;
    public Animals(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public void lifeCycle(){
        wakeup(14);
        eat();
        play();
        sleep();
    }
    public void toGo (){
            System.out.println(getType() + " to go");
    }
    public void fly (){
        System.out.println(getType() + " fly");
    }
    public void swim (){
        System.out.println(getType() + " swim");
    }
    private void sleep (){
        System.out.println(getType() + " is sleeping");
    }
    private void wakeup(){
        System.out.println(getType() + " waked up");
    }
    private void wakeup(int time){
        System.out.println(getType() + " waked up" + time);
    }
    private void eat(){
        System.out.println(getType() + "  eat");
    }
    private void play(){
        System.out.println(getType() + "  play");
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString(){

        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, age, owner);
    }
}
