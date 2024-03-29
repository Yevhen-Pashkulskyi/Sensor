package sensor;

public class TemperatureObserver extends Observer{
    public TemperatureObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update(int temperature, int weight, String color) {
        System.out.println("Температура: " + temperature);
    }
}
