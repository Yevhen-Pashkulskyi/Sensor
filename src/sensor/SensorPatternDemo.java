package sensor;

public class SensorPatternDemo {
    public static void main(String[] args) {
        Substance substance = new Substance();

        // Додаємо спостерігачів
        new TemperatureObserver(substance);
        new WeightObserver(substance);
        new ColorObserver(substance);

        // Змінюємо стан речовини та спостерігаємо зміни
        System.out.println("Перша зміна стану: температура: 0°C, вага: 1 гр., колір: білий");
        substance.setTemperature(0);
        substance.setWeight(1);
        substance.setColor("Білий");

        System.out.println("Друга зміна стану: Температура: 5°C, Вага: 2 гр., Колір: чорний");
        substance.setTemperature(5);
        substance.setWeight(2);
        substance.setColor("Чорний");
    }
}
