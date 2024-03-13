package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>,Iterable<MedicineComponent>, Comparable<Medicine>{
    private List<MedicineComponent> components;
    private int index;
    public Medicine(){
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medicine addComponent (MedicineComponent component){
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        // return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
        //return components.iterator().next();
        return components.get(index++);
    }
    public String toString(){

        return String.format("components = %s, index = %s",
                components, index);
    }

    @Override
    public int compareTo(Medicine o) {
        return components.size() - o.components.size();

    }
    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }
}
