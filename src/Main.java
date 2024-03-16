import clients.*;
import clients.impl.Dog;
import clients.impl.Eagle;
import clients.impl.Goldfish;
import clients.impl.Horse;
import gb_collections.GbList;
import gb_collections.lists.GbArrayList;
import gb_collections.lists.GbLinkedList;
import pharmacy.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list = new GbLinkedList<>();
        list.add(8);
        list.add(5);
        list.add(34);
        list.add(3003);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        System.out.println(list);
        list.addd(6, 2222);
        System.out.println(list);






//        List<Medicine> med = new ArrayList<>();
////        ArrayList<MedicineComponent> medList = new ArrayList<>();
//
//        MedicineComponent artr = new Asitromin("3", 50f, 23);
//        MedicineComponent penic = new Penicilinium("3", 33f, 12);
//        MedicineComponent vet = new Vetbicid("3", 2f, 44);
//        Medicine medicine1 = new Medicine();
//        medicine1.addComponent(artr).addComponent(penic).addComponent(vet);
//        for(MedicineComponent component : medicine1){
//            System.out.println(component);
//        }
////        Iterator<MedicineComponent> med = medicine1;
////        while (med.hasNext()){
////            System.out.println(med.next());
////        }
//
//        MedicineComponent artr1 = new Asitromin("2", 505f, 263);
//        MedicineComponent penic1 = new Penicilinium("2", 33f, 142);
//        Medicine medicine2 = new Medicine();
//        medicine2.addComponent(artr1).addComponent(penic1);
//        System.out.println("______");
//        for(MedicineComponent component1 : medicine2){
//            System.out.println(component1);
//        }
//
//        MedicineComponent artr3 = new Asitromin("4", 505f, 263);
//        MedicineComponent penic3 = new Penicilinium("4", 33f, 142);
//        MedicineComponent artr4 = new Asitromin("4", 505f, 263);
//        MedicineComponent penic4 = new Penicilinium("4", 33f, 142);
//        Medicine medicine3 = new Medicine();
//        medicine3.addComponent(artr3).addComponent(penic3).addComponent(artr4).addComponent(penic4);;
//        System.out.println("______");
//        for(MedicineComponent component2 : medicine3){
//            System.out.println(component2);
//        }
//
//        MedicineComponent artr5 = new Asitromin("1", 505f, 263);
//        Medicine medicine4 = new Medicine();
//        medicine4.addComponent(artr5);
//        System.out.println("______");
//        for(MedicineComponent component3 : medicine4){
//            System.out.println(component3);
//        }
//        MedicineComponent artr6 = new Asitromin("1.1", 505f, 263);
//        Medicine medicine5 = new Medicine();
//        medicine5.addComponent(artr6);
//        System.out.println("______");
//        for(MedicineComponent component4 : medicine5){
//            System.out.println(component4);
//        }
//
//        List<Medicine> medList1 = new ArrayList<>();
//        medList1.add(medicine2);
//        medList1.add(medicine1);
//        medList1.add(medicine3);
//        medList1.add(medicine4);
//        medList1.add(medicine5);
//        System.out.println(medList1);
//        System.out.println("______");
//        Collections.sort(medList1);
//        System.out.println(medList1);
//        System.out.println("______");
//        Collections.sort(medList1, Comparator.reverseOrder());
//        System.out.println(medList1);







//        medList.add(artr);
//        medList.add(penic);
//        medList.add(vet);
//        System.out.println(medList);
//        //Collections.sort(medList, Comparator.reverseOrder());
//        Collections.sort(medList, (comp1, comp2) -> (int)(comp1.getWeight() - comp2.getWeight()));
//        System.out.println(medList);
//



//        Dog dogg = new Dog("Fet", 20, LocalDate.now(), new Owner());
//        Eagle eagle = new Eagle("Eagle", 20, LocalDate.now(), new Owner());
//        Goldfish goldfish = new Goldfish("Gold", 20, LocalDate.now(), new Owner());
//        Horse horse = new Horse("Horse", 20, LocalDate.now(), new Owner());
//
//        //System.out.println(puzo);
//        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
//        List<Animals> animals = new ArrayList<>();
//        animals.add(dogg);
//        animals.add(eagle);
//        animals.add(goldfish);
//        animals.add(horse);
//        System.out.println(veterinaryClinic);
    }
}