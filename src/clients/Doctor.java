package clients;

import java.time.LocalDate;

public class Doctor extends Staff implements WorkSchedule{
    protected Nurse nurse;
    protected Owner owner;
    protected Animals animals;
    public Doctor(String name, String post, LocalDate age) {
        super(name, post, age);
    }
    public void diagnosePatient(String animals){
        System.out.println("Доктор " + name + " проводит диагностику " + animals + ".");
    }
    public void prescribeMedicine (String animals, String medicine){
        System.out.println("Доктор " + name + " назначает " + animals + " лечение " + medicine + ".");
    }
    public void dischargeFromTheClinic (){
        System.out.println("Доктор " + name + " выписывает пациента.");
    }

    @Override
    public String run() {
        return "пн-пт";
    }
}
