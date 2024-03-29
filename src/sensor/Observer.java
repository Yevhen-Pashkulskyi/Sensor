package sensor;

public abstract class Observer {
    protected Substance substance;

    public abstract void update(int temperature, int weight, String color);
}
