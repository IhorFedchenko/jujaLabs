package lab29;

public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    public float calculatePayment() {
        return this.volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax <= 0){
            return calculatePayment();
        } else return this.volume * rentTax;
    }

}

abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }
}

