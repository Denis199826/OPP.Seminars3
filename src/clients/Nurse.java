package clients;

import java.time.LocalDate;

public class Nurse extends Staff implements WorkSchedule{
    protected Nurse nurse;
    protected Owner owner;
    protected Animals animals;

    public Nurse(String name, String post, LocalDate age) {
        super(name, post, age);
    }
    public void WorkingWithADoctor(String nameDoctor){
        System.out.println("Медсестра" + name + " работает вместе с доктором " + nameDoctor + ".");
    }

    public void TheNurseFillsOutTheDocuments (){
        System.out.println("Медсестра " + name + " заполняет документы для лечения. ");
    }

    public void dischargeFromTheClinic (){
        System.out.println("Медсестра " + name + " заполняет документы для выписки.");
    }

    @Override
    public String run() {
        return "пн-пт";
    }
}





