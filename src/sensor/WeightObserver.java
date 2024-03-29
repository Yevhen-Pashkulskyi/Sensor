package sensor;

public class WeightObserver extends Observer{
    public WeightObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update(int temperature, int weight, String color) {
        System.out.println("Вага: " + weight + " гр.");
    }
}
