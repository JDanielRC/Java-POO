//tarea realizada por Daniel Rubio A01663924
public class Runner extends Human{

    private int medals;

    public int getMedals() {return medals;}

    public Runner(double speed, String name, double strength, int medals){
        super(speed, name, strength);
        this.medals = medals;
    }

    public void run(double velocidad){
        super.run(velocidad);
        System.out.println("eh we se murio de tan fast");
    }
}
