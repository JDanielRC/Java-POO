//actividad realizada por Juan Daniel Rubio Camacho A01633924
public class Vehicle {

    protected double speed;
    protected int asientos;

    private void setSpeed(double speed) { this.speed = speed;}
    public double getSpeed() { return speed; }

    private void setAsientos(int asientos) { this.asientos = asientos;}
    public int getAsientos() { return asientos; }

    public Vehicle() {
        speed = 100;
        asientos = 4;
    }

    public Vehicle(double speed, int asientos) {
        this.speed = speed;
        this.asientos = asientos;
    }

    public void moving() {
        System.out.println("Moviendome...");
    }
}
