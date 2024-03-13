package pharmacy;

public abstract class MedicineComponent implements Comparable<MedicineComponent>{
    private String name;
    private float weight;
    private int power;
    public  MedicineComponent (String name, float weight, int power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(MedicineComponent o) {
        return power - o.power;
        //return name.compareTo(o.name);
//        return Integer.compare(this.power, o.power);
//        if (this.power>o.power){
//            return 1;
//        }else if (this.power<o.power){
//            return -1;
//        } else return 0;
    }

    public String toString(){

        return String.format("name = %s, weight = %s, power = %s",
                name, weight, power);
    }
}