package sensor;

public class ColorObserver extends Observer{
    public ColorObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update(int temperature, int weight, String color) {
        System.out.println("Колір: " + color);
    }
}
